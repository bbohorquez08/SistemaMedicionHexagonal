package es.rbailen.sample.hexagonalarchitecture.domain.model;

public abstract class Sensor {
    /**
     * Atributos 
     */
    
    /**
     * Constructor
     */
    public Sensor(){
        
    }
    
    /**
     * Métodos
     * @param product
     * @param tipo
     * @param altura
     * @param ancho
     * @param peso
     * @return 
     */
    public abstract ItemMedicionElemento recoleccionDatos(ItemMedicionElemento product,String tipo,
            float altura, float ancho, float peso);
}
