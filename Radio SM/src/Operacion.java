
import java.text.DecimalFormat;



/**
 * @author Maria Fernanda Lopez 17160
 * @author Sergio Marchena 16
 * @version 16/01/2018
 */
public class Operacion implements Radio{
    //Atributos 
    private float nFrecuencia; //tendra el valor de la frecuencia que toca despues de la que esta actualmente en la radio
    
    

    @Override
    public boolean onOff(boolean e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Switch() {
        
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
        
    }

    @Override
    public float seleccionarFav(int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
