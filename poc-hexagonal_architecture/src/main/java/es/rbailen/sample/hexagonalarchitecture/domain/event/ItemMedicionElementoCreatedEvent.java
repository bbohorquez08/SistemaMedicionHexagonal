package es.rbailen.sample.hexagonalarchitecture.domain.event;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemMedicionElementoCreatedEvent {

    private Long referencia;

    private LocalDateTime date;

    public ItemMedicionElementoCreatedEvent(Long referencia) {
        this.referencia = referencia;
        this.date = LocalDateTime.now();
    }

}

