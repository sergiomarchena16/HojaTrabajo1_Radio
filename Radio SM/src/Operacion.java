/*
Esta clase es la encargada de las operaciones/metodos.
Aqui se haran todos los procesos para cada uno de los metodos en la clase Radio.
*/

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/**
 * @author Maria Fernanda Lopez 17160
 * @author Sergio Marchena 16387
 * @since 16/01/2018
 */
public class Operacion implements Radio{
    /**
     * Atributos necesario de la clase Operacion.
    */
    
    //Tendra el valor de la frecuencia que toca despues de la que esta actualmente en la radio
    private float nFrecuencia; 
    // Arreglo que tendra espacios para guardar estaciones.
    private float[][] guardados;
    //tendra guardado el valor de la ultima frecuencia que sintonizo el usuario en AM 
    private String frecuenciaAM; 
    //tendra guardado el valor de la ultima frecuencia que sintonizo el usuario en FM
    private String frecuenciaFM; 
    // Variable para determinar entre AM y FM con true y false.
    private boolean emisora;
    
    /**
     * Constructor de la clase Operacion.
     */
    public Operacion(){
        guardados = new float[12][2];
        frecuenciaAM = "530";
        frecuenciaFM = "87.9";
        emisora = false;
    }
    
    /**
     * Metodo set para la estacion AM.
     * @param a 
     */
    public void setAM(String a){
        frecuenciaAM = a;
    }
    
    /**
     * Metodo set para la estacion FM.
     * @param a 
     */
    public void setFM(String a){
        frecuenciaFM = a;
    }
    
    @Override
    /**
     * Metodo para cambiar a la estacion siguiente.
     * 
     */
    public float siguiente(float a) {
        DecimalFormat df = new DecimalFormat("#.0");
        // Si esta en AM
        if (a%10 == 0){
            if(a==1610){
                nFrecuencia = 530;
                frecuenciaAM = String.valueOf(nFrecuencia);
            }else{
                nFrecuencia = a + 10;
                frecuenciaAM = String.valueOf(nFrecuencia);
            }
        } 
        // si esta en FM
        else {
            if (a==107.90){
            nFrecuencia = (float) 87.9;
            frecuenciaFM = String.valueOf(df.format(nFrecuencia));
            } else if (a<107.90) {
                
                nFrecuencia = (float) (a + 0.2);
                frecuenciaFM = String.valueOf(df.format(nFrecuencia));
            }   
        }
        return Float.parseFloat(df.format(nFrecuencia));
    }

    @Override
    /**
     * Metodo para regresar a la estacion anterior.
     */
    public float anterior(float a) {
        DecimalFormat df = new DecimalFormat("#.0");
        // si esta en AM
        if (a%10 == 0){
            if(a==530){
                nFrecuencia = 1610;
                frecuenciaAM = String.valueOf(nFrecuencia);
            }else{
                nFrecuencia = a - 10;
                frecuenciaAM = String.valueOf(nFrecuencia);
            }
        }
        // si eta en FM
        else {
            if (a==87.9){
            nFrecuencia = (float) 107.;
            frecuenciaFM = String.valueOf(df.format(nFrecuencia));
            } else if (a>87.9){
                nFrecuencia = (float) (a - 0.2);
                frecuenciaFM = String.valueOf(df.format(nFrecuencia));
            }   
        }
        return Float.parseFloat(df.format(nFrecuencia));
    }

    @Override
    /**
     * Metodo para guardar como favorito una estacion.
     */
    public void guardar(float e, int b) {
        if (b==1){
            guardados[0][0] = e;
        } else if (b==2){
            guardados[1][0] = e;
        } else if (b==3){
            guardados[2][0] = e;
        } else if (b==4){
            guardados[3][0] = e;
        } else if (b==5){
            guardados[4][0] = e;
        } else if (b==6) {
            guardados[5][0] = e;
        } else if (b==7) {
            guardados[6][0] = e;
        } else if (b==8) {
            guardados[7][0] = e;
        } else if (b==9) {
            guardados[8][0] = e;
        } else if (b==10) {
            guardados[9][0] = e;
        } else if (b==11) {
            guardados[10][0] = e;
        } else if (b==12) {
            guardados[11][0] = e;
        } else if (b==13){
            guardados[1][1] = e;
        } else if (b==14){
            guardados[2][1] = e;
        } else if (b==15){
            guardados[3][1] = e;
        } else if (b==16){
            guardados[4][1] = e;
        } else if (b==17) {
            guardados[5][1] = e;
        } else if (b==18) {
            guardados[6][1] = e;
        } else if (b==19) {
            guardados[7][1] = e;
        } else if (b==20) {
            guardados[8][1] = e;
        } else if (b==21) {
            guardados[9][1] = e;
        } else if (b==22) {
            guardados[10][1] = e;
        } else if (b==23) {
            guardados[11][1] = e;
        } else if (b==24){
            guardados[0][1] = e;
        }
    }

    @Override
    /**
     * Metodo para seleccionar una estacion favorita ya guardada como favorita.
     */
    public float seleccionarFav(int b) {
        float estacion = 0 ;
      if (b==1){
            estacion = guardados[0][0];
        } else if (b==2){
            estacion = guardados[1][0];
        } else if (b==3){
           estacion = guardados[2][0];
        } else if (b==4){
            estacion = guardados[3][0];
        } else if (b==5){
           estacion = guardados[4][0];
        } else if (b==6) {
           estacion = guardados[5][0];
        } else if (b==7) {
          estacion = guardados[6][0];
        } else if (b==8) {
           estacion = guardados[7][0];
        } else if (b==9) {
           estacion = guardados[8][0];
        } else if (b==10) {
           estacion = guardados[9][0];
        } else if (b==11) {
           estacion = guardados[10][0];
        } else if (b==12) {
           estacion = guardados[11][0];
        } else if (b==13){
           estacion = guardados[1][1];
        } else if (b==14){
           estacion = guardados[2][1];
        } else if (b==15){
           estacion = guardados[3][1];
        } else if (b==16){
           estacion = guardados[4][1];
        } else if (b==17) {
           estacion = guardados[5][1];
        } else if (b==18) {
           estacion = guardados[6][1];
        } else if (b==19) {
           estacion = guardados[7][1];
        } else if (b==20) {
           estacion = guardados[8][1];
        } else if (b==21) {
          estacion =  guardados[9][1];
        } else if (b==22) {
           estacion = guardados[10][1];
        } else if (b==23) {
           estacion = guardados[11][1];
        } else if (b==24){
           estacion = guardados[0][1];
        }
        return estacion;
    }

    @Override
    /**
     * Metodo para encender o apagar la radio.
     */
    public void onOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    /** 
     * Metodo para cambiar entre AM y FM.
     */
    public float Switch() {
        if(emisora == false ){
            emisora = true;
            return Float.valueOf(frecuenciaFM);
        } else {
            emisora = false;
            return Float.valueOf(frecuenciaAM);
        }
    }
    
}
