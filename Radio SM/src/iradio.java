/*
Esta clase sera la encargada de la interfaz que es la clase que se va a intercambiar con los demas. 
*/

/**
 * @author Maria Fernanda Lopez 17160
 * @author Sergio Marchena 16387
 * @since 15/01/2018 
 */
<<<<<<< HEAD:Radio SM/src/iradio.java

public interface iradio {
=======
public interface Radio {
    
    /**
     * Metodo encargado de Encender y Apagar la Radio.
     * 
     */
>>>>>>> 8ba1c22f14cca9e9f754a029e09614693f887ac1:Radio SM/src/Radio.java
    public void onOff();
    
    /**
     * Metodo encargado de cambiar entre estaciones AM y FM. 
     * @return AM o FM.
     */
    public float Switch();
    
    /** Metodo encargado de cambiar a la estacion siguiente. 
     * @param a (estacion)
     * @return siguiente estacion.
     */
    public float siguiente(float a);
    
    /**
     * Metodo encargado de cambiar a la estacion anterior.
     * @param a (estacion)
     * @return estacion anterior.
     */
    public float anterior(float a);
    
    /**
     * Metodo encargado de guardar como favorita la estacion actual.
     * @param e (estacion actual)
     * @param b (boton en donde se guardara)
     */
    public void guardar(float e, int b);
    
    /**
     * Metodo encargado para seleccionar una estacion favorita guardar.
     * @param b (boton de la radio donde esta la estacion favorita)
     * @return 
     */
    public float seleccionarFav(int b);
    
}
