package Controlador;

import Modelo.ModeloLogin;
import Vista.VistaGestionInventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GrupoNo.4
 */

public class ControladorLogin implements ActionListener{
    
    ModeloLogin modelo;

    public ControladorLogin(ModeloLogin modelo) {
        this.modelo = modelo;
    }
    
    
    
    public boolean validarUsuario(){
        
        boolean resultado = false;
        
        return resultado;
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(modelo.getVistaLogin().btnIngresar.getActionCommand())){
            Vista.VistaGestionInventario vGestion = new VistaGestionInventario();
            vGestion.setVisible(true);      
        }else if (e.getActionCommand().equals(modelo)){           
        }
    }
}
