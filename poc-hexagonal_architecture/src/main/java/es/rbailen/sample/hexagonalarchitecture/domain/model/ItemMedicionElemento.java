package es.rbailen.sample.hexagonalarchitecture.domain.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemMedicionElemento {
     
    /**
     * Atributos 
     */
    private String tipo; 
    private String nombre;
    private String estado; 
    private long referencia;
    private float altura;
    private float ancho;
    private float peso;
    private ArrayList<Sensor> lstSensores;
    private ArrayList<Actuador> lstActuadores ;  
    private ArrayList<Float> lstValoresReales;
    private ArrayList<Float> lstValoresIdeales;
    /**
     * Constructor 
     */
    
    public ItemMedicionElemento(String tipo ,String nombre){
        this.tipo = tipo;
        this.nombre=nombre;
        lstSensores = new  ArrayList<>();
        lstActuadores = new  ArrayList<>();
        lstValoresReales = new  ArrayList<>();
        lstValoresIdeales = new  ArrayList<>();
    }
    /**
     * Geters and setters
     * @return 
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

    public ArrayList<Sensor> getLstSensores() {
        return lstSensores;
    }

    public void setLstSensores(ArrayList<Sensor> lstSensores) {
        this.lstSensores = lstSensores;
    }

    public ArrayList<Actuador> getLstActuadores() {
        return lstActuadores;
    }

    public void setLstActuadores(ArrayList<Actuador> lstActuadores) {
        this.lstActuadores = lstActuadores;
    }

    public ArrayList<Float> getLstValoresReales() {
        return lstValoresReales;
    }

    public void setLstValoresReales(ArrayList<Float> lstValoresReales) {
        this.lstValoresReales = lstValoresReales;
    }

    public ArrayList<Float> getLstValoresIdeales() {
        return lstValoresIdeales;
    }

    public void setLstValoresIdeales(ArrayList<Float> lstValoresIdeales) {
        this.lstValoresIdeales = lstValoresIdeales;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    /**
     * M??tods 
     */
    
    public boolean comprobarCalidad(){
        return false; 
    }
    public void obtenerDatos(){
        
    }
}
