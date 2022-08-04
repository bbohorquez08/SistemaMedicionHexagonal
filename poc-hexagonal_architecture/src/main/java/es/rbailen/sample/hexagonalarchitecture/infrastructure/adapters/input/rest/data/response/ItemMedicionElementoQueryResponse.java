package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemMedicionElementoQueryResponse {

    private long referencia;
    private String tipo; 
    private String nombre;
    private String estado; 
    private float altura;
    private float ancho;
    private float peso;

}
