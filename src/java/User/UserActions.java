
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.sql.*;

public class UserActions {
 /*
    public static Connection getConnection(){
        String url, userName, password;
        
        url="jdbc:mysql:3306/localhost/TacoMaster_DB";
        userName="root";
        password="root";
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, 
                    password);
            System.out.println("Se conecto a la BD");
        }catch(Exception e){
            System.out.println("No se conecto a la BD");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return con;
    }
    
    public static int Guardar(User e){
        
        int status = 0;
        
        try{
            
            Connection con = UserActions.getConnection();
            
            String q = "insert into musuario (nom_mu, appat_mu, apmat_mu, birth_mu, tel_mu, cel_mu, email_mu, pass_mu, ciudad, colonia,"
                    + "calle,cp,no_int,no_ext) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, e.getNom_mu());
            ps.setString(2, e.getAppat_mu());
            ps.setString(3, e.getApmat_mu());
            ps.setString(4, e.getBirth_mu());
            ps.setString(5, e.getTel_mu());
            ps.setString(6, e.getCel_mu());
            ps.setString(7, e.getEmail_mu());
            ps.setString(8, e.getPass_mu());
            ps.setString(9, e.getCiudad());
            ps.setString(10, e.getColonia());
            ps.setString(11, e.getCalle());
            ps.setString(12, (e.getCp()));
            ps.setString(13, (e.getNo_int()));
            ps.setString(14, (e.getNo_ext()));
            
            status = ps.executeUpdate();
            con.close();
            
            
        }catch(Exception ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return status;
    }
    
    public static int ActualizarNombre(User e){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();
            String sql= "update musuario set nom_mu = ?, "
                    + "pass_mu = ?, "
                    + "where email_mu = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getNom_mu());
            ps.setString(2, e.getPass_mu());
            ps.setString(3, e.getEmail_mu());
            
            status = ps.executeUpdate();
            con.close();
        }catch(Exception ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return status;
    }
    
    public static int ActualizarDireccion(User e){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();
            String sql= "update MDireccionEntrega set ciudad = ?, "
                    + "colonia = ?, "
                    + "calle = ?, "
                    + "cp = ?, "
                    + "no_int = ?, "
                    + "no_ext = ?, "
                    + "where email_mu = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getNom_mu());
            ps.setString(2, e.getPass_mu());
            ps.setString(3, e.getEmail_mu());
            
            status = ps.executeUpdate();
            con.close();
        }catch(Exception ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return status;
    }
    
    public static int Eliminar(int id){
        
        int estatus = 0;
        try{
            Connection con = UserActions.getConnection();
            String q ="delete from Datos where id =?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            con.close();
        
        }catch (Exception ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        }
        return estatus;
        
    }
   /* 
    public static User getUserById(int id){
        
        User e = new User();
        try{
            Connection con = UserActions.getConnection();
            String sql = "Select * from Datos "
                    + "where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id); 
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                e.setId(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setEmail(rs.getString(4));
                e.setPais(rs.getString(5));
                
                con.close();
            }
        }catch(Exception ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return e;
    }
    
    public static List<User> getAllUsers(){
        List<User> lista = new ArrayList<User>();
        try{
            Connection con = UserActions.getConnection();
            String sql="select * from Datos";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                User e = new User();
                   e.setId(rs.getInt(1));
                   e.setNombre(rs.getString(2));
                   e.setPassword(rs.getString(3));
                   e.setEmail(rs.getString(4));
                   e.setPais(rs.getString(5));
                   lista.add(e);
                
            }
            con.close();
        
        }catch(Exception ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return lista;
    }
    
    
    
    
    
    
    
    
    
    
    
}
*/
}
