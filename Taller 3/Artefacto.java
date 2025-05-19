 enum state {ON, OFF};

/**
 * Clase que representa un artefacto.
 * Cada artefacto tiene un estado (encendido o apagado) y un interruptor individual.
 */
public abstract class Artefacto
{    
    /**
     * Estado del artefacto (encendido o apagado).
     */
    private state isOn;
    /**
     * Interruptor individual de la lámpara (encendido o apagado).
     */
    private boolean artefactoSwitch;
    /**
     * Interruptor general asociado a la lámpara.
     */
    private GeneralSwitch2 generalSwitch;
    /**
     * Consumo en watts del artefacto
     */
    private int consumo;
   
     /**
     * Constructor de la clase {@code Lamp2}.
     * Inicializa la lámpara como apagada y con el interruptor individual apagado.
     */
    public Artefacto(){
       isOn = state.OFF;
       artefactoSwitch = false;
    }
    
    /**
     * Metodo para conectar artefacto en el tablero general
     */
    public void conectarArtefacto(){
        generalSwitch = GeneralSwitch2.getInstance();
        generalSwitch.getLamps().add(this);
        generalSwitch.setNumArtefactos(generalSwitch.getNumArtefactos() + 1);
        if(generalSwitch.getSwitchState() && artefactoSwitch){
            isOn = state.ON;
            generalSwitch.setConsumoTotal(generalSwitch.getConsumoTotal()+consumo);
        }
    }
    
    /**
     * Metodo para desconectar el artefacto del tablero general
     */
    public void desconectarArtefacto(){
        generalSwitch.getLamps().remove(this);
        generalSwitch.setNumArtefactos(generalSwitch.getNumArtefactos() - 1);
        generalSwitch.setConsumoTotal(generalSwitch.getConsumoTotal()-consumo);
        generalSwitch = null;
        isOn = state.OFF;
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
    public boolean getArtefactoSwitch(){
       return artefactoSwitch;
    }
   
    /**
     * Getter que obtiene el consumo del artefacto
     * 
     * @return Consumo del artefacto
     */
    public int getConsumo(){
        return consumo;
    }
    
    /**
     * Setter del consumo. Cambia el consumo de un artefacto.
     * 
     * @param newConsumo Consumo que se quiere que el artefacto tenga
     */
    public void setConsumo(int newConsumo){
        this.consumo = newConsumo;
    }
    
    /**
     * Función que representa el botón de encendido/apagado de la lampara
     */
    public void button(){
      artefactoSwitch = !artefactoSwitch;
      if (artefactoSwitch && generalSwitch.getSwitchState()){
         isOn=state.ON;
         generalSwitch.setConsumoTotal(generalSwitch.getConsumoTotal()+consumo);
      }
      else {
         isOn=state.OFF;
         if(generalSwitch.getSwitchState()){
             generalSwitch.setConsumoTotal(generalSwitch.getConsumoTotal()-consumo);
        }
      }
    }
    
}

    
