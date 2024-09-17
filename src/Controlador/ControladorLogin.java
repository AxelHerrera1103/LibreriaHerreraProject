package Controlador;

import Implementacion.LoginImp;
import Modelo.ModeloLogin;
import Vista.VistaPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 *
 * @author GrupoNo.4
 */
public class ControladorLogin implements ActionListener, WindowListener, MouseListener {

    ModeloLogin modelo;
    LoginImp implementacion = new LoginImp();

    public ControladorLogin(ModeloLogin modelo) {
        this.modelo = modelo;
    }
  

    public boolean validarUsuario() {

        boolean resultado = false;

        return resultado;
    }
    
    public void abrirMenu(){

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
    @Override
    public void windowOpened(WindowEvent e) {
 
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaLogin().btnIngresoMenu)){
            
            ModeloLogin model = implementacion.consultarUsuario(modelo.getVistaLogin().txtNombreUsuario.getText(), String.valueOf(modelo.getVistaLogin().txtContraseñaUsuario.getPassword()));
            String usuarioausar = "admin";
            String contrasenaaUsar = "1234";
            if(
                    (modelo.getVistaLogin().txtNombreUsuario.getText().equals(model.getUsuario())) && (String.valueOf(modelo.getVistaLogin().txtContraseñaUsuario.getPassword()).equals(model.getContrasenia()))
                    ){
                Vista.VistaPrincipal vGestion = new VistaPrincipal();
                vGestion.setVisible(true);
                modelo.getVistaLogin().dispose();
            }else{
                System.out.println("No entro");
            }
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaLogin().btnIngresoMenu)){
            modelo.getVistaLogin().btnIngresoMenu.setBackground(new Color(153, 153, 153));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaLogin().btnIngresoMenu)){
            modelo.getVistaLogin().btnIngresoMenu.setBackground(new Color(102, 102, 102));
        }
    }
}