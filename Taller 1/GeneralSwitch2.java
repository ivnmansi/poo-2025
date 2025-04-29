 
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
     * Método que representa el botón de encendido y apagado del switch general
     */
    public void button(){
        switchState = !switchState;
        for(int i=0;i<lamp.size();i++){
            if(switchState && lamp.get(i).getLampSwitch()){
                lamp.get(i).setIsOn(state.ON);
            }
            else {
                lamp.get(i).setIsOn(state.OFF);
            }
        }
    }

}


