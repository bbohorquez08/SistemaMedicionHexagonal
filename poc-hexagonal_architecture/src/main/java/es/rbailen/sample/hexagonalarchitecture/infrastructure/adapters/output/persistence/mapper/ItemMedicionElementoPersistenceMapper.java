package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper;

import es.rbailen.sample.hexagonalarchitecture.domain.model.ItemMedicionElemento;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ItemMedicionElementoEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ItemMedicionElementoPersistenceMapper {

    ItemMedicionElementoEntity toItemMedicionElementoEntity(ItemMedicionElemento product);

    ItemMedicionElemento toItemMedicionElemento(ItemMedicionElementoEntity productEntity);

}
