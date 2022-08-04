package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemMedicionElementoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long referencia;
    private String tipo; 
    private String nombre;
    private String estado; 
    private float altura;
    private float ancho;
    private float peso;


}
