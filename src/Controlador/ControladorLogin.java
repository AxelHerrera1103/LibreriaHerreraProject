package Controlador;

import Modelo.ModeloLogin;
import Vista.VistaGestionInventario;
import Vista.VistaLogin;
import Vista.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GrupoNo.4
 */
public class ControladorLogin implements ActionListener {

    ModeloLogin modelo;

    public ControladorLogin(ModeloLogin modelo) {
        this.modelo = modelo;
    }

    public boolean validarUsuario() {

        boolean resultado = false;

        return resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (modelo.getVistaRegistrar() == null) {
            if (e.getActionCommand().equals(modelo.getVistaLogin().btnIngresar.getActionCommand())) {
                Vista.VistaGestionInventario vGestion = new VistaGestionInventario();
                vGestion.setVisible(true);
                modelo.getVistaLogin().dispose();
            }else if (e.getActionCommand().equals(modelo.getVistaLogin().btnRegistrarse.getActionCommand())) {
                Vista.VistaRegistro vRegistro = new VistaRegistro();
                vRegistro.setVisible(true);
                modelo.getVistaLogin().dispose();
        } 
            
        } else if (modelo.getVistaLogin() == null) {
            if (e.getActionCommand().equals(modelo.getVistaRegistrar().btnRegresar.getActionCommand())) {
                Vista.VistaLogin vLogin = new VistaLogin();
                vLogin.setVisible(true);
                modelo.getVistaRegistrar().dispose();
            }
        }
    }

//        if(e.getActionCommand().equals(modelo.getVistaLogin().btnIngresar.getActionCommand())){
//            Vista.VistaGestionInventario vGestion = new VistaGestionInventario();
//            vGestion.setVisible(true);      
//        }else if (e.getActionCommand().equals(modelo.getVistaLogin().btnRegistrarse.getActionCommand())){
//            Vista.VistaRegistro vRegistro = new VistaRegistro();
//            vRegistro.setVisible(true);
//        }else if(e.getActionCommand().equals(modelo.getVistaRegistrar().btnRegresar.getActionCommand())){
//            Vista.VistaLogin vLogin = new VistaLogin();
//            vLogin.setVisible(true);
//        }
}