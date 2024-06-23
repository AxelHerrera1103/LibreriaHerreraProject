package Controlador;

import Modelo.ModeloProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorProducto implements ActionListener{
    
    ModeloProducto modelo;
    ArrayList<ModeloProducto> baseDatos = new ArrayList<>();

    public ControladorProducto(ModeloProducto modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
}
