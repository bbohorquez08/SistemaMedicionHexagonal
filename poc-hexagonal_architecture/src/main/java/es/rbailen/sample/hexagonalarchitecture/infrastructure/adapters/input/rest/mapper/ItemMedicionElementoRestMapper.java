package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.mapper;

import es.rbailen.sample.hexagonalarchitecture.domain.model.ItemMedicionElemento;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ItemMedicionElementoQueryResponse;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request.ItemMedicionElementoCreateRequest;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ItemMedicionElementoCreateResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ItemMedicionElementoRestMapper {

    ItemMedicionElemento toItemMedicionElemento(ItemMedicionElementoCreateRequest productCreateRequest);

    ItemMedicionElementoCreateResponse toItemMedicionElementoCreateResponse(ItemMedicionElemento product);

    ItemMedicionElementoQueryResponse toItemMedicionElementoQueryResponse(ItemMedicionElemento product);

}
