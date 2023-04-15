/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeQuejas;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import GestionDeQuejas.APP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;





/**
 *
 * @author WINDOWS
 */
public class Queja {
   
    // edit queja
    
//            guardar registro
    
  private Connector CNE;
  private Connection c;
  
//  atributos
    private  String nombre;
    private  String entAfectada;
    private  String modalidad;
    private  String via;
    private  String procedencia;
    private  String clasificacion;
    private  String casoPrensa;
  private String fechaR;
    private String fechaT;
    private String fechaDeEntregaAlDepartamentoAfectado;
  private String fechtaDeEntregaDeLaRespuesta;
  private  String conclusion;
  private String satifaccion;
  private String satisfaccion2;
  private boolean atrasada;
  private APP app;
   private int p=1;
  
  Statement consulta;

    public Queja(String nombre, String entAfectada, String modalidad, String via, String procedencia, String clasificacion, String casoPrensa, String fechaR, String fechaT, String fechaDeEntregaAlDepartamentoAfectado, String fechtaDeEntregaDeLaRespuesta, String conclusion, String satifaccion,String satisfaccion2) {
        this.nombre = nombre;
        this.entAfectada = entAfectada;
        this.modalidad = modalidad;
        this.via = via;
        this.procedencia = procedencia;
        this.clasificacion = clasificacion;
        this.casoPrensa = casoPrensa;
        this.fechaR = fechaR;
        this.fechaT = fechaT;
        this.fechaDeEntregaAlDepartamentoAfectado = fechaDeEntregaAlDepartamentoAfectado;
        this.fechtaDeEntregaDeLaRespuesta = fechtaDeEntregaDeLaRespuesta;
        this.conclusion = conclusion;
        this.satifaccion = satifaccion;
        
        CNE=new Connector();
   
        this.satisfaccion2=satisfaccion2;
       
    
    }

    public void setAtrasada(boolean atrasada) {
        this.atrasada = atrasada;
    }

    public boolean isAtrasada() {
        return atrasada;
    }

    public Queja(String nombre, String entAfectada, String modalidad, String via, String procedencia, String clasificacion, String casoPrensa, String fechaR, String fechaT, String fechaDeEntregaAlDepartamentoAfectado, String fechtaDeEntregaDeLaRespuesta, String conclusion, String satis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//public void editDatos(String id,String nombre){
//    String SQL="UPDATE quejas SET NombreyApellidos='"+nombre+"' WHERE Posicion="+id;
//    try {
//        PS=CN.getEnlazar().prepareStatement(SQL);
//      
//  
//        int res=PS.executeUpdate();
//        if (res>0){
//            JOptionPane.showMessageDialog(null, "Registro Modificado");
//        }
//        
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null,"Error al modificar los datos  "+ e.getMessage());
//    } finally {
//        PS=null;
//        CN.close();
//        
//    }
//   
//}
    public String getSatisfaccion2() {
        return satisfaccion2;
    }

  

   

    public String getSatifaccion() {
        return satifaccion;
    }

    public void setSatifaccion(String satifaccion) {
        this.satifaccion = satifaccion;
    }
  

    

   
    public String getNombre() {
        return nombre;
    }

    public String getEntAfectada() {
        return entAfectada;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getVia() {
        return via;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getCasoPrensa() {
        return casoPrensa;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    public String getFechaDeEntregaAlDepartamentoAfectado() {
        return fechaDeEntregaAlDepartamentoAfectado;
    }

    public void setFechaDeEntregaAlDepartamentoAfectado(String fechaDeEntregaAlDepartamentoAfectado) {
        this.fechaDeEntregaAlDepartamentoAfectado = fechaDeEntregaAlDepartamentoAfectado;
    }

    public String getFechtaDeEntregaDeLaRespuesta() {
        return fechtaDeEntregaDeLaRespuesta;
    }

    public void setFechtaDeEntregaDeLaRespuesta(String fechtaDeEntregaDeLaRespuesta) {
        this.fechtaDeEntregaDeLaRespuesta = fechtaDeEntregaDeLaRespuesta;
    }


    

   

   
    public String getConclusion() {
        return conclusion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEntAfectada(String entAfectada) {
        this.entAfectada = entAfectada;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setCasoPrensa(String casoPrensa) {
        this.casoPrensa = casoPrensa;
    }

   

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
  

   

    
     

    

 
    
}
