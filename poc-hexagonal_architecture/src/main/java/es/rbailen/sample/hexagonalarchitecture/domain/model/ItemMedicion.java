package es.rbailen.sample.hexagonalarchitecture.domain.model;

import java.util.ArrayList;

public abstract class ItemMedicion {
    
    
    public abstract ProcesoElemento procesarMedicion(ProcesoElemento proceso,
        float altura, float ancho, float peso);
    public abstract ItemMedicionElemento recoleccionDatos(ItemMedicionElemento product,
    float altura, float ancho, float peso);
    public abstract void transformacionDatos();
    public abstract boolean clasificacionElemento(ArrayList<Float> lstComparaciones);
    public abstract void definirAccion();
    public abstract Sensor leerSensor(Sensor sensor);
    public abstract ArrayList<Float> analisisDatos(ItemMedicionElemento product);
    public abstract ArrayList<Float> compararValores(ItemMedicionElemento product);
    public abstract ArrayList<Float> cargarValoresIdeales();
    
    
}
