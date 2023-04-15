/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import GestionDeQuejas.APP;
import GestionDeQuejas.Queja;
import Visual.IntroducirNumeroDeLaQuejaParaEditar1;
import Visual.View;
import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static java.lang.Double.NaN;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static sun.nio.cs.Surrogate.is;

/**
 *
 * @author WINDOWS
 */
public class EditQueja extends javax.swing.JFrame {
private APP m;
private IntroducirNumeroDeLaQuejaParaEditar1 reg;
DefaultTableModel dtm;
private int j;
    /**
     * Creates new form Registro
     */
    public EditQueja(APP app) throws ParseException {
        initComponents();
        APP m=new APP();
        setTitle("Editar Quejas");
        dtm = (DefaultTableModel) View.jTable1.getModel();
        satis.setVisible(false);
        conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
            satisfaccion1.setVisible(false);
            jLabel9.setVisible(false);
            respuesta.setVisible(false);
            
               Registro p=new Registro();
               
                     j = Integer.parseInt(reg.num.getText());
          
       if(View.indicador==2 && j>101){
         j=m.getCant()%100;
          
         if (j==0){
             j=100;
       
         }else j=j-1;
        
       }
       if(View.indicador==3 && j>201 ){
         j=m.getCant()%100;
        
         if (j==0){
             j=100;
           
         }else j=j-1;
         
         
       }
       
         if(View.indicador==4 && j>301 ){
         j=m.getCant()%100;
        
         if (j==0){
             j=100;
           
         }else j=j-1;
         
       
       }
         if(View.indicador==1 && j<100){
             j--;
             
         }
           
            //////////////////////////////////////////////////////////////////////////
             
           String date1=dtm.getValueAt(j,11).toString();
           
           Calendar cal=Calendar.getInstance();
           SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
           if (date1!= ""||date1!=null){
                 try {
            cal.setTime(sdf.parse(date1));
           recibo.setCalendar(cal);
        } catch (Exception e) {
            
        }
           }
          
           
            /////////////////////////////////////////////////////////////////////////
            String date2=dtm.getValueAt(j,12).toString();
            System.out.println(date2);
          if (date2!= ""||date2!=null){
              try{
           cal.setTime(sdf.parse(date2));
           termino.setCalendar(cal);
           } catch(Exception e){
                  
              }
          }
            ////////////////////////////////////////////////////////////////////////
           String date3=dtm.getValueAt(j,13).toString();
          if (date3!= ""||date3!=null){
              try{
          
           cal.setTime(sdf.parse(date3));
           departamento.setCalendar(cal);
              }  catch(Exception e){
                  
              }  
          }
           
            ////////////////////////////////////////////////////////////////////////
            String date4=dtm.getValueAt(j,14).toString();
           if (date4!= ""||date4!=null){
               
           try{
           cal.setTime(sdf.parse(date4));
           respuesta.setCalendar(cal);
           }catch(Exception e){
                  
              }
           }
            ////////////////////////////////////////////////////////////////////////
            String al = dtm.getValueAt(j,1).toString();
            name.setText(al);
            entidad.setSelectedItem(dtm.getValueAt(j, 2));
            modalida.setSelectedItem(dtm.getValueAt(j,3));
            Vias.setSelectedItem(dtm.getValueAt(j,4));
            procede.setSelectedItem(dtm.getValueAt(j, 5));
            clasificacio.setSelectedItem(dtm.getValueAt(j, 6));
            caso.setSelectedItem(dtm.getValueAt(j, 7));
            entrega.setSelectedItem(dtm.getValueAt(j, 8));
            satis.setSelectedItem(dtm.getValueAt(j,9));
            if(conclus_a!=null)
           conclus_a.setSelectedItem(dtm.getValueAt(j, 10));
            if(conclus_b!=null)
           conclus_b.setSelectedItem(dtm.getValueAt(j, 10));
            if(conclus_c!=null)
           conclus_c.setSelectedItem(dtm.getValueAt(j, 10));
    }

