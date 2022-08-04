package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.eventlistener;

import es.rbailen.sample.hexagonalarchitecture.domain.event.ItemMedicionElementoCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ItemMedicionElementoEventListenerAdapter {

    @EventListener
    public void handle(ItemMedicionElementoCreatedEvent event){
        log.info("Product created with id " + event.getReferencia() + " at " + event.getDate());
    }

}
