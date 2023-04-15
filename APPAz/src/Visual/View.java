package Visual;



import GestionDeQuejas.APP;
import GestionDeQuejas.Connector;
import GestionDeQuejas.Queja;
import com.toedter.calendar.JYearChooser;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;



public class View extends javax.swing.JFrame {
    public int contreg=0;
    Connector enlace=new Connector ();

    /**
     *
     */
    public  Connection  conect=enlace.conectar();
    Connection conect2=enlace.conectar();
   public static int  indicador=1;
View view;
    public static int years;

 public static DefaultTableModel dtm;
 public DefaultTableModel ctm;
   
    
    

    View(APP app) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    

   
    
    public void probarConexion(){
             if (conect==null){
                 JOptionPane.showMessageDialog(null, "No se logro la conexion");
             }
//         }else {
//                 JOptionPane.showMessageDialog(null, "Conexion satisfactoria");
//             }
    }
    
 
    
    public void agregarFila(int j){
               
            for (int i = 0; i <dtm.getRowCount() && app.getQueja(j)!=null; i++) {
   
        
           dtm.setValueAt(app.getQueja(j).getNombre(),i ,1); 
           dtm.setValueAt(app.getQueja(j).getEntAfectada(),i,2);
           dtm.setValueAt(app.getQueja(j).getModalidad(),i,3);
            dtm.setValueAt(app.getQueja(j).getVia(),i,4);
             dtm.setValueAt(app.getQueja(j).getProcedencia(),i,5);
              dtm.setValueAt(app.getQueja(j).getClasificacion(),i,6);
               dtm.setValueAt(app.getQueja(j).getCasoPrensa(),i,7);
                dtm.setValueAt(app.getQueja(j).getConclusion(),i,8);
                dtm.setValueAt(app.getQueja(j).getSatifaccion(),i,9);
                 dtm.setValueAt(app.getQueja(j).getSatisfaccion2(),i,10);
                 dtm.setValueAt(app.getQueja(j).getFechaR(),i,11);
                  dtm.setValueAt(app.getQueja(j).getFechaT(),i,12);
                  dtm.setValueAt(app.getQueja(j).getFechaDeEntregaAlDepartamentoAfectado(),i,13);
                  dtm.setValueAt(app.getQueja(j).getFechtaDeEntregaDeLaRespuesta(),i,14);
                  j++;
            }
               
       
    }
   
    public void borrarTabla(){
          for (int j=0;j<dtm.getRowCount();j++){
               dtm.setValueAt(null,j ,0);         
           dtm.setValueAt(null,j ,1); 
          dtm.setValueAt(null,j,2);
          dtm.setValueAt(null,j,3);
            dtm.setValueAt(null,j,4);
            dtm.setValueAt(null,j,5);
              dtm.setValueAt(null,j,6);
               dtm.setValueAt(null,j,7);
               dtm.setValueAt(null,j,8);
                dtm.setValueAt(null,j,9);
                 dtm.setValueAt(null,j,10);
                  dtm.setValueAt(null,j,11);
                  dtm.setValueAt(null,j,12);
                  dtm.setValueAt(null,j,13);
                   dtm.setValueAt(null,j,14);
         }
    }
    
    public static void buscar(String registros[],int i){
   
             dtm.setValueAt(registros[0], i, 0);
             dtm.setValueAt(registros[1], i, 1);
             dtm.setValueAt(registros[2], i, 2);
             dtm.setValueAt(registros[3], i, 3);
             dtm.setValueAt(registros[4], i, 4);
             dtm.setValueAt(registros[5], i, 5);
             dtm.setValueAt(registros[6], i, 6);
             dtm.setValueAt(registros[7], i, 7);
             dtm.setValueAt(registros[8], i, 8);
             dtm.setValueAt(registros[9], i, 9);
             dtm.setValueAt(registros[10], i, 10);
             dtm.setValueAt(registros[11], i, 11);
             dtm.setValueAt(registros[12], i, 12);
             dtm.setValueAt(registros[13], i, 13);
             dtm.setValueAt(registros[14], i, 14);
          
    }     



