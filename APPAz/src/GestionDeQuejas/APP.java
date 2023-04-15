/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeQuejas;
import Visual.View;
import static Visual.View.jTable1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author WINDOWS
 */
public class APP {
    
    private static Queja queja[]= new Queja [1000];
    private static int cant;
    private int contreg=0;
    private int pos[]=new int [1000];
    private Queja buscador[]=new Queja [1000];

    public String getStabla23() {
        return stabla23;
    }

    public String getStabla24() {
        return stabla24;
    }

    public String getStabla25() {
        return stabla25;
    }

    public String getStabla26() {
        return stabla26;
    }

    public String getStabla27() {
        return stabla27;
    }

    public String getStabla28() {
        return stabla28;
    }

    public String getStabla29() {
        return stabla29;
    }

    public String getStabla30() {
        return stabla30;
    }

    public String getSqlh2() {
        return sqlh2;
    }
      
   
     private String crearTabla;
    
  
    
  private String sqlh2 = "SELECT * FROM quejas";
  private String stabla23 = "SELECT * FROM q";
  private String stabla24 = "SELECT * FROM qu";
  private String stabla25 = "SELECT * FROM que";
  private String stabla26 = "SELECT * FROM quej";
  private String stabla27 = "SELECT * FROM queja";
  private String stabla28 = "SELECT * FROM quejass";
  private String stabla29 = "SELECT * FROM quejasss";
  private String stabla30 = "SELECT * FROM quejassss";
    
  
    
    
    
