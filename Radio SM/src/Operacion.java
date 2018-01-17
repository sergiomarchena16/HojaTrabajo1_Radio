
import java.lang.reflect.Array;
import java.text.DecimalFormat;



/**
 * @author Maria Fernanda Lopez 17160
 * @author Sergio Marchena 16
 * @version 16/01/2018
 */
public class Operacion implements Radio{
    //Atributos 
    private float nFrecuencia; //tendra el valor de la frecuencia que toca despues de la que esta actualmente en la radio
    private float[] guardados;
    
    public Operacion(){
        guardados = new float[11];
    }
    
    


    @Override
    public float siguiente(float a) {
        if (a%10 == 0){
            if(a==1610){
                nFrecuencia = 530;
            }else{
                nFrecuencia = a + 10;
            }
        } else {
            if (a>107.90){
            nFrecuencia = (float) 87.9;
            } else if (a<107.90) {
                
                nFrecuencia = (float) (a + 0.2);
            }
            
        }
        DecimalFormat df = new DecimalFormat("#.0");
        return Float.parseFloat(df.format(nFrecuencia));
    }

    @Override
    public float anterior(float a) {
        if (a%10 == 0){
            if(a==1610){
                nFrecuencia = 530;
            }else{
                nFrecuencia = a - 10;
            }
        } else {
            if (a>107.90){
            nFrecuencia = (float) 87.9;
            } else if (a>87.9){
                nFrecuencia = (float) (a - 0.2);
            }
            
        }
        DecimalFormat df = new DecimalFormat("#.0");
        return Float.parseFloat(df.format(nFrecuencia));
        
    }

    @Override
    public void guardar(float e, int b) {
        if (b==1){
            guardados[0] = e;
        } else if (b==2){
            guardados[1] = e;
        } else if (b==3){
            guardados[2] = e;
        } else if (b==4){
            guardados[3] = e;
        } else if (b==5){
            guardados[4] = e;
        } else if (b==6) {
            guardados[5] = e;
        } else if (b==7) {
            guardados[6] = e;
        } else if (b==8) {
            guardados[7] = e;
        } else if (b==9) {
            guardados[8] = e;
        } else if (b==10) {
            guardados[9] = e;
        } else if (b==11) {
            guardados[10] = e;
        } else if (b==12) {
            guardados[11] = e;
        }
    }

    @Override
    public float seleccionarFav(int b) {
        float estacion = 0 ;
        
        if (b==1){
            estacion = guardados[0];
        } else if (b==2){
            estacion = guardados[1];
        } else if (b==3){
            estacion = guardados[2];
        } else if (b==4){
            estacion = guardados[3];
        } else if (b==5){
            estacion = guardados[4];
        } else if (b==6) {
            estacion = guardados[5];
        } else if (b==7) {
            estacion = guardados[6];
        } else if (b==8) {
            estacion = guardados[7];
        } else if (b==9) {
            estacion = guardados[8];
        } else if (b==10) {
            estacion = guardados[9];
        } else if (b==11) {
            estacion = guardados[10];
        } else if (b==12) {
            estacion = guardados[11];
        }
        
        return estacion;
    }

    @Override
    public boolean onOff(boolean e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Switch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
