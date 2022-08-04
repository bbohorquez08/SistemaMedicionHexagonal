package es.rbailen.sample.hexagonalarchitecture.domain.model;

import java.util.ArrayList;

public class ProcesoElemento extends ItemMedicion {
    /*Atributos*/
    private ItemMedicionElemento elemento;
    //private String idProcess;
    
    
    //COSNTRUCTORES
    public ProcesoElemento(){}
    
    public ProcesoElemento(ItemMedicionElemento elemento){
        this.elemento = elemento;
        
    }
    
    //GETTERS AND SETTERS
    public ItemMedicionElemento getElemento() {
        return elemento;
    }

    public void setElemento(ItemMedicionElemento elemento) {
        this.elemento = elemento;
    }
    @Override
    public ProcesoElemento procesarMedicion(ProcesoElemento proceso,
        float altura, float ancho, float peso){

        ArrayList<Float> lstErrores = new ArrayList<>();
        ArrayList<Float> lstValoresReales = new ArrayList<>();
        ArrayList<Float> lstValoresIdeales = new ArrayList<>();
        
        
        //1. Recolectar datos (agregamos el sensor y el actuador)
        //elemento = recoleccionDatos(elemento);
        proceso.setElemento(recoleccionDatos(proceso.getElemento(),altura,ancho,peso));
        
        //2. Analisis de datos y transformación de datos 
        //analisisDatos(cerveza);
        lstValoresReales=analisisDatos(proceso.getElemento());
        proceso.getElemento().setLstValoresReales(lstValoresReales);
        lstValoresIdeales=cargarValoresIdeales();
        proceso.getElemento().setLstValoresIdeales(lstValoresIdeales);
        
        //3. Compara los valores 
        //lstErrores = compararValores();
        lstErrores=compararValores(proceso.getElemento());
        
        //4. Clasificación de los elementos 
        //cerveza = clasificarElemento(cerveza, lstErrores);
        boolean clasificacion=clasificacionElemento(lstErrores);
        if(clasificacion){
            proceso.getElemento().setEstado("Optimo");
        }else{
            proceso.getElemento().setEstado("Defectuoso");
            
        }
        //return cerveza;
        return proceso;
    }

    @Override
    public ArrayList<Float> analisisDatos(ItemMedicionElemento product) {

        ArrayList<Float> lstValoresReales = new ArrayList<>();
        lstValoresReales.add(product.getAltura());
        lstValoresReales.add(product.getAncho());
        lstValoresReales.add(product.getPeso());
        return lstValoresReales;
    }

    @Override
    public ArrayList<Float> cargarValoresIdeales() {
        ArrayList<Float> lstValoresIdeales = new ArrayList<>();
        float alturaIdeal=12.22f;
        float anchoIdeal=5.24f;
        float pesoIdeal=0.33f;
        
        lstValoresIdeales.add(alturaIdeal);
        lstValoresIdeales.add(anchoIdeal);
        lstValoresIdeales.add(pesoIdeal);
        return lstValoresIdeales;
    }

    @Override
    public boolean clasificacionElemento(ArrayList<Float> lstComparaciones) {
        boolean bandera=false;
        if (lstComparaciones.get(0) <= 0.04 && lstComparaciones.get(1) <= 0.04 && lstComparaciones.get(2) <= 0.04) {
            bandera=true;
        }
        return bandera;
    }

    @Override
    public ArrayList<Float> compararValores(ItemMedicionElemento product) {
        ArrayList<Float> lstErrores = new ArrayList<>();
        float errorAltura = 0.0f;
        float errorAncho = 0.0f;
        float errorPeso = 0.0f;
        for (int i = 0; i<product.getLstValoresReales().size(); i+=3) {
            //En este caso se tuvo una tolerancia de error en los valores reales con 
            //respecto a los ideales de un 4%.  
            errorAltura = Math.abs((product.getLstValoresIdeales().get(i) -product.getLstValoresReales().get(i))/(product.getLstValoresIdeales().get(i)));
            //System.out.println("error altura es: "+errorAltura);
            
            
            errorAncho = Math.abs((product.getLstValoresIdeales().get(i+1) -product.getLstValoresReales().get(i+1))/(product.getLstValoresIdeales().get(i+1)));
            //System.out.println("error ancho es: "+errorAncho);
            errorPeso = Math.abs((product.getLstValoresIdeales().get(i+2) -product.getLstValoresReales().get(i+2))/(product.getLstValoresIdeales().get(i+2)));
        }  
        //System.out.println("error peso es: "+errorPeso);
        lstErrores.add(errorAltura);
        lstErrores.add(errorAncho);
        lstErrores.add(errorPeso);
        
        return lstErrores;
    }

    @Override
    public void definirAccion() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Sensor leerSensor(Sensor sensor) {
        // TODO Auto-generated method stub
        return sensor;
    }

    

    @Override
    public ItemMedicionElemento recoleccionDatos(ItemMedicionElemento elemento, float altura, float ancho, float peso) {
        SensorCamara objCamara = new SensorCamara(elemento);
        objCamara = (SensorCamara) leerSensor(objCamara); 
        elemento = objCamara.recoleccionDatos(elemento, elemento.getTipo(), altura, ancho, peso);
        elemento.getLstSensores().add(objCamara);
        return elemento;
    }

    @Override
    public void transformacionDatos() {
        
        
    }

    
    //METODOS U OPERACIONES

}
