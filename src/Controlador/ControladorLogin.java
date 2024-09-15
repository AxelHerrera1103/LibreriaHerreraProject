package Controlador;

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
            Vista.VistaPrincipal vGestion = new VistaPrincipal();
                vGestion.setVisible(true);
                modelo.getVistaLogin().dispose();
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
            modelo.getVistaLogin().btnIngresoMenu.setBackground(new Color(0, 153, 153));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaLogin().btnIngresoMenu)){
            modelo.getVistaLogin().btnIngresoMenu.setBackground(new Color(0, 204, 204));
        }
    }
}