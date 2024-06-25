package Modelo;
/**
 *
 * @author Grupo No.4
 */
import Vista.VistaGestionInventario;

public class ModeloGestion {
    
    private VistaGestionInventario vistaGestion;
    
    public ModeloGestion(){
    }
    
    public ModeloGestion(VistaGestionInventario vistaGestion){
        this.vistaGestion = vistaGestion;
        
    }

    public VistaGestionInventario getVistaGestion() {
        return vistaGestion;
    }

    public void setVistaGestion(VistaGestionInventario vistaGestion) {
        this.vistaGestion = vistaGestion;
    }

   
    
}
