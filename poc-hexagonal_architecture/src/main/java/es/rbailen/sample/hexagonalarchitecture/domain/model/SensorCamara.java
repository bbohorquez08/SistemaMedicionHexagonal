package es.rbailen.sample.hexagonalarchitecture.domain.model;

public class SensorCamara extends Sensor {
    private ItemMedicionElemento elemento;
    
    public ItemMedicionElemento getElemento() {
        return elemento;
    }

    public void setElemento(ItemMedicionElemento elemento) {
        this.elemento = elemento;
    }

    public SensorCamara(ItemMedicionElemento elemento){
        this.elemento = elemento;
    }
    
    @Override
    public ItemMedicionElemento recoleccionDatos(ItemMedicionElemento elemento, String tipo, 
            float altura, float ancho, float peso){
        
        //long ref = (long)Math.random()*100;
        //elemento.setReferencia(ref);
        elemento.setTipo(tipo);
        elemento.setAltura(altura);
        elemento.setAncho(ancho);
        elemento.setPeso(peso);
       
        
        
        
        return elemento;
    }
}
