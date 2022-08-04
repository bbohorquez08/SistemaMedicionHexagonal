package es.rbailen.sample.hexagonalarchitecture.domain.service;

import es.rbailen.sample.hexagonalarchitecture.application.ports.input.GetItemMedicionElementoUseCase;
import es.rbailen.sample.hexagonalarchitecture.application.ports.output.ItemMedicionElementoEventPublisher;
import es.rbailen.sample.hexagonalarchitecture.application.ports.output.ItemMedicionElementoOutputPort;
import es.rbailen.sample.hexagonalarchitecture.domain.event.ItemMedicionElementoCreatedEvent;
import es.rbailen.sample.hexagonalarchitecture.domain.exception.ItemMedicionElementoNotFound;
import es.rbailen.sample.hexagonalarchitecture.domain.model.ItemMedicionElemento;
import es.rbailen.sample.hexagonalarchitecture.application.ports.input.CreateItemMedicionElementoUseCase;
import lombok.AllArgsConstructor;

//import java.util.Optional;

@AllArgsConstructor
public class ItemMedicionElementoService implements CreateItemMedicionElementoUseCase, GetItemMedicionElementoUseCase {

    private final ItemMedicionElementoOutputPort itemMedicionElementoOutputPort;

    private final ItemMedicionElementoEventPublisher itemMedicionElementoEventPublisher;

    @Override
    public ItemMedicionElemento createItemMedicionElemento(ItemMedicionElemento product) {
        product = itemMedicionElementoOutputPort.saveItemMedicionElemento(product);
        itemMedicionElementoEventPublisher.publishItemMedicionElementoCreatedEvent(new ItemMedicionElementoCreatedEvent(product.getReferencia()));
        return product;
    }

    @Override
    public ItemMedicionElemento getItemMedicionElementoById(Long id) {
        return itemMedicionElementoOutputPort.getItemMedicionElementoById(id).orElseThrow(() -> new ItemMedicionElementoNotFound("Product not found with id " + id));
    }

}
