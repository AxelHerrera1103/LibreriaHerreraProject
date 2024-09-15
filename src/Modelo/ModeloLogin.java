package Modelo;

import Vista.VistaLogin;
import Vista.VistaRegistro;

public class ModeloLogin {

    private VistaLogin vistaLogin;


    public ModeloLogin() {
    }

    public ModeloLogin(VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }


    public VistaLogin getVistaLogin() {
        return vistaLogin;
    }

    public void setVistaLogin(VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }


}
