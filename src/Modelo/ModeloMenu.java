package Modelo;
/**
 *
 * @author Grupo No.4
 */

import Vista.PanelProducto;
import Vista.VistaPrincipal;

public class ModeloMenu {
    
    private VistaPrincipal vistaPrincipal;
    private static int tipoUsuario;


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

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        
    }
    
}
