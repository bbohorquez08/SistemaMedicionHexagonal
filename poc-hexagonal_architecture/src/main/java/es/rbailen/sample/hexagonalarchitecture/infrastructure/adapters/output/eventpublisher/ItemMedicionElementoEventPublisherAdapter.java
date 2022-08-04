package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.eventpublisher;

import es.rbailen.sample.hexagonalarchitecture.application.ports.output.ItemMedicionElementoEventPublisher;
import es.rbailen.sample.hexagonalarchitecture.domain.event.ItemMedicionElementoCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@RequiredArgsConstructor
public class ItemMedicionElementoEventPublisherAdapter implements ItemMedicionElementoEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void publishItemMedicionElementoCreatedEvent(ItemMedicionElementoCreatedEvent event) {
        applicationEventPublisher.publishEvent(event);
    }

}
