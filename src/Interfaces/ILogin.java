package Interfaces;

import Modelo.ModeloLogin;

public interface ILogin {
    public ModeloLogin consultarUsuario (String usuario, String contrasenia);
//    public ModeloLogin consultaUsuarioNew (int id_usuario);
}
