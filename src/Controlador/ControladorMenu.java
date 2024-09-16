package Controlador;
/**
 *
 * @author Grupo No.4
 */
import Modelo.ModeloMenu;
import Vista.PanelActualizacionProducto;

import Vista.PanelProducto;
import Vista.VistaLogin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;

public class ControladorMenu implements ActionListener, WindowListener, MouseListener {
    
    ModeloMenu modelo;

    public  ControladorMenu(ModeloMenu modelo) {
        this.modelo = modelo;
    }
    
    public void MostrarPanel(JPanel p){
            p.setSize(980, 720);
            p.setLocation(0, 0);
            
            modelo.getVistaPrincipal().contenedor.removeAll();
            modelo.getVistaPrincipal().contenedor.add(p, BorderLayout.CENTER);
            modelo.getVistaPrincipal().contenedor.revalidate();
            modelo.getVistaPrincipal().contenedor.repaint();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getActionCommand().equals(modelo.getVistaGestion().btnIngresoProductos.getActionCommand())){
//            Vista.VistaIngresoProductos vingreso = new VistaIngresoProductos();
//            vingreso.setVisible(true);
//            modelo.getVistaGestion().dispose();
            
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
        if(e.getComponent().equals(modelo.getVistaPrincipal().btnIngresoProductos)){
            Vista.PanelProducto vPanelP = new PanelProducto();
            MostrarPanel(vPanelP);

        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnActualizacionProductos)){
            Vista.PanelActualizacionProducto vPanelA = new PanelActualizacionProducto();
            MostrarPanel(vPanelA);
           
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnCerrarSesion)){
            Vista.VistaLogin vLogin = new VistaLogin();
            vLogin.setVisible(true);
            modelo.getVistaPrincipal().dispose();
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
        if(e.getComponent().equals(modelo.getVistaPrincipal().btnIngresoProductos)){
            modelo.getVistaPrincipal().btnIngresoProductos.setBackground(new Color(102, 102, 102));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnVenta)){
            modelo.getVistaPrincipal().btnVenta.setBackground(new Color(102, 102, 102));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnActualizacionProductos)){
            modelo.getVistaPrincipal().btnActualizacionProductos.setBackground(new Color(102, 102, 102));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnInformes)){
            modelo.getVistaPrincipal().btnInformes.setBackground(new Color(102, 102, 102));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnAgregarUsuario)){
            modelo.getVistaPrincipal().btnAgregarUsuario.setBackground(new Color(102, 102, 102));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnCerrarSesion)){
            modelo.getVistaPrincipal().btnCerrarSesion.setBackground(new Color(102, 102, 102));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnAgregarEmpleado)){
            modelo.getVistaPrincipal().btnAgregarEmpleado.setBackground(new Color(102, 102, 102));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaPrincipal().btnIngresoProductos)){
            modelo.getVistaPrincipal().btnIngresoProductos.setBackground(new Color(51, 51, 51));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnVenta)){
            modelo.getVistaPrincipal().btnVenta.setBackground(new Color(51, 51, 51));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnActualizacionProductos)){
            modelo.getVistaPrincipal().btnActualizacionProductos.setBackground(new Color(51, 51, 51));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnInformes)){
            modelo.getVistaPrincipal().btnInformes.setBackground(new Color(51, 51, 51));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnAgregarUsuario)){
            modelo.getVistaPrincipal().btnAgregarUsuario.setBackground(new Color(51, 51, 51));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnCerrarSesion)){
            modelo.getVistaPrincipal().btnCerrarSesion.setBackground(new Color(51, 51, 51));
        }else if(e.getComponent().equals(modelo.getVistaPrincipal().btnAgregarEmpleado)){
            modelo.getVistaPrincipal().btnAgregarEmpleado.setBackground(new Color(51, 51, 51));
        }
    }
    
}
