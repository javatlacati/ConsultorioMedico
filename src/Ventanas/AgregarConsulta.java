/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import dao.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author UNI
 */
public class AgregarConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarDoctor
     */
    public AgregarConsulta() {
        initComponents();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ckL = new javax.swing.JCheckBox();
        ckM = new javax.swing.JCheckBox();
        ckX = new javax.swing.JCheckBox();
        ckJ = new javax.swing.JCheckBox();
        ckV = new javax.swing.JCheckBox();
        ckS = new javax.swing.JCheckBox();
        ckD = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Consulta");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(3, 2));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355686_pencil.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1436141806_sign-check.png"))); // NOI18N
        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355601_sign-error.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(40);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText(" Dias disponibles                                ");

        ckL.setText("L");
        ckL.setEnabled(false);

        ckM.setText("M");
        ckM.setEnabled(false);

        ckX.setText("X");
        ckX.setEnabled(false);

        ckJ.setText("J");
        ckJ.setEnabled(false);

        ckV.setText("V");
        ckV.setEnabled(false);

        ckS.setText("S");
        ckS.setEnabled(false);

        ckD.setText("D");
        ckD.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckL)
                .addGap(5, 5, 5)
                .addComponent(ckM)
                .addGap(5, 5, 5)
                .addComponent(ckX)
                .addGap(5, 5, 5)
                .addComponent(ckJ)
                .addGap(5, 5, 5)
                .addComponent(ckV)
                .addGap(5, 5, 5)
                .addComponent(ckS)
                .addGap(5, 5, 5)
                .addComponent(ckD)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ckL)
                        .addComponent(jLabel1))
                    .addComponent(ckM)
                    .addComponent(ckX)
                    .addComponent(ckJ)
                    .addComponent(ckV)
                    .addComponent(ckS)
                    .addComponent(ckD))
                .addGap(15, 15, 15))
        );

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione la hora de la cita en la tabla de horario");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione la fecha de la cita en los dias disponibles del medico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(25, 25, 25))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 1293, 625);
    }// </editor-fold>//GEN-END:initComponents

    public void Guardar() {

        int fila = jTable1.getSelectedRow();

        if (fila >= 0) {

            String ID = (String) model.getValueAt(fila, 2);
            String Estado = (String) model.getValueAt(fila, 1);
            CharSequence Pendiente = "(Pendiente)";
            if(!Estado.contains(Pendiente)){
                JOptionPane.showMessageDialog(this, "Seleccione una cita PENDIENTE unicamente", "Seleccione",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            int ID_Cita = Integer.parseInt(ID);

            String Paciente = "";
            String Dr = "";

            try {

                resultado = Conexion.consulta("Select Nombres_Med, Apellidos_Med, Nombres, Apellidos"
                        + " from CitaV Where ID_Cita = " + ID_Cita);

                while (resultado.next()) {
                    Dr = resultado.getString(1).trim() + " " + resultado.getString(2).trim();
                    Paciente = resultado.getString(3).trim() + " " + resultado.getString(4).trim();
                }

            } catch (SQLException ex) {

            }

            AgregarDiagnostico AD = new AgregarDiagnostico(null, true);
            AD.setID_Cita(ID_Cita);
            AD.setPaciente(Paciente);
            AD.setMedico(Dr);
            AD.MostrarDrPaciente();
            AD.setAC(this);
            AD.setVisible(true);
            AD.toFront();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione la cita para agregar la consulta | diagnostico | receta | archivos al expediente",
                    "Seleccione", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    ResultSet resultado;

    int ID_Medico = 0;
    boolean flag = false;
    
    public void CargarMedico(){
        
        try{
            
       resultado = Conexion.consulta("Select ID_Medico from Medico where ID_Usuario = "+Principal.ID_Usuario);
       
       while(resultado.next()){
           
           ID_Medico = resultado.getInt(1);
           System.out.println("ID "+ID_Medico);
           
       }
    }catch(SQLException ex){}
    }
    

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        CargarMedico();
        
        Date Hoy = new Date();

        jCalendar1.setMinSelectableDate(Hoy);
        jCalendar1.setDate(Hoy);

        flag = true;

        String[] Header = {"Hora", "Estado", "ID"};

        model.setColumnIdentifiers(Header);

        jTable1.setModel(model);

        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(130);
        columnModel.getColumn(1).setPreferredWidth(535);

        columnModel.getColumn(0).setResizable(false);
        columnModel.getColumn(1).setResizable(false);
        columnModel.getColumn(2).setResizable(false);

        columnModel.getColumn(2).setPreferredWidth(0);
        columnModel.getColumn(2).setMaxWidth(0);
        columnModel.getColumn(2).setMinWidth(0);
        columnModel.getColumn(2).setWidth(0);

        jTable1.setColumnModel(columnModel);

      //   jTable1.removeColumn(jTable1.getColumnModel().getColumn(2));
        CargarHorario();
// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void Limpiar() {

        ckD.setSelected(false);
        ckJ.setSelected(false);
        ckL.setSelected(false);
        ckM.setSelected(false);
        ckS.setSelected(false);
        ckV.setSelected(false);
        ckX.setSelected(false);

        Date hoy = new Date();
        jCalendar1.setDate(hoy);

        String[] Horas = {"8:00 A.M", "9:00 A.M", "10:00 A.M", "11:00 A.M", "12:00 P.M", "1:00 P.M",
            "2:00 P.M", "3:00 P.M", "4:00 P.M", "5:00 P.M"};

        model.setRowCount(10);

        for (int k = 0; k < 10; k++) {

            String hr = Horas[k];
            model.setValueAt(hr, k, 0);
            model.setValueAt("", k, 1);
            model.setValueAt("", k, 2);
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public void CargarHorario() {

                 this.jTable1.setEnabled(true);
                 
        String[] Horas = {"8:00 A.M", "9:00 A.M", "10:00 A.M", "11:00 A.M", "12:00 P.M", "1:00 P.M",
            "2:00 P.M", "3:00 P.M", "4:00 P.M", "5:00 P.M"};

        model.setRowCount(10);

        for (int k = 0; k < 10; k++) {

            String hr = Horas[k];
            model.setValueAt(hr, k, 0);
        }

        String HoraInicio = "8:00 AM";
        String HoraFinal = "5:00 PM";

        boolean L = false;
        boolean M = false;
        boolean X = false;
        boolean J = false;
        boolean V = false;
        boolean S = false;
        boolean D = false;

        ckL.setSelected(L);
        ckM.setSelected(M);
        ckX.setSelected(X);
        ckJ.setSelected(J);
        ckV.setSelected(V);
        ckS.setSelected(S);
        ckD.setSelected(D);
  
        ArrayList<String> Dias = new ArrayList<>();
        ArrayList<String> Hora_Inicial = new ArrayList<>();
        ArrayList<String> Hora_Final = new ArrayList<>();

        try {

            resultado = Conexion.consulta("Select Dia, Hora_Inicial, Hora_Final"
                    + " from Horario where ID_Medico = " + ID_Medico);

            while (resultado.next()) {
                Dias.add(resultado.getString(1));
                Hora_Inicial.add(resultado.getString(2));
                Hora_Final.add(resultado.getString(3));
            }
        } catch (SQLException ex) {

        }

        ArrayList<String> Hrs = new ArrayList<String>();
        ArrayList<String> Estados = new ArrayList<String>();
        ArrayList<String> Pacientes = new ArrayList<String>();
        ArrayList<String> Citas = new ArrayList<String>();

        long date = 0;

        try {
            Date Fecha = jCalendar1.getDate();
            date = Fecha.getTime();
            java.sql.Date Fechac = new java.sql.Date(date);
            resultado = Conexion.consulta("Select Hora_Cita, Estado, Nombres, Apellidos, ID_Cita"
                    + " from CitaV where (ID_Medico = " + ID_Medico
                    + ") and (Fecha_Cita = '" + Fechac + "')");

            while (resultado.next()) {
                Hrs.add(resultado.getString(1));
                Estados.add(resultado.getString(2));
                Pacientes.add(resultado.getString(3).trim() + " " + resultado.getString(4).trim());
                Citas.add(String.valueOf(resultado.getInt(5)));
            }
        } catch (SQLException ex) {

        }

        Date Hoy = jCalendar1.getDate();
        long hoy = Hoy.getTime();

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(hoy);
        int Dia = cal.get(Calendar.DAY_OF_WEEK);

        String Day = "";

        switch (Dia) {
            case 1:
                Day = "D";
                break;

            case 2:
                Day = "L";
                break;

            case 3:
                Day = "M";
                break;

            case 4:
                Day = "X";
                break;

            case 5:
                Day = "J";
                break;

            case 6:
                Day = "V";
                break;

            case 7:
                Day = "S";
                break;

            default:
                break;
        }
        
       int item = 0;
       
       if(Dias.contains(Day)){
           
           item = Dias.indexOf(Day);
           
       }
       else{
           
           for(int r=0; r<jTable1.getRowCount();r++){
               jTable1.setValueAt("No Disponible", r, 1);
           }
           
             this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            return;
       }

        int Horai = 0;
        int Horaf = 0;

        HoraInicio = Hora_Inicial.get(item);
        HoraFinal = Hora_Final.get(item);
        
        
        for (int r = 0; r < 10; r++) {

            String HRM = (String) model.getValueAt(r, 0);

            if (HRM.equalsIgnoreCase(HoraInicio)) {
                Horai = r;
            }
            if (HRM.equalsIgnoreCase(HoraFinal)) {
                Horaf = r;
            }

        }

        if (ID_Medico != 0) {

            model.setRowCount(0);

            Horaf++;

            int TamanoHorario = Horaf - Horai;

            for (int k = 0; k < TamanoHorario; k++) {
                model.addRow(new Object[]{"", ""});

                String hr = Horas[Horai];
                Horai++;

                model.setValueAt(hr, k, 0);
                model.setValueAt(" Libre", k, 1);
                model.setValueAt("0", k, 2);
            }

            for (int q = 0; q < model.getRowCount(); q++) {

                String HRM = (String) model.getValueAt(q, 0);

                for (int p = 0; p < Hrs.size(); p++) {

                    if (Hrs.get(p).equalsIgnoreCase(HRM)) {

                        model.setValueAt(" Cita con " + Pacientes.get(p) + 
                                " (" + Estados.get(p).trim() +")", q, 1);
                        model.setValueAt(Citas.get(p), q, 2);

                    }
                }

            }

        }
        
         for (String Dia1 : Dias) {
            
            if(Dia1.equalsIgnoreCase("L")){
                L=true;
            }
            if(Dia1.equalsIgnoreCase("M")){
                M=true;
            }
            if(Dia1.equalsIgnoreCase("X")){
                X=true;
            }
            if(Dia1.equalsIgnoreCase("J")){
                J=true;
            }
            if(Dia1.equalsIgnoreCase("V")){
                V=true;
            }
            if(Dia1.equalsIgnoreCase("S")){
                S=true;
            }
            if(Dia1.equalsIgnoreCase("D")){
                D=true;
            }
            
        }

        ckL.setSelected(L);
        ckM.setSelected(M);
        ckX.setSelected(X);
        ckJ.setSelected(J);
        ckV.setSelected(V);
        ckS.setSelected(S);
        ckD.setSelected(D);

        jTable1.setModel(model);
        jTable1.setDefaultRenderer(Object.class, new MiRender());

        jTable1.removeColumn(jTable1.getColumnModel().getColumn(2));

    }

    public void DiaDisponible() {

        Date Fecha = jCalendar1.getDate();
        long date = Fecha.getTime();

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(date);
        int Dia = cal.get(Calendar.DAY_OF_WEEK);

        this.jTable1.setEnabled(true);
        jTable1.setDefaultRenderer(Object.class, new MiRender());
        if (!ckD.isSelected() && Dia == 1) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Domingo no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ckL.isSelected() && Dia == 2) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Lunes no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ckM.isSelected() && Dia == 3) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Martes no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ckX.isSelected() && Dia == 4) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Miercoles no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ckJ.isSelected() && Dia == 5) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Jueves no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ckV.isSelected() && Dia == 6) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Viernes no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ckS.isSelected() && Dia == 7) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Sabado no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange

        if (flag) {
            try {
                CargarHorario();
            } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            }

            if (ID_Medico != 0) {
                DiaDisponible();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        flag = false;        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    public class MiRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
           
            
            CharSequence Libre = " Libre";
            CharSequence Atendida = "(Atendida)";
            CharSequence Cancelada = "(Cancelada)";
            CharSequence Pendiente = "(Pendiente)";
            
            String Valor = (String) value;
            
            if (column == 1 && Valor.contains(Libre)) {
                this.setBackground(new Color(27, 94, 32)); //Verde
                this.setForeground(Color.WHITE);
            }

            if (column == 1 && Valor.contains(Atendida)) {
                this.setBackground(new Color(1, 87, 155)); //Azul
                this.setForeground(Color.WHITE);
            }

            if (column == 1 && Valor.contains(Cancelada)) {
                this.setBackground(new Color(191, 54, 12)); // Rojo
                this.setForeground(Color.WHITE);
            }

            if (column == 1 && Valor.contains(Pendiente)) {
                this.setBackground(new Color(230, 81, 0)); //Amarillo
                this.setForeground(Color.WHITE);
            }

            if (column == 0) {
                this.setOpaque(true);
                this.setBackground(new Color(219, 208, 186));
                this.setForeground(Color.BLACK);
            }

            // Restaurar los valores por defecto
            return this;
        }
    }

    public class MiRenderDisable extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            this.setBackground(Color.GRAY);
            this.setForeground(Color.BLACK);

            return this;
        }
    }

    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckD;
    private javax.swing.JCheckBox ckJ;
    private javax.swing.JCheckBox ckL;
    private javax.swing.JCheckBox ckM;
    private javax.swing.JCheckBox ckS;
    private javax.swing.JCheckBox ckV;
    private javax.swing.JCheckBox ckX;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
