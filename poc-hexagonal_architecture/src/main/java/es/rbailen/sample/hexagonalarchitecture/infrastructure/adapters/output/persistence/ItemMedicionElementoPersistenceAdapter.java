package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence;

import es.rbailen.sample.hexagonalarchitecture.application.ports.output.ItemMedicionElementoOutputPort;
import es.rbailen.sample.hexagonalarchitecture.domain.model.ItemMedicionElemento;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ItemMedicionElementoEntity;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper.ItemMedicionElementoPersistenceMapper;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.repository.ItemMedicionElementoRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ItemMedicionElementoPersistenceAdapter implements ItemMedicionElementoOutputPort {

    private final ItemMedicionElementoRepository productRepository;

    private final ItemMedicionElementoPersistenceMapper productPersistenceMapper;

    @Override
    public ItemMedicionElemento saveItemMedicionElemento(ItemMedicionElemento product) {
        ItemMedicionElementoEntity productEntity = productPersistenceMapper.toItemMedicionElementoEntity(product);
        productEntity = productRepository.save(productEntity);
        return productPersistenceMapper.toItemMedicionElemento(productEntity);
    }

    @Override
    public Optional<ItemMedicionElemento> getItemMedicionElementoById(Long id) {
        Optional<ItemMedicionElementoEntity> productEntity = productRepository.findById(id);

        if(productEntity.isEmpty()) {
            return Optional.empty();
        }

        ItemMedicionElemento product = productPersistenceMapper.toItemMedicionElemento(productEntity.get());
        return Optional.of(product);
    }

}
