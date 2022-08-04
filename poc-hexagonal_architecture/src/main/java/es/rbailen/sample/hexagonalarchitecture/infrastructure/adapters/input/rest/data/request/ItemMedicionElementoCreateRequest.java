package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemMedicionElementoCreateRequest {

    
    @NotEmpty(message = "Tipo may not be empty")
    private String tipo; 
    @NotEmpty(message = "Nombre may not be empty")
    private String nombre;
    //@NotEmpty(message = "Estado may not be empty")
    //private String estado; 
    private float altura;
    
    private float ancho;
    
    private float peso;

}
