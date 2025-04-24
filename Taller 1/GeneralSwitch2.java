 
import java.util.ArrayList;

/**
 * Clase que representa un interruptor general.
 * Implementa el patrón Singleton para garantizar que solo exista una instancia de esta clase.
 */
public class GeneralSwitch2
{
    /**
     * Instancia única de la clase (Singleton).
     */
    private static GeneralSwitch2 instance;
    /**
     * Estado del interruptor general (encendido o apagado).
     */
    private boolean switchState;
    /**
     * Lista de lámparas asociadas al interruptor general.
     */
    private ArrayList<Lamp2> lamp = new ArrayList<>();
    
    /**
     * Constructor privado para evitar la creación de múltiples instancias.
     * Inicializa el estado del interruptor como apagado.
     */
    private GeneralSwitch2(){
        switchState = false;
    }
    
    /**
     * Obtiene la instancia única de la clase.
     * Si no existe, la crea.
     *
     * @return La instancia única de {@code GeneralSwitch2}.
     */
    public static GeneralSwitch2 getInstance(){
        if(instance == null){
            instance = new GeneralSwitch2();
        }
        return instance;
    }
    
    /**
     * Obtiene el estado actual del interruptor general.
     *
     * @return {@code true} si el interruptor está encendido, {@code false} si está apagado.
     */
    public boolean getSwitchState(){
        return switchState;
    }

    /**
     * Obtiene la lista de lámparas asociadas al interruptor general.
     *
     * @return Una lista de objetos {@code Lamp2}.
     */
    public ArrayList<Lamp2> getLamps(){
        return lamp;
    }
    
     /**
     * Enciende el interruptor general.
     * Si una lámpara asociada tiene su interruptor individual encendido, también se enciende.
     */
    public void turnOn(){
        this.switchState = true;
        for(int i=0;i<lamp.size();i++){
            if(lamp.get(i).getLampSwitch() == true){
                lamp.get(i).setIsOn(state.ON);
            }
        }
    }
    /**
     * Apaga el interruptor general.
     * Todas las lámparas asociadas se apagan independientemente de su estado individual.
     */
    public void turnOff(){
        this.switchState = false;
        for(int i=0;i<lamp.size();i++){
            lamp.get(i).setIsOn(state.OFF);
        }
    }
    
}