    private EditQueja() {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrega = new javax.swing.JComboBox<>();
        procede = new javax.swing.JComboBox<>();
        entidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Vias = new javax.swing.JComboBox<>();
        Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        caso = new javax.swing.JComboBox<>();
        clasificacio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        modalida = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        satisfaccion1 = new javax.swing.JLabel();
        recibo = new com.toedter.calendar.JDateChooser();
        satis = new javax.swing.JComboBox<>();
        termino = new com.toedter.calendar.JDateChooser();
        conclus_a = new javax.swing.JComboBox<>();
        departamento = new com.toedter.calendar.JDateChooser();
        conclus_b = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        conclus_c = new javax.swing.JComboBox<>();
        respuesta = new com.toedter.calendar.JDateChooser();
        entidad1 = new javax.swing.JLabel();
        Conclusion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        entrega.setBackground(new java.awt.Color(204, 204, 255));
        entrega.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        entrega.setForeground(new java.awt.Color(0, 0, 51));
        entrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Entregado", "No Entregado" }));
        entrega.setBorder(null);
        entrega.setFocusable(false);
        entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entregaActionPerformed(evt);
            }
        });

        procede.setBackground(new java.awt.Color(204, 204, 255));
        procede.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        procede.setForeground(new java.awt.Color(0, 0, 51));
        procede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "1. MINSAP", "2. PCC", "3. APPP", "4. Directo al Sectorial", "5. Otros" }));
        procede.setBorder(null);
        procede.setFocusable(false);
        procede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procedeActionPerformed(evt);
            }
        });

        entidad.setBackground(new java.awt.Color(204, 204, 255));
        entidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        entidad.setForeground(new java.awt.Color(0, 0, 51));
        entidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "1.Recursos Humanos", "2. Higiene y Epidemiología", "3. Asistencia Médica", "4. Vicedirección Económica", "5. Vicedirección General" }));
        entidad.setBorder(null);
        entidad.setFocusable(false);
        entidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entidadActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Clasificación:");
        jLabel4.setToolTipText("");

        ADD.setBackground(new java.awt.Color(255, 255, 255));
        ADD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ADD.setForeground(new java.awt.Color(0, 0, 51));
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/True Editar.png"))); // NOI18N
        ADD.setBorder(null);
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Vías:");
        jLabel1.setToolTipText("");

        Vias.setBackground(new java.awt.Color(204, 204, 255));
        Vias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Vias.setForeground(new java.awt.Color(0, 0, 51));
        Vias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "1. Carta", "2. Entrevista", "3. Teléfono" }));
        Vias.setBorder(null);
        Vias.setFocusable(false);

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 0, 51));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/Rectángulo 3.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Modalidad:");
        jLabel2.setToolTipText("");

        name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 51, 102)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Caso de prensa:");
        jLabel5.setToolTipText("");

        name1.setBackground(new java.awt.Color(255, 255, 255));
        name1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 102, 153));
        name1.setText("Nombre y Apellidos:");
        name1.setToolTipText("");

        caso.setBackground(new java.awt.Color(204, 204, 255));
        caso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caso.setForeground(new java.awt.Color(0, 0, 51));
        caso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "No", "Plataforma Bienestar", "Periódico Granma" }));
        caso.setBorder(null);
        caso.setFocusable(false);

        clasificacio.setBackground(new java.awt.Color(204, 204, 255));
        clasificacio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        clasificacio.setForeground(new java.awt.Color(0, 0, 51));
        clasificacio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "1. Asistencia Médica", "2. APS y Enfermería", "3. Por fallecimiento", "4. Higiene", "5. Medicina óptica y audición", "6. Asistencia Social", "7. Docencia", "8. Laborales", "9. Problemas Administrativos", "10. Ambulancias", "11. Solicitud de RH y Materiales", "12. Construcción y Mantenimiento", "13. Trato", "14. Condiciones de trabajo", "15. Vivienda", "16. Salidas del pais ", "17. Otras", " " }));
        clasificacio.setBorder(null);
        clasificacio.setFocusable(false);
        clasificacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasificacioActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Fecha Recibo:");
        jLabel6.setToolTipText("");

        modalida.setBackground(new java.awt.Color(204, 204, 255));
        modalida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        modalida.setForeground(new java.awt.Color(0, 0, 51));
        modalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "1. Solicitud", "2. Queja", "3. Anónimo o Denuncia", "4. Sugerencia", "5. Reclamaciones", "6. Reconocimientos" }));
        modalida.setBorder(null);
        modalida.setFocusable(false);
        modalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modalidaActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Fecha Término:");
        jLabel7.setToolTipText("");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Procedencia:");
        jLabel3.setToolTipText("");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Fecha Entrega Dpto Afectado:");
        jLabel8.setToolTipText("");

        satisfaccion1.setBackground(new java.awt.Color(255, 255, 255));
        satisfaccion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        satisfaccion1.setForeground(new java.awt.Color(0, 102, 153));
        satisfaccion1.setText("Satisfacción:");
        satisfaccion1.setToolTipText("");

        recibo.setBackground(new java.awt.Color(255, 255, 255));
        recibo.setForeground(new java.awt.Color(0, 0, 51));
        recibo.setDateFormatString("yyyy-MM-dd");
        recibo.setIcon(null);

        satis.setBackground(new java.awt.Color(204, 204, 255));
        satis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        satis.setForeground(new java.awt.Color(0, 0, 51));
        satis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Conforme", "Conforme en Parte", "Inconforme" }));
        satis.setBorder(null);
        satis.setFocusable(false);
        satis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satisActionPerformed(evt);
            }
        });

        termino.setBackground(new java.awt.Color(255, 255, 255));
        termino.setForeground(new java.awt.Color(0, 0, 51));
        termino.setDateFormatString("yyyy-MM-dd");
        termino.setIcon(null);

        conclus_a.setBackground(new java.awt.Color(204, 204, 255));
        conclus_a.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        conclus_a.setForeground(new java.awt.Color(0, 0, 51));
        conclus_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "Con Razón", "Sin Razón", "Con Razón en Parte" }));
        conclus_a.setBorder(null);
        conclus_a.setFocusable(false);
        conclus_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conclus_aActionPerformed(evt);
            }
        });

        departamento.setBackground(new java.awt.Color(255, 255, 255));
        departamento.setForeground(new java.awt.Color(0, 0, 51));
        departamento.setDateFormatString("yyyy-MM-dd");
        departamento.setIcon(null);

        conclus_b.setBackground(new java.awt.Color(204, 204, 255));
        conclus_b.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        conclus_b.setForeground(new java.awt.Color(0, 0, 51));
        conclus_b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Resuelto", "En vías de solución", "Sin solución" }));
        conclus_b.setBorder(null);
        conclus_b.setFocusable(false);
        conclus_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conclus_bActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Fecha Entrega de Respuesta:");
        jLabel9.setToolTipText("");

        conclus_c.setBackground(new java.awt.Color(204, 204, 255));
        conclus_c.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        conclus_c.setForeground(new java.awt.Color(0, 0, 51));
        conclus_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Con Lugar", "Con Lugar en Parte", "Sin Lugar" }));
        conclus_c.setBorder(null);
        conclus_c.setFocusable(false);
        conclus_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conclus_cActionPerformed(evt);
            }
        });

        respuesta.setBackground(new java.awt.Color(255, 255, 255));
        respuesta.setForeground(new java.awt.Color(0, 0, 51));
        respuesta.setDateFormatString("yyyy-MM-dd");
        respuesta.setIcon(null);

        entidad1.setBackground(new java.awt.Color(255, 255, 255));
        entidad1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        entidad1.setForeground(new java.awt.Color(0, 102, 153));
        entidad1.setText("Entidad Afectada:");
        entidad1.setToolTipText("");

        Conclusion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Conclusion.setForeground(new java.awt.Color(0, 0, 51));
        Conclusion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/True Conclusiones.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(termino, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit)
                        .addGap(48, 48, 48))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(entidad1)
                                                    .addComponent(Vias, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(entidad, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(modalida, 0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel2)
                                            .addComponent(procede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(name1)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conclus_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(satisfaccion1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(satis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(conclus_a, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                        .addComponent(conclus_b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clasificacio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Conclusion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(entidad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(clasificacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Conclusion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(satisfaccion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(satis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(conclus_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conclus_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(conclus_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(termino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entregaActionPerformed
        int item = entrega.getSelectedIndex();
        int mod = modalida.getSelectedIndex();
        if (item==1) {
            satis.setVisible(true);
            satisfaccion1.setVisible(true);
        }
        if (item==2 || item==0){
            satis.setVisible(false);
            satisfaccion1.setVisible(false);
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);

        }

        if(mod==0 && item==2 || mod==0 && item==0){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
        if(mod==1 && item==1){
            conclus_a.setVisible(false);
            conclus_b.setVisible(true);
            conclus_c.setVisible(false);
        }
        if(mod==2&& item==1){
            conclus_a.setVisible(true);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
        if(mod==3&& item==1){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(true);
        }
        if(mod==4&& item==2 || mod==0 && item==0){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
        if(mod==5&& item==1){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(true);
        }
        if(mod==6&& item==2 || mod==0 && item==0){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
        if (item==2||item==0){
            respuesta.setVisible(false);
            jLabel9.setVisible(false);
        }
        if (item==1){
            respuesta.setVisible(true);
            jLabel9.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_entregaActionPerformed

    private void procedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procedeActionPerformed

    private void entidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entidadActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
  if (conclus_a.isVisible()==false)
          conclus_a.setSelectedIndex(0);
          if (conclus_b.isVisible()==false)
          conclus_b.setSelectedIndex(0);
          if (conclus_c.isVisible()==false)
          conclus_c.setSelectedIndex(0);
          if (satis.isVisible()==false)
          satis.setSelectedIndex(0);
          if (respuesta.isVisible()==false)
          respuesta.setCalendar(null);
          
        //Recoger datos//

        String nombre=name.getText(); 
        String entAfectada= entidad.getSelectedItem().toString();
        String modalidad=modalida.getSelectedItem().toString();
        String via=Vias.getSelectedItem().toString();
        String entregado=entrega.getSelectedItem().toString();
        String procedencia=procede.getSelectedItem().toString();
        String clasificacion=clasificacio.getSelectedItem().toString();
        String casoPrensa=caso.getSelectedItem().toString();
   
        String satisfaccion=satis.getSelectedItem().toString();
        String entrega1=this.entrega.getSelectedItem().toString();
      

      

        String conclus=null;
        int a1=conclus_a.getSelectedIndex();
         if (a1==1){
             conclus="Con Razón";
         }
         if (a1==2){
             conclus="Sin Razón";
         }
         if (a1==3){
             conclus="Con Razón en Parte";
         }
         //Condicion para b
          int b1=conclus_b.getSelectedIndex();
         if (b1==1){
             conclus="Resuelto";
         }
         if (b1==2){
             conclus="En vias de solución";
         }
         if (b1==3){
             conclus="Sin solución";
         }
         //Condicion para c
          int c1=conclus_c.getSelectedIndex();
         if (c1==1){
             conclus="Con Lugar";
         }
         if (c1==2){
             conclus="Con Lugar en Parte";
         }
         if (c1==3){
             conclus="Sin Lugar ";
         }
         
         //Condicion para satis
      //   int s1=satis.getSelectedIndex();
        // if (s1==1)
          //   satis=satis+" y Conforme";
        ////  if (s1==2)
           //  satis=satis+" y Conforme en Parte";
           //if (s1==3)
            // satis=satis+" e Inconforme";

        
        
      String fechaR=((JTextField)recibo.getDateEditor().getUiComponent()).getText();
      String fechaT=((JTextField)termino.getDateEditor().getUiComponent()).getText();
      String fechaDeEntregaAlDepartamentoAfectado=((JTextField)departamento.getDateEditor().getUiComponent()).getText();
      String fechtaDeEntregaDeLaRespuesta=((JTextField)respuesta.getDateEditor().getUiComponent()).getText();
       
       Queja queja = new Queja(nombre,entAfectada,modalidad,via,procedencia,clasificacion,casoPrensa,fechaR,fechaT,fechaDeEntregaAlDepartamentoAfectado,fechtaDeEntregaDeLaRespuesta,conclus,satisfaccion,entrega1);


          int x = Integer.parseInt(reg.num.getText());
           APP m=new APP();
           
 
        if (nombre.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Debe introducir Nombre y Apellidos del Demandante");

        }  else {
              m.EditQueja(x-1,queja);
            JOptionPane.showMessageDialog(null, "Queja Editada exitosamente");
        
          
                    dtm.setValueAt(x,j ,0);
           dtm.setValueAt(m.getQueja(x-1).getNombre(),j ,1); 
           dtm.setValueAt(m.getQueja(x-1).getEntAfectada(),j,2);
           dtm.setValueAt(m.getQueja(x-1).getModalidad(),j,3);
            dtm.setValueAt(m.getQueja(x-1).getVia(),j,4);
             dtm.setValueAt(m.getQueja(x-1).getProcedencia(),j,5);
              dtm.setValueAt(m.getQueja(x-1).getClasificacion(),j,6);
               dtm.setValueAt(m.getQueja(x-1).getCasoPrensa(),j,7);
               dtm.setValueAt(m.getQueja(x-1).getSatisfaccion2(),j,8);
                dtm.setValueAt(m.getQueja(x-1).getSatifaccion(),j,9);
                dtm.setValueAt(m.getQueja(x-1).getConclusion(),j,10);
                 dtm.setValueAt(m.getQueja(x-1).getFechaR(),j,11);
                  dtm.setValueAt(m.getQueja(x-1).getFechaT(),j,12);
                  dtm.setValueAt(m.getQueja(x-1).getFechaDeEntregaAlDepartamentoAfectado(),j,13);
                  dtm.setValueAt(m.getQueja(x-1).getFechtaDeEntregaDeLaRespuesta(),j,14);
                  
                  
                  
                  
               
         
          this.dispose();
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
  
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = false;
        boolean minusculas = false;
        boolean espacio = false;

        mayusculas = key >= 63 && key <= 90;
        minusculas = key >= 95 && key <= 122;
        espacio = key == 32;

        if (!(minusculas || mayusculas || espacio))
        evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyTyped

    private void clasificacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasificacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clasificacioActionPerformed

    private void modalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modalidaActionPerformed
        int item = modalida.getSelectedIndex();
        int con = entrega.getSelectedIndex();
        if(item==0 && con==2 || item==0 && con==0 || item==0){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
        if(item==1 && con==1){
            conclus_a.setVisible(false);
            conclus_b.setVisible(true);
            conclus_c.setVisible(false);
        }
        if(item==2&& con==1){
            conclus_a.setVisible(true);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
        if(item==3&& con==1){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(true);
        }
        if(item==4&& con==2 || item==0 && con==0|| item==4){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
        if(item==5&& con==1){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(true);
        }
        if(item==6&& con==2 || item==0 && con==0 || item==6){
            conclus_a.setVisible(false);
            conclus_b.setVisible(false);
            conclus_c.setVisible(false);
        }
    }//GEN-LAST:event_modalidaActionPerformed

    private void satisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satisActionPerformed

    private void conclus_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conclus_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conclus_aActionPerformed

    private void conclus_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conclus_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conclus_bActionPerformed

    private void conclus_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conclus_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conclus_cActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditQueja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQueja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQueja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQueja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQueja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JLabel Conclusion;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> Vias;
    private javax.swing.JComboBox<String> caso;
    private javax.swing.JComboBox<String> clasificacio;
    private javax.swing.JComboBox<String> conclus_a;
    private javax.swing.JComboBox<String> conclus_b;
    private javax.swing.JComboBox<String> conclus_c;
    private com.toedter.calendar.JDateChooser departamento;
    private javax.swing.JComboBox<String> entidad;
    private javax.swing.JLabel entidad1;
    private javax.swing.JComboBox<String> entrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> modalida;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name1;
    private javax.swing.JComboBox<String> procede;
    private com.toedter.calendar.JDateChooser recibo;
    private com.toedter.calendar.JDateChooser respuesta;
    private javax.swing.JComboBox<String> satis;
    private javax.swing.JLabel satisfaccion1;
    private com.toedter.calendar.JDateChooser termino;
    // End of variables declaration//GEN-END:variables
}
