package Modelo;

import Vista.VistaLogin;
import Vista.VistaRegistro;

public class ModeloLogin {

    private String usuario;
    private String contrasenia;
    private int idTipoUsuario;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    

}