     private final String SQL_INSERTh2="INSERT INTO quejas (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      private final String Sql23="INSERT INTO q (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   private final String Sql24="INSERT INTO qu (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       private final String Sql25="INSERT INTO que (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       private final String Sql26="INSERT INTO quej (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        private final String Sql27="INSERT INTO queja (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         private final String Sql28="INSERT INTO quejass (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        private final String Sql29="INSERT INTO quejasss (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        private final String Sql30="INSERT INTO quejassss (NOMBREYAPELLIDOS,ENTIDADAFECTADA,MODALIDAD,VIA,PROCEDENCIA,CLASIFICACION,CASOPRENSA,ESTADODEENTREGA,SATISFACCION,CONCLUSION,FECHARECIVIDA,FECHATERMINO,FECHAENTREGAALDEP,FECHAENTREGARESPUESTA,EMPTY,ATRASADA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public String getSQL_INSERTh2() {
        return SQL_INSERTh2;
    }

    public String getSql23() {
        return Sql23;
    }

    public String getSql24() {
        return Sql24;
    }

    public String getSql25() {
        return Sql25;
    }

    public String getSql26() {
        return Sql26;
    }

    public String getSql27() {
        return Sql27;
    }

    public String getSql28() {
        return Sql28;
    }

    public String getSql29() {
        return Sql29;
    }

    public String getSql30() {
        return Sql30;
    }
        
       private PreparedStatement PS1;
  private Connector CN1=new Connector();
  private Connection Cn=CN1.conectar();
  
  private Connector con1 = new Connector();
  private Connection cn1= con1.conectar();
    
    
  private Connector conec=new Connector();
    private Connection conection=conec.conectar();
    
    
  DefaultTableModel dtm;
  
  
    public APP() {
        dtm = (DefaultTableModel) jTable1.getModel();

    }
    
    public int cantB (){
        int cont=0;
        for(int i=0;i<buscador.length;i++){
            if (buscador[i]!=null){
                cont ++;
            }
                        
        }
        return cont;
    }

    public int getPos(int x){
        return pos[x];
    }

    public Queja getBuscador(int x) {
        return buscador[x];
    }

    public void setQueja(Queja[] queja) {
        APP.queja = queja;
    }

    public void setPos(int[] pos) {
        this.pos = pos;
    }

    public void setBuscador(Queja[] buscador) {
        this.buscador = buscador;
    }

    
    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setContreg(int contreg) {
        this.contreg = contreg;
    }
    

   

    public int getCant() {
        return cant;
    }

    public int getContreg() {
        return contreg;
    }

    
    public void Color(){}
    
    public  void add(Queja y){
        queja[cant]=y;
        cant++;
    }
    
    public int[] getPos() {
        return pos;
    }

    public Queja[] getBuscador() {
        return buscador;
    }
    
    

   
    public void delete(int pos){
        if (pos<0)
            pos=0;
        queja[pos]=null;
        for (int i = pos; i < cant; i++) {
            queja[i]=queja[i+1];
        }
      
    }
    public void deleteeverything(){
    for(int i=0;i<cant+1;i++){
    queja[i]=null;
    }
    }
    public void EditQueja(int x,Queja y){
            queja [x] = y;
          
            
        
    }
    
   

    public  Queja getQueja(int posicion) {
        return queja[posicion];
    }
    
    
//   
    
    
    
  public void leerDatos1(String x){
        String nombre;
   String entAfectada;
      String modalidad;
      String via;
     String procedencia;
      String clasificacion;
      String casoPrensa;
   String fechaR;
     String fechaT;
     String fechaDeEntregaAlDepartamentoAfectado;
   String fechtaDeEntregaDeLaRespuesta;
    String conclusion;
   String satifaccion;
   String satisfaccion2;
        
       Statement st;

     try {

        st = cn1.createStatement();
        ResultSet rs= st.executeQuery(x);
        
       
     while(rs.next()){
      
   
       nombre=(rs.getString(1));
       entAfectada=(rs.getString(2));
       modalidad=(rs.getString(3));
       via=(rs.getString(4));
       procedencia=(rs.getString(5));
       clasificacion=(rs.getString(6));
       casoPrensa=(rs.getString(7));
       conclusion=(rs.getString(8));
       satifaccion=(rs.getString(9));
        satisfaccion2=(rs.getString(10));
       fechaR=(rs.getString(11));
       fechaT=(rs.getString(12));
       fechaDeEntregaAlDepartamentoAfectado=(rs.getString(13));
       fechtaDeEntregaDeLaRespuesta=(rs.getString(14));
      
       
       Queja queja = new Queja( nombre,entAfectada,modalidad,via,procedencia,clasificacion,casoPrensa,fechaR,fechaT,fechaDeEntregaAlDepartamentoAfectado,fechtaDeEntregaDeLaRespuesta,conclusion,satifaccion,satisfaccion2);
        add(queja);
       
       
        
                
     }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    } finally {
    }
     
}
  
  
  public void leerDatos2(){
        String nombre;
   String entAfectada;
      String modalidad;
      String via;
     String procedencia;
      String clasificacion;
      String casoPrensa;
   String fechaR;
     String fechaT;
     String fechaDeEntregaAlDepartamentoAfectado;
   String fechtaDeEntregaDeLaRespuesta;
    String conclusion;
   String satifaccion;
   String satisfaccion2;
        
       Statement st;

     try {

        st = cn1.createStatement();
        ResultSet rs= st.executeQuery(sqlh2);
        
        
        for (int i=0;i<100;i++){
            rs.next();
        }
        
       
     while(rs.next()){
      
   
       nombre=(rs.getString(1));
       entAfectada=(rs.getString(2));
       modalidad=(rs.getString(3));
       via=(rs.getString(4));
       procedencia=(rs.getString(5));
       clasificacion=(rs.getString(6));
       casoPrensa=(rs.getString(7));
       conclusion=(rs.getString(8));
       satifaccion=(rs.getString(9));
        satisfaccion2=(rs.getString(10));
       fechaR=(rs.getString(11));
       fechaT=(rs.getString(12));
       fechaDeEntregaAlDepartamentoAfectado=(rs.getString(13));
       fechtaDeEntregaDeLaRespuesta=(rs.getString(14));
      
       
       Queja queja = new Queja( nombre,entAfectada,modalidad,via,procedencia,clasificacion,casoPrensa,fechaR,fechaT,fechaDeEntregaAlDepartamentoAfectado,fechtaDeEntregaDeLaRespuesta,conclusion,satifaccion,satisfaccion2);
        add(queja);
       
        
                
     }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    } finally {
    }
     
}
  
  
  
  
  
  
  
  
  
  
  
  
     public void  eliminarTodo1 (int ano) throws SQLException{
      Statement st;
    
      
      try {
       st = cn1.createStatement();
 
        String query= "DELETE FROM quejas";
        String query23= "DELETE FROM q";
        String query24= "DELETE FROM qu";
        String query25= "DELETE FROM que";
        String query26= "DELETE FROM quej";
        String query27= "DELETE FROM queja";
        String query28= "DELETE FROM quejass";
        String query29= "DELETE FROM quejasss";
        String query30= "DELETE FROM quejassss";
        
          String papo="TRUNCATE TABLE quejas";
        String papo23="TRUNCATE TABLE q";
        String papo24="TRUNCATE TABLE qu";
        String papo25="TRUNCATE TABLE que";
        String papo26="TRUNCATE TABLE quej";
        String papo27="TRUNCATE TABLE queja";
        String papo28="TRUNCATE TABLE quejass";
        String papo29="TRUNCATE TABLE quejasss";
        String papo30="TRUNCATE TABLE quejassss";
        
        String autoi="alter table quejas alter column POSICION restart with 1";
        String autoi23="alter table q alter column POSICION restart with 1";
        String autoi24="alter table qu alter column POSICION restart with 1";
        String autoi25="alter table que alter column POSICION restart with 1";
        String autoi26="alter table quej alter column POSICION restart with 1";
        String autoi27="alter table queja alter column POSICION restart with 1";
        String autoi28="alter table quejass alter column POSICION restart with 1";
        String autoi29="alter table quejasss alter column POSICION restart with 1";
        String autoi30="alter table quejassss alter column POSICION restart with 1";
    
        
        
        
        String x=query;
        String y=papo;
        String z=autoi;
        
         if (ano==2023){
            x=query23;
             y=papo23;
             z=autoi23;
         }     
             
         if (ano==2024){
            x=query24;
            y=papo24;
            z=autoi24;
         }
         if (ano==2025){
            x=query25;
         y=papo25;
         z=autoi25;
         }
         if (ano==2026){
            x=query26;
         y=papo26;
         z=autoi26;
         }
         if (ano==2027){
            x=query27;
         y=papo27;
         z=autoi27;
         }
         if (ano==2028){
            x=query28;
         y=papo28;
         z=autoi28;
         }
         if (ano==2029){
            x=query29;
         y=papo29;
         z=autoi29;
         }
         if (ano==2030){
            x=query30;
         y=papo30;
         z=autoi30;
         } 
        
        st.executeUpdate(x);
      
        st.executeUpdate(y);
        st.executeUpdate(z);
      
//           st.executeUpdate(autoi);
//    
       
        
      }catch (Exception e){ 
          JOptionPane.showMessageDialog(null, e);
      }finally{
          st=null;
          
                
      }
  }
     
     
     
     
     
     
          
     public void crearTabla() {
         Statement st=null;
         String x="quejas";
                 
          
        try {
            
               st = conection.createStatement();
            
            
                 for (int i=0;i<9;i++){
                   if (i==1)
                       x="q";
                   if (i==2)
                       x="qu";
                   if (i==3)
                       x="que";
                   if (i==4)
                       x="quej";
                   if (i==5)
                       x="queja";
                   if (i==6)
                       x="quejass";
                   if (i==7)
                       x="quejasss";
                   if (i==8)
                       x="quejassss";
        crearTabla="CREATE TABLE IF NOT EXISTS "+x+" ( "
            + "NOMBREYAPELLIDOS VARCHAR(50),"
            + "ENTIDADAFECTADA VARCHAR(50),"
            + "MODALIDAD VARCHAR(50),"
            + "VIA VARCHAR(50),"
            + "PROCEDENCIA VARCHAR(50),"
            + "CLASIFICACION VARCHAR(50),"
            + "CASOPRENSA VARCHAR(50),"
            + "ESTADODEENTREGA VARCHAR(50),"
            + "SATISFACCION VARCHAR(50),"
            + "CONCLUSION VARCHAR(50),"
            + "FECHARECIVIDA VARCHAR(50),"
            + "FECHATERMINO VARCHAR(50),"
            + "FECHAENTREGAALDEP VARCHAR(50),"
            + "FECHAENTREGARESPUESTA VARCHAR(50),"
            + "POSICION BIGINT AUTO_INCREMENT,"
            + "PRIMARY KEY(POSICION),"
            + "EMPTY VARCHAR (50),"
            + "ATRASADA VARCHAR (50),"
            + "DESCRIPCION VARCHAR (5000)"
            + ");";
                  
            st.executeUpdate(crearTabla);
                 }
                      
        } catch (SQLException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
     
     
   
}
     
     
     
     
     public void insertDatos1(Queja x,String y){
    try {
        PS1=CN1.conectar().prepareStatement(y);
  
     String p="   ";
        PS1.setString(1,x.getNombre());
        PS1.setString(2,x.getEntAfectada());
        PS1.setString(3,x.getModalidad());
        PS1.setString(4,x.getVia());
        PS1.setString(5,x.getProcedencia());
        PS1.setString(6,x.getClasificacion());
        PS1.setString(7,x.getCasoPrensa());
        PS1.setString(8,x.getConclusion());
        PS1.setString(9,x.getSatifaccion());
        PS1.setString(11,x.getFechaR());
        PS1.setString(12,x.getFechaT());
        PS1.setString(13,x.getFechaDeEntregaAlDepartamentoAfectado());
        PS1.setString(14,x.getFechtaDeEntregaDeLaRespuesta());
       PS1.setString(10,x.getSatisfaccion2());
      PS1.setString(15,p);
      String atrasa="No";
      boolean salto=true;
      if (x.getFechaT().isEmpty()){
        salto=false;
    }
      if (salto==true){
 SimpleDateFormat fecha=new SimpleDateFormat("yyyy-MM-dd");
 Date dataFormateada= fecha.parse(x.getFechaT());
 Date local=java.sql.Date.valueOf(LocalDate.now());
      
     if (dataFormateada.before(local))
         atrasa="Si"; 
      }
          PS1.setString(16, atrasa);
        
     
        int res=PS1.executeUpdate();
        if (res>0){
            
        }
        
    } catch (Exception e) {
        System.err.println("Error al guardar los datos  "+ e.getMessage());
    } finally {
        PS1=null;
     
    }
   
}
     
     
     
     
     public void guardartodo1(String ano,int p) throws SQLException{
        eliminarTodo1(p);
         
                    
                    
        for (int i = 0; i < cant; i++) {
            
            Queja x=queja[i];
                
             insertDatos1(x,ano);  
            
        }
   
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
      
 
       
    }
            
        
            
        
    } 
        
        
    

   
    

