package Implementacion;

import Conector.Conector;
import Conector.SQL;
import Interfaces.ILogin;
import Modelo.ModeloLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginImp implements ILogin{

    Conector conector = new Conector();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public ModeloLogin consultarUsuario(String usuario, String contrasenia) {
        ModeloLogin modelo = new ModeloLogin();
        conector.conectar();
        
        try {
            ps = conector.preparar(sql.getCONSULTA_USUARIO());
            
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            rs = ps.executeQuery();
            
            
            while(rs.next()){
                modelo.setUsuario(rs.getString("usuario"));
                modelo.setContrasenia(rs.getString("contraseña"));
                modelo.setIdTipoUsuario(Integer.parseInt(rs.getString("id_tipo_usuario")));
                System.out.println(rs.getString("id_tipo_usuario"));
            }
            conector.desconectar();
                
            
        } catch (Exception e) {
            conector.mensaje(e.getMessage(), "Error en la consulta", 0);
        }
        return modelo;
    }
    

    
}
