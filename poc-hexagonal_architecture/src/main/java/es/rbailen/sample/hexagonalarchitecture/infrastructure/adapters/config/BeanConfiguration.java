package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.config;

import es.rbailen.sample.hexagonalarchitecture.domain.service.ItemMedicionElementoService;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.eventpublisher.ItemMedicionElementoEventPublisherAdapter;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.ItemMedicionElementoPersistenceAdapter;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper.ItemMedicionElementoPersistenceMapper;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.repository.ItemMedicionElementoRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfiguration {

    @Bean
    
    public ItemMedicionElementoPersistenceAdapter itemMedicionElementoPersistenceAdapter(ItemMedicionElementoRepository itemMedicionElementoRepository, ItemMedicionElementoPersistenceMapper itemMedicionElementoPersistenceMapper) {
        return new ItemMedicionElementoPersistenceAdapter(itemMedicionElementoRepository, itemMedicionElementoPersistenceMapper);
    }

    @Bean
    
    public ItemMedicionElementoEventPublisherAdapter itemMedicionElementoEventPublisherAdapter(ApplicationEventPublisher applicationEventPublisher) {
        return new ItemMedicionElementoEventPublisherAdapter(applicationEventPublisher);
    }

    @Bean
    
    public ItemMedicionElementoService itemMedicionElementoService(ItemMedicionElementoPersistenceAdapter itemMedicionElementoPersistenceAdapter, ItemMedicionElementoEventPublisherAdapter itemMedicionElementoEventPublisherAdapter) {
        return new ItemMedicionElementoService(itemMedicionElementoPersistenceAdapter, itemMedicionElementoEventPublisherAdapter);
    }

}
