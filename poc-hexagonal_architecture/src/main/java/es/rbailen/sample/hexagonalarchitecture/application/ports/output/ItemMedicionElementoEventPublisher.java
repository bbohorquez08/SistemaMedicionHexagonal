package es.rbailen.sample.hexagonalarchitecture.application.ports.output;

import es.rbailen.sample.hexagonalarchitecture.domain.event.ItemMedicionElementoCreatedEvent;

public interface ItemMedicionElementoEventPublisher {

    void publishItemMedicionElementoCreatedEvent(ItemMedicionElementoCreatedEvent event);

}