    /**}
     * Creates new form View
     */
    public View() {
        initComponents();
        
     probarConexion();   
        
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("Gestor-Quejas");
         app = new APP();
          app.crearTabla();
          dtm = (DefaultTableModel) jTable1.getModel();
          ctm = (DefaultTableModel) jTable1.getModel();
          //////////////////////////////////////////
          panelsub.setVisible(false);
           panelsub2.setVisible(false);
          menulateral.setVisible(false);
            //////////////////////////////////////////
       setExtendedState(view.MAXIMIZED_BOTH);
          for(int i=0 ; i < dtm.getRowCount() ;i++){
          dtm.setValueAt(i+1,i ,0);       
          }
         jTable1.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
         jTable1.getTableHeader().setOpaque(false);
         jTable1.getTableHeader().setBackground(new Color(255,102,102));
         
         /////////////Tamaño Columnas///////////////////////////////
     
       /////////////////////////////////////////////////////////////////
       
          app.leerDatos1(app.getSqlh2());
          
    
          agregarFila(0);
         
         
            
          
         
         
         
         
         
         
         
    }
    

       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new org.jdesktop.swingx.JXTable();
        jLabel2 = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        pagnum = new javax.swing.JTextField();
        anno = new com.toedter.calendar.JYearChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menulateral = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelsub = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        apariciencia = new javax.swing.JButton();
        panelsub2 = new javax.swing.JPanel();
        onlyf = new javax.swing.JButton();
        original = new javax.swing.JButton();
        sinf = new javax.swing.JButton();
        showmenu = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();

        jMenuItem11.setText("jMenuItem11");

        jMenuItem14.setText("jMenuItem14");

