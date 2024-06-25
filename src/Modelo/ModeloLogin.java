package Modelo;

import Vista.VistaLogin;
import Vista.VistaRegistro;

public class ModeloLogin {
    
    private VistaLogin vistaLogin;
    private VistaRegistro vistaRegistrar;
    
    public ModeloLogin(){   
    }

    public ModeloLogin(VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }

    public ModeloLogin(VistaRegistro vistaRegistrar) {
        this.vistaRegistrar = vistaRegistrar;
    }

    public VistaLogin getVistaLogin() {
        return vistaLogin;
    }

    public void setVistaLogin(VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }

    public VistaRegistro getVistaRegistrar() {
        return vistaRegistrar;
    }

    public void setVistaRegistrar(VistaRegistro vistaRegistrar) {
        this.vistaRegistrar = vistaRegistrar;
    }
    
    
}
