package Modelo;
/**
 *
 * @author Grupo No.4
 */

import Vista.PanelProducto;
import Vista.VistaPrincipal;

public class ModeloMenu {
    
    private VistaPrincipal vistaPrincipal;


    public ModeloMenu() {
    }

    public ModeloMenu(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    public VistaPrincipal getVistaPrincipal() {
        return vistaPrincipal;
    }

    public void setVistaPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

}