        jMenuItem40.setText("jMenuItem40");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion De Quejas");
        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1164, 760));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1186, 760));
        jPanel1.setMinimumSize(new java.awt.Dimension(1164, 760));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre y Apellidos", "Ent. Afectada", "Modalidad", "Vía", "Procedencia", "Clasificación", "Casos de Prensa", "Entrega", "Satisfacción", "Conclusion", "F.Recibida", "F.Término", "F.Entrega Dep.Afect.", "F.Entrega Respuesta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setGridColor(new java.awt.Color(153, 153, 255));
        jTable1.setMaximumSize(new java.awt.Dimension(225, 1800));
        jTable1.setPreferredSize(new java.awt.Dimension(225, 1800));
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.setShowGrid(true);
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/True Quejas.png"))); // NOI18N

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/True anterior.png"))); // NOI18N
        anterior.setBorder(null);
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/True siguiente.png"))); // NOI18N
        siguiente.setBorder(null);
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        pagnum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pagnum.setForeground(new java.awt.Color(0, 51, 102));
        pagnum.setText("Página 1/4");
        pagnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagnumActionPerformed(evt);
            }
        });

        anno.setBackground(new java.awt.Color(255, 255, 255));
        anno.setEndYear(2030);
        anno.setStartYear(2022);
        anno.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                annoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        anno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                annoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                annoMousePressed(evt);
            }
        });
        anno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                annoKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Buscar:");

        menulateral.setBackground(new java.awt.Color(112, 112, 112));
        menulateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        menulateral.setForeground(new java.awt.Color(102, 102, 102));
        menulateral.setMinimumSize(new java.awt.Dimension(226, 706));
        menulateral.setPreferredSize(new java.awt.Dimension(226, 712));

        logo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/checklist_clipboard_list_document_archive_icon_192529.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menú");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de Quejas");

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alterar Tabla.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panelsub.setBackground(new java.awt.Color(112, 112, 112));
        panelsub.setDoubleBuffered(false);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 153, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar ultimo.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 153, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar todo.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelsubLayout = new javax.swing.GroupLayout(panelsub);
        panelsub.setLayout(panelsubLayout);
        panelsubLayout.setHorizontalGroup(
            panelsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsubLayout.createSequentialGroup()
                .addGroup(panelsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelsubLayout.setVerticalGroup(
            panelsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsubLayout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );

        jButton16.setBackground(new java.awt.Color(102, 102, 102));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscador.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(102, 102, 102));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acerca de.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(102, 102, 102));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(102, 102, 102));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButton19.setBorder(null);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        apariciencia.setText("Apariencia");
        apariciencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aparicienciaActionPerformed(evt);
            }
        });

        panelsub2.setBackground(new java.awt.Color(112, 112, 112));

        onlyf.setText("Tabla de fechas");
        onlyf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlyfActionPerformed(evt);
            }
        });

        original.setText("Tabla por defecto");
        original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originalActionPerformed(evt);
            }
        });

        sinf.setText("Tabla sin fechas");
        sinf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelsub2Layout = new javax.swing.GroupLayout(panelsub2);
        panelsub2.setLayout(panelsub2Layout);
        panelsub2Layout.setHorizontalGroup(
            panelsub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsub2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelsub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(original, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sinf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onlyf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panelsub2Layout.setVerticalGroup(
            panelsub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsub2Layout.createSequentialGroup()
                .addComponent(original)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sinf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onlyf))
        );

        javax.swing.GroupLayout menulateralLayout = new javax.swing.GroupLayout(menulateral);
        menulateral.setLayout(menulateralLayout);
        menulateralLayout.setHorizontalGroup(
            menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menulateralLayout.createSequentialGroup()
                .addGroup(menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelsub2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menulateralLayout.createSequentialGroup()
                .addGroup(menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menulateralLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menulateralLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(panelsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menulateralLayout.createSequentialGroup()
                        .addGroup(menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apariciencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menulateralLayout.setVerticalGroup(
            menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menulateralLayout.createSequentialGroup()
                .addGroup(menulateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menulateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addGroup(menulateralLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelsub, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apariciencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelsub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        showmenu.setBackground(new java.awt.Color(105, 117, 119));
        showmenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showmenu.setForeground(new java.awt.Color(105, 127, 159));
        showmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tres lineas.png"))); // NOI18N
        showmenu.setToolTipText("");
        showmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showmenuMouseClicked(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 51, 102));
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menulateral, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(anno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(725, 725, 725)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pagnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(showmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(anno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pagnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(menulateral, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagnumActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
         
     
       borrarTabla();
        if(indicador<4){
             indicador++;
        }
        pagnum.setText("Página "+indicador+ "/4");
        if (indicador==2){
            int x=100; 
               for(int i=0 ; i < dtm.getRowCount() ;i++){
                   
                 
          dtm.setValueAt(x+1,i ,0);
          x++;
          
          
          }
               agregarFila(100);  
           }
         if (indicador==3){
              int x=200;
               for(int i=0 ; i < dtm.getRowCount() ;i++){
         
          dtm.setValueAt(x+1,i ,0); 
           x++;
          }
               agregarFila(200);
           }
          if (indicador==4){
               int x=300;
               for(int i=0 ; i < dtm.getRowCount() ;i++){
             
          dtm.setValueAt(x+1,i ,0);      
           x++;
          }
               agregarFila(300);
           }
           if (indicador==1){
               for(int i=0 ; i < dtm.getRowCount() ;i++){
          dtm.setValueAt(i+1,i ,0);    
          
          }
               agregarFila(0);
           }
       
        
       
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
       
        
        borrarTabla();
        if(indicador>1){
        indicador--;
        }
         pagnum.setText("Página "+indicador+ "/4");
         if (indicador==2){
                 int x=100;
               for(int i=0 ; i < dtm.getRowCount() ;i++){
         
          dtm.setValueAt(x+1,i ,0); 
           x++;
          }
               agregarFila(100);
           }
         if (indicador==3){
               int x=200;
               for(int i=0 ; i < dtm.getRowCount() ;i++){
          
          dtm.setValueAt(x+1,i ,0);  
           x++;
          }
               agregarFila(200);
           }
          if (indicador==4){
               int x=300;
               for(int i=0 ; i < dtm.getRowCount() ;i++){
        
          dtm.setValueAt(x+1,i ,0);   
           x++;
          }
               agregarFila(300);
           }
           if (indicador==1){
               for(int i=0 ; i < dtm.getRowCount() ;i++){
          dtm.setValueAt(i+1,i ,0);       
          }
               agregarFila(0);
           }
    }//GEN-LAST:event_anteriorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(panelsub.isVisible()==false){
    panelsub.setVisible(true);
    }    
    else{
    panelsub.setVisible(false);
    }
       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        AcercaDe acerca = new AcercaDe(app);
       acerca.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Registro registro = new Registro(app);
       registro.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      IntroducirNumeroDeLaQuejaParaEditar1 edit = new IntroducirNumeroDeLaQuejaParaEditar1();
       edit.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        APP m=new APP();
     m.delete(m.getCant());
        m.setCant(m.getCant()-1);
        Registro p=new Registro();
        int j=m.getCant();
        m.delete(j);
        
          if(View.indicador==2 && j>=101 && j<202){
         j=m.getCant()%100;
          
         if (j==0){
             j=100;
       
         }else j=j-1;
      
       }
       if(View.indicador==3 && j>=201 && j<302){
         j=m.getCant()%100;
        
         if (j==0){
             j=100;
           
         }else j=j-1;
           
         
       }
       
         if(View.indicador==4 && j>=301 && j<401 ){
         j=m.getCant()%100;
        
         if (j==0){
             j=100;
           
         }else j=j-1;
         
      
       }
         if(View.indicador==1 && j<100 && j>=0){
             j--;
            
         }
         for (int i=1;i<15;i++){
               dtm.setValueAt(null,j+1,i);         
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int s=JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar todo?","Eliminar Todo",JOptionPane.YES_NO_OPTION);
       if(s==0){ 
       app.deleteeverything();
        borrarTabla();
        
       app.setCant(0);}
       if(s==1){
       
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
          try {
            // TODO add your handling code here:
            int x=anno.getYear(); 
         
           
            
            
           if (x==2023){

app.guardartodo1(app.getSql23(),x);
}
if (x==2024){
app.guardartodo1(app.getSql24(),x);
}
if (x==2025){
app.guardartodo1(app.getSql25(),x);
}
if (x==2026){
app.guardartodo1(app.getSql26(),x);
}
if (x==2027){
app.guardartodo1(app.getSql27(),x);
}
if (x==2028){
app.guardartodo1(app.getSql28(),x);
}
if (x==2029){
app.guardartodo1(app.getSql29(),x);
}
if (x==2030){
app.guardartodo1(app.getSql30(),x);
}
if (x==2022){
app.guardartodo1(app.getSQL_INSERTh2(),x);
  
}

           
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }    /////////////
        Busqueda b = new Busqueda(app,anno.getYear());
       b.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
      try {
            // TODO add your handling code here:
            int x=anno.getYear(); 
         
           
            
            
           if (x==2023){

app.guardartodo1(app.getSql23(),x);
}
if (x==2024){
app.guardartodo1(app.getSql24(),x);
}
if (x==2025){
app.guardartodo1(app.getSql25(),x);
}
if (x==2026){
app.guardartodo1(app.getSql26(),x);
}
if (x==2027){
app.guardartodo1(app.getSql27(),x);
}
if (x==2028){
app.guardartodo1(app.getSql28(),x);
}
if (x==2029){
app.guardartodo1(app.getSql29(),x);
}
if (x==2030){
app.guardartodo1(app.getSql30(),x);
}
if (x==2022){
app.guardartodo1(app.getSQL_INSERTh2(),x);
  
}

            JOptionPane.showMessageDialog(null, "Ha guardado correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }    /////////////
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       int option = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "Salir", JOptionPane.OK_CANCEL_OPTION);
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       
// TODO add your handling code here:
      
  borrarTabla();
 Queja x[] = new Queja [1000];
 app.setQueja(x);
 app.setCant(0);
  years=anno.getYear();


if (anno.getYear()==2023){

app.leerDatos1(app.getStabla23());
}
if (anno.getYear()==2024){
app.leerDatos1(app.getStabla24());
}
if (anno.getYear()==2025){
app.leerDatos1(app.getStabla25());
}
if (anno.getYear()==2026){
app.leerDatos1(app.getStabla26());
}
if (anno.getYear()==2027){
app.leerDatos1(app.getStabla27());
}
if (anno.getYear()==2028){
app.leerDatos1(app.getStabla28());
}
if (anno.getYear()==2029){
app.leerDatos1(app.getStabla29());
}
if (anno.getYear()==2030){
app.leerDatos1(app.getStabla30());
}
if (anno.getYear()==2022){
app.leerDatos1(app.getSqlh2());
  
}
 agregarFila(0);
  for(int i=0 ; i < dtm.getRowCount() ;i++){
          dtm.setValueAt(i+1,i ,0);
  }
       
//       try {  
//          for (int j=0;j<100;j++){
//            
//           dtm.setValueAt(app.getQueja(j).getNombre(),j ,1); 
//           dtm.setValueAt(app.getQueja(j).getEntAfectada(),j,2);
//           dtm.setValueAt(app.getQueja(j).getModalidad(),j,3);
//            dtm.setValueAt(app.getQueja(j).getVia(),j,4);
//             dtm.setValueAt(app.getQueja(j).getProcedencia(),j,5);
//              dtm.setValueAt(app.getQueja(j).getClasificacion(),j,6);
//               dtm.setValueAt(app.getQueja(j).getCasoPrensa(),j,7);
//                dtm.setValueAt(app.getQueja(j).getConclusion(),j,8);
//                dtm.setValueAt(app.getQueja(j).getSatifaccion(),j,9);
//                  dtm.setValueAt(app.getQueja(j).getSatisfaccion2(),j,10);
//                  dtm.setValueAt(app.getQueja(j).getFechaR(),j,11);
//                  dtm.setValueAt(app.getQueja(j).getFechaT(),j,12);
//                  dtm.setValueAt(app.getQueja(j).getFechaDeEntregaAlDepartamentoAfectado(),j,13);
//                  dtm.setValueAt(app.getQueja(j).getFechtaDeEntregaDeLaRespuesta(),j,14);
//        }
//}catch (Exception e){
//}
//
//
//          Queja x[] = new Queja [1000];
//       int q[]=new int [1000];
//       app.setBuscador(x);
//       app.setPos(q);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void showmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showmenuMouseClicked
        if(menulateral.isVisible()==false){
        menulateral.setVisible(true);
       
        }
        else{
        menulateral.setVisible(false);
       
        }
        
        
    }//GEN-LAST:event_showmenuMouseClicked

    private void annoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_annoAncestorAdded
        // TODO add your handling code here:
        APP x=new APP();
       
            
        
    }//GEN-LAST:event_annoAncestorAdded

    private void annoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_annoKeyPressed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_annoKeyPressed

    private void annoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annoMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_annoMouseClicked

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        // TODO add your handling code here:
       String x="quejas";
       if (years==2023){
           x="q";
       }
        if (years==2024){
           x="qu";
       }
          if (years==2025){
           x="que";
       }
            if (years==2026){
           x="quej";
       }
                if (years==2027){
           x="queja";
       }
                    if (years==2028){
           x="quejass";
       }
                        if (years==2029){
           x="quejasss";
       }
                            if (years==2030){
           x="quejassss";
       }
       
        String [] titulos= {"No." ,"Nombre y Apellidos","Ent. Afectada","Modalidad","Vía","Procedencia","Clasificación","Caso de Prensa","Entrega","Satisfacción","Conclusion","F.Recibida","F.Termino","F.Entrega Dep.Afect. ","F.Entrega Respuesta"};
        String[] registros=new String[50];
        
       String sql = "SELECT *FROM " + x + " WHERE POSICION LIKE '%" + buscar.getText()+ "%' "
               +"OR NOMBREYAPELLIDOS LIKE '%" + buscar.getText()+ "%' "
               +"OR ENTIDADAFECTADA LIKE '%" + buscar.getText()+ "%' "
               +"OR MODALIDAD LIKE '%" + buscar.getText()+ "%' "
               +"OR VIA LIKE '%" + buscar.getText()+ "%' "
               +"OR PROCEDENCIA LIKE '%" + buscar.getText()+ "%' "
               +"OR CLASIFICACION LIKE '%" + buscar.getText()+ "%' "
               +"OR CASOPRENSA LIKE '%" + buscar.getText()+ "%' "
               +"OR ESTADODEENTREGA LIKE '%" + buscar.getText()+ "%' "
               +"OR SATISFACCION LIKE '%" + buscar.getText()+ "%' "
               +"OR CONCLUSION LIKE '%" + buscar.getText()+ "%' "
               +"OR FECHARECIVIDA LIKE '%" + buscar.getText()+ "%' "
               +"OR FECHATERMINO LIKE '%" + buscar.getText()+ "%' "
               +"OR FECHAENTREGAALDEP LIKE '%" + buscar.getText()+ "%' "
               +"OR FECHAENTREGARESPUESTA LIKE '%" + buscar.getText()+ "%' ";
       
       ctm=new DefaultTableModel(null,titulos);
            try {
                Statement st =(Statement) conect.createStatement();
                ResultSet rs= st.executeQuery(sql);
                
                while(rs.next()){
                registros[0]=rs.getString("POSICION");
                registros[1]=rs.getString("NOMBREYAPELLIDOS");
                registros[2]=rs.getString("ENTIDADAFECTADA");
                registros[3]=rs.getString("MODALIDAD");
                registros[4]=rs.getString("VIA");
                registros[5]=rs.getString("PROCEDENCIA");
                registros[6]=rs.getString("CLASIFICACION");
                registros[7]=rs.getString("CASOPRENSA");
                registros[8]=rs.getString("ESTADODEENTREGA");
                registros[9]=rs.getString("SATISFACCION");
                registros[10]=rs.getString("CONCLUSION");
                registros[11]=rs.getString("FECHARECIVIDA");
                registros[12]=rs.getString("FECHATERMINO");
                registros[13]=rs.getString("FECHAENTREGAALDEP");
                registros[14]=rs.getString("FECHAENTREGARESPUESTA");
               
                ctm.addRow(registros);
               
                }
               jTable1.setModel(ctm);
      
              if (buscar.getText().equalsIgnoreCase(""))
                   jTable1.setModel(dtm);
              
            } catch (SQLException ex) {
               
            }
       
               
    }//GEN-LAST:event_buscarKeyPressed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_buscarMouseClicked

    private void annoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_annoMouseEntered

    private void annoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_annoMousePressed

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
    

   

// TODO add your handling code here:
       
       borrarTabla();
 Queja x[] = new Queja [1000];
 app.setQueja(x);
 app.setCant(0);
  years=anno.getYear();


if (anno.getYear()==2023){

app.leerDatos1(app.getStabla23());
}
if (anno.getYear()==2024){
app.leerDatos1(app.getStabla24());
}
if (anno.getYear()==2025){
app.leerDatos1(app.getStabla25());
}
if (anno.getYear()==2026){
app.leerDatos1(app.getStabla26());
}
if (anno.getYear()==2027){
app.leerDatos1(app.getStabla27());
}
if (anno.getYear()==2028){
app.leerDatos1(app.getStabla28());
}
if (anno.getYear()==2029){
app.leerDatos1(app.getStabla29());
}
if (anno.getYear()==2030){
app.leerDatos1(app.getStabla30());
}
if (anno.getYear()==2022){
app.leerDatos1(app.getSqlh2());
  
}
 agregarFila(0);
  for(int i=0 ; i < dtm.getRowCount() ;i++){
          dtm.setValueAt(i+1,i ,0);
  }
    }//GEN-LAST:event_logoMouseClicked

    private void aparicienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aparicienciaActionPerformed
         if(panelsub2.isVisible()==false){
    panelsub2.setVisible(true);
    }    
    else{
    panelsub2.setVisible(false);
    }
    }//GEN-LAST:event_aparicienciaActionPerformed

    private void sinfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinfActionPerformed

       // jScrollPane2.setVisible(false);
       
        
        
    }//GEN-LAST:event_sinfActionPerformed

    private void originalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originalActionPerformed

         // jScrollPane2.setVisible(true);
    }//GEN-LAST:event_originalActionPerformed

    private void onlyfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlyfActionPerformed
         
           //jScrollPane2.setVisible(false);
    }//GEN-LAST:event_onlyfActionPerformed

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
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
      
            public void run() {
                new View().setVisible(true);
            }
        });
    }
public void Color(){}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JYearChooser anno;
    private javax.swing.JButton anterior;
    private javax.swing.JButton apariciencia;
    public javax.swing.JTextField buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static org.jdesktop.swingx.JXTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menulateral;
    private javax.swing.JButton onlyf;
    private javax.swing.JButton original;
    public javax.swing.JTextField pagnum;
    private javax.swing.JPanel panelsub;
    private javax.swing.JPanel panelsub2;
    private javax.swing.JLabel showmenu;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton sinf;
    // End of variables declaration//GEN-END:variables
           private APP app;
   

}
