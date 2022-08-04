package es.rbailen.sample.hexagonalarchitecture.application.ports.input;

import es.rbailen.sample.hexagonalarchitecture.domain.model.ItemMedicionElemento;

public interface GetItemMedicionElementoUseCase {

    ItemMedicionElemento getItemMedicionElementoById(Long id);

}
