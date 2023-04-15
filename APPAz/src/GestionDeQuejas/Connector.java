/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeQuejas;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS
 */
public class Connector {
    private Connection enlazar=null;
    public Connection conectar(){
        try {
            Class.forName("org.h2.Driver");
            enlazar= DriverManager.getConnection("jdbc:h2:file:D:\\Registro de Quejas\\sistema","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+"No fue posible establecer la conexion");
        }
        return enlazar;
    }
    
   

    void close() {
        try{
          enlazar.close();
          
        }catch (Exception e){
            throw new UnsupportedOperationException("No se ha podido cerrar la conexion"); //To change body of generated methods, choose Tools | Templates.
  
        }
      
        
    }

    public Connection getEnlazar() {
        return enlazar;
    }
    
}
