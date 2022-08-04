package es.rbailen.sample.hexagonalarchitecture.application.ports.output;

import es.rbailen.sample.hexagonalarchitecture.domain.model.ItemMedicionElemento;

import java.util.Optional;

public interface ItemMedicionElementoOutputPort {

    ItemMedicionElemento saveItemMedicionElemento(ItemMedicionElemento product);

    Optional<ItemMedicionElemento> getItemMedicionElementoById(Long id);

}
