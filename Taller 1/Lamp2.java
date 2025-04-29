 enum state {ON, OFF};

/**
 * Clase que representa una lámpara.
 * Cada lámpara tiene un estado (encendida o apagada) y un interruptor individual.
 */
public class Lamp2
{
    /**
     * Estado de la lámpara (encendida o apagada).
     */
    private state isOn;
    /**
     * Interruptor individual de la lámpara (encendido o apagado).
     */
    private boolean lampSwitch;
    /**
     * Interruptor general asociado a la lámpara.
     */
    private GeneralSwitch2 generalSwitch;
   
     /**
     * Constructor de la clase {@code Lamp2}.
     * Inicializa la lámpara como apagada y con el interruptor individual apagado.
     */
    public Lamp2(GeneralSwitch2 newGeneralSwitch){
       isOn = state.OFF;
       lampSwitch = false;
       generalSwitch = newGeneralSwitch;
       generalSwitch.getLamps().add(this);
    }
   
    /**
     * Establece el estado de la lámpara.
     *
     * @param isOn El nuevo estado de la lámpara, ya sea {@code state.ON} o {@code state.OFF}.
     */
    public void setIsOn(state newState){
        isOn = newState;
    }
    
    /**
     * Obtiene el estado del interruptor individual de la lámpara.
     *
     * @return {@code true} si el interruptor está encendido, {@code false} si está apagado.
     */
    public boolean getLampSwitch(){
       return lampSwitch;
    }
   
    /**
     * Función que representa el botón de encendido/apagado de la lampara
     */
    public void button(){
      lampSwitch = !lampSwitch;
      if (lampSwitch && generalSwitch.getSwitchState()){
         isOn=state.ON;
      }
      else {
         isOn=state.OFF;
      }
    }
}

    
