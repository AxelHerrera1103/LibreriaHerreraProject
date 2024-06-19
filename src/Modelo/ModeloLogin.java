package Modelo;

import Vista.VistaLogin;
import Vista.VistaRegistro;

public class ModeloLogin {
    
    private VistaLogin vistaLogin;
    private VistaRegistro vistaRegistrar;

    public ModeloLogin(VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }

    public ModeloLogin(VistaRegistro vistaRegistrar) {
        this.vistaRegistrar = vistaRegistrar;
    }   
}
