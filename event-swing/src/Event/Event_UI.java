/*
 * MIT License
 * Copyright (c) 2018 MDC Blue and/or its contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * github.com/MDCblue/event
 */
package Event;

import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.DateFormat;
import javax.swing.JFileChooser;
import java.text.SimpleDateFormat;


/**
 * Designed to create your live easier when it
 * comes to organize your needs for an event.
 * Making Your Events Easier!
 * 
 * @author MDC Blue
 */
public class Event_UI extends JFrame {
    
static Statement statement;
static Connection connection;
static Connection Find;
static Connection Update;
static Connection Eliminate;
static Connection find_Emergency;
String Path;
boolean Empty = false;
boolean thereIsConnection = false;
javax.swing.Timer timer;

/**
 * Constructs initialize components of the JFrame
 * Sets message to tell the user to Connect to database
 */
 public Event_UI() {
       
        initComponents();
        Yes.setVisible(false);
        Update_Event.setVisible(false);
        Allow_Remove.setVisible(false);
        Add_New.setVisible(false);
        blink();
        
 }

public void connection(){  
        try{
           
           connection = DriverManager.getConnection("jdbc:ucanaccess://" + Path);
           connection_label.setText("Database Connected");
           connection_status.setBackground(Color.GREEN);
           thereIsConnection = true;
           
           Statement statement = connection.createStatement();  
           
           
           ResultSet Result = statement.executeQuery("select Event from Event_Info where ID = 10");
           if(Result.next()) {
           Event_Name_box.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select Organization from Event_Info where ID = 10");
           if(Result.next()) {
           Org_Box.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select Advisor from Event_Info where ID = 10");
           if(Result.next()) {
           Adv_Box.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select Transportation from Event_Info where ID = 10");
           if(Result.next()) {
           Transp_box.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select Location from Event_Info where ID = 10");
           if(Result.next()) {
           Location.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select Students_in_Org from Event_Info where ID = 10");
           if(Result.next()) {
           Students_in_org_Box.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select Students_Attending from Event_Info where ID = 10");
           if(Result.next()) {
           Students_Attending_Box.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select Chaperones from Event_Info where ID = 10");
           if(Result.next()) {
           Chaperones.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select from_date from Event_Info where ID = 10");
           if(Result.next()) {
           date_from_box.setText(Result.getString(1));
           }
           Result = statement.executeQuery("select To_date from Event_Info where ID = 10");
           if(Result.next()) {
           To_box.setText(Result.getString(1));
           
           if(!Event_Name_box.getText().isEmpty()) {
               Exceptions_box.setText("Current Event : "+ Event_Name_box.getText());
           }
           
           }
           
           if(
             Event_Name_box.getText().equals("") &&
             Org_Box.getText().equals("") &&
             Adv_Box.getText().equals("") && 
             Transp_box.getText().equals("") &&      
             Location.getText().equals("") &&
             Students_in_org_Box.getText().equals("") &&
             Students_Attending_Box.getText().equals("") &&
             Chaperones.getText().equals("") &&
             date_from_box.getText().equals("") &&
             To_box.getText().equals("")
             ){
             Exceptions_box.setText("Start by Filling Event Information"); 
             jPanel4.setVisible(false);
             Empty = true;
            }
           
           
            
        }
         
        // Errors in Connection display red box and Error Message
        catch(SQLException e) {
            
            connection_label.setText("Connection failed");
            connection_status.setBackground(Color.red); 
            
            String Error = e.getMessage();
            Exceptions_box.setText(Error);          
        }
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Exceptions_box = new javax.swing.JLabel();
        connection_label = new javax.swing.JLabel();
        connection_status = new javax.swing.JPanel();
        Allow_Remove = new javax.swing.JButton();
        connect_DB_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Org_Box = new javax.swing.JTextField();
        Event_Name_box = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Adv_Box = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Transp_box = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date_from_box = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        To_box = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Location = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Students_in_org_Box = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Students_Attending_Box = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Chaperones = new javax.swing.JTextField();
        Update_button1 = new javax.swing.JButton();
        Add_New = new javax.swing.JButton();
        Update_Event = new javax.swing.JButton();
        Yes = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Student_Last = new javax.swing.JTextField();
        Student_Name_box = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Mdc_Id_box = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Student_Phone_box = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Email_box = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Campus_box = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        Contact_Box_2 = new javax.swing.JTextField();
        Contact_Box_1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Contact_Box_3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Contact_Box_4 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        Address_box = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        Contact_Box_5 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        Contact_Box_6 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        advisor_quant_box = new javax.swing.JTextField();
        stdt_quant_box = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        meals_quant_box = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        lodging_quant_box = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        taxis_qualit_box = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        gas_quant_box = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        expenses = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        slife_contribution = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        club_contribution = new javax.swing.JTextField();
        advisor_fee_box = new javax.swing.JTextField();
        stdt_fee_box = new javax.swing.JTextField();
        meals_fee_box = new javax.swing.JTextField();
        no_days = new javax.swing.JTextField();
        taxis_fee_box = new javax.swing.JTextField();
        gas_fee_box = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lodging_fee_box = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Add_student_button = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        find_last_name_box = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        find_button = new javax.swing.JButton();
        find_student_name_box = new javax.swing.JTextField();
        Get_Box_6 = new javax.swing.JTextField();
        Get_Box_4 = new javax.swing.JTextField();
        Get_Box_3 = new javax.swing.JTextField();
        Get_Box_2 = new javax.swing.JTextField();
        Get_Name_box = new javax.swing.JTextField();
        Get_Box_5 = new javax.swing.JTextField();
        Traveler_Update = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        Get_Box_7 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Emergency_Box_5 = new javax.swing.JTextField();
        Emergency_Box_4 = new javax.swing.JTextField();
        Emergency_Box_3 = new javax.swing.JTextField();
        Emergency_Box_2 = new javax.swing.JTextField();
        Emergency_Box_1 = new javax.swing.JTextField();
        Emergency_Box_6 = new javax.swing.JTextField();
        copyrigth_label = new javax.swing.JLabel();
        copyrigth_label1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 0, -1, 506));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1400, 220));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(1400, 40));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 0, 36)); // NOI18N
        jLabel1.setText("Event# ");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 35));

        Exceptions_box.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        Exceptions_box.setForeground(new java.awt.Color(51, 51, 51));
        Exceptions_box.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(Exceptions_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 1010, 40));

        connection_label.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        connection_label.setText("Connection Failed");
        jPanel5.add(connection_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 10, 170, 40));

        connection_status.setBackground(java.awt.Color.red);
        connection_status.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout connection_statusLayout = new javax.swing.GroupLayout(connection_status);
        connection_status.setLayout(connection_statusLayout);
        connection_statusLayout.setHorizontalGroup(
            connection_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        connection_statusLayout.setVerticalGroup(
            connection_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel5.add(connection_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 20, 20, 20));

        Allow_Remove.setText("YES");
        Allow_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Allow_RemoveActionPerformed(evt);
            }
        });
        jPanel5.add(Allow_Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 80, 40));

        connect_DB_button.setText("<html>\n<p>CONNECT <br/>\nDATABASE</p>\n</html>");
        connect_DB_button.setToolTipText("");
        connect_DB_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_DB_buttonActionPerformed(evt);
            }
        });
        jPanel5.add(connect_DB_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 10, -1, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1830, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Organization");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        Org_Box.setNextFocusableComponent(Adv_Box);
        jPanel3.add(Org_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 157, -1));

        Event_Name_box.setNextFocusableComponent(Org_Box);
        jPanel3.add(Event_Name_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 157, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Event Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Advisor");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Adv_Box.setNextFocusableComponent(Transp_box);
        jPanel3.add(Adv_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 157, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Transportation");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        Transp_box.setNextFocusableComponent(Students_in_org_Box);
        jPanel3.add(Transp_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 157, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Date");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        date_from_box.setNextFocusableComponent(To_box);
        date_from_box.setOpaque(false);
        jPanel3.add(date_from_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 101, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("to");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, -1, -1));

        To_box.setNextFocusableComponent(Location);
        jPanel3.add(To_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 101, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Location");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, -1, -1));

        Location.setNextFocusableComponent(Update_button1);
        jPanel3.add(Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 130, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Number of Students in Organization");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 30));

        Students_in_org_Box.setNextFocusableComponent(Students_Attending_Box);
        jPanel3.add(Students_in_org_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 70, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Number of Students Attending Event");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        Students_Attending_Box.setNextFocusableComponent(Chaperones);
        jPanel3.add(Students_Attending_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 70, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Number of Chaperones Attending Event");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 20));

        Chaperones.setNextFocusableComponent(date_from_box);
        jPanel3.add(Chaperones, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 70, 20));

        Update_button1.setText("NEW / Update  EVENT");
        Update_button1.setActionCommand("UPDATE Event");
        Update_button1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Update_button1.setBorderPainted(false);
        Update_button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update_button1MouseClicked(evt);
            }
        });
        Update_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_button1ActionPerformed(evt);
            }
        });
        jPanel3.add(Update_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 170, 30));

        Add_New.setText("Add New");
        Add_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_NewActionPerformed(evt);
            }
        });
        jPanel3.add(Add_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 100, -1));

        Update_Event.setText("UPDATE");
        Update_Event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_EventActionPerformed(evt);
            }
        });
        jPanel3.add(Update_Event, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        Yes.setText("NEW");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });
        jPanel3.add(Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 80, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1830, 230));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EXPENSES");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Last Name");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        Student_Last.setNextFocusableComponent(Mdc_Id_box);
        jPanel4.add(Student_Last, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, -1));

        Student_Name_box.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Student_Name_box.setNextFocusableComponent(Student_Last);
        Student_Name_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Student_Name_boxMouseClicked(evt);
            }
        });
        Student_Name_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Name_boxActionPerformed(evt);
            }
        });
        jPanel4.add(Student_Name_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 160, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MDC ID");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        Mdc_Id_box.setNextFocusableComponent(Student_Phone_box);
        jPanel4.add(Mdc_Id_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 160, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Phone");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        Student_Phone_box.setNextFocusableComponent(Email_box);
        jPanel4.add(Student_Phone_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        Email_box.setNextFocusableComponent(Address_box);
        jPanel4.add(Email_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 160, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Campus");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        Campus_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selelct ", "Hialeah Campus", "North Campus", "Interamerican Campus", "Homestead Campus" }));
        Campus_box.setNextFocusableComponent(Contact_Box_1);
        jPanel4.add(Campus_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 157, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Last Name");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Emergency Contact");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 330, -1, 360));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Last Name");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        Contact_Box_2.setNextFocusableComponent(Contact_Box_3);
        jPanel4.add(Contact_Box_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 157, -1));

        Contact_Box_1.setNextFocusableComponent(Contact_Box_2);
        jPanel4.add(Contact_Box_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 157, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Name");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Phone");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        Contact_Box_3.setNextFocusableComponent(Contact_Box_4);
        jPanel4.add(Contact_Box_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 157, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Email");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        Contact_Box_4.setNextFocusableComponent(Contact_Box_5);
        jPanel4.add(Contact_Box_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 157, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Address");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        Address_box.setNextFocusableComponent(Campus_box);
        jPanel4.add(Address_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 160, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Relationship");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        Contact_Box_5.setNextFocusableComponent(Contact_Box_6);
        jPanel4.add(Contact_Box_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 157, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Address");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        Contact_Box_6.setNextFocusableComponent(Add_student_button);
        jPanel4.add(Contact_Box_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 157, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Advisor Registration");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 230, -1, -1));

        advisor_quant_box.setNextFocusableComponent(advisor_fee_box);
        jPanel4.add(advisor_quant_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 230, 90, -1));

        stdt_quant_box.setNextFocusableComponent(stdt_fee_box);
        jPanel4.add(stdt_quant_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 200, 90, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Students-Registration");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 200, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Meals");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 260, -1, -1));

        meals_quant_box.setNextFocusableComponent(meals_fee_box);
        jPanel4.add(meals_quant_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 260, 90, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Lodging");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, -1, -1));

        lodging_quant_box.setNextFocusableComponent(lodging_fee_box);
        jPanel4.add(lodging_quant_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 290, 90, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Taxis");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 320, -1, -1));

        taxis_qualit_box.setNextFocusableComponent(taxis_fee_box);
        jPanel4.add(taxis_qualit_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 320, 90, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("# days");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 260, -1, -1));

        gas_quant_box.setNextFocusableComponent(gas_fee_box);
        jPanel4.add(gas_quant_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 350, 90, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Total Expenses");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 420, -1, -1));

        expenses.setBackground(new java.awt.Color(255, 255, 255));
        expenses.setForeground(new java.awt.Color(255, 255, 255));
        expenses.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        expenses.setNextFocusableComponent(slife_contribution);
        jPanel4.add(expenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 470, 80, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("=");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 470, 20, -1));

        slife_contribution.setNextFocusableComponent(club_contribution);
        jPanel4.add(slife_contribution, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 470, 110, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Student Life Contribution");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 420, -1, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("-");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 470, 20, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Club Contribution");
        jPanel4.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 420, -1, -1));

        club_contribution.setNextFocusableComponent(Student_Name_box);
        jPanel4.add(club_contribution, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 470, 110, 30));

        advisor_fee_box.setNextFocusableComponent(meals_quant_box);
        jPanel4.add(advisor_fee_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 230, 80, -1));

        stdt_fee_box.setNextFocusableComponent(advisor_quant_box);
        jPanel4.add(stdt_fee_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 200, 80, -1));

        meals_fee_box.setNextFocusableComponent(lodging_quant_box);
        jPanel4.add(meals_fee_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 260, 80, -1));

        no_days.setNextFocusableComponent(taxis_qualit_box);
        jPanel4.add(no_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 290, 80, -1));

        taxis_fee_box.setNextFocusableComponent(gas_quant_box);
        jPanel4.add(taxis_fee_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 320, 80, -1));

        gas_fee_box.setNextFocusableComponent(expenses);
        jPanel4.add(gas_fee_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 350, 80, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Gas");
        jPanel4.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 350, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Quantity");
        jPanel4.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 170, -1, -1));

        lodging_fee_box.setNextFocusableComponent(no_days);
        jPanel4.add(lodging_fee_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 290, 80, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Fee");
        jPanel4.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 170, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, -150, -1, 850));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 10, 720));

        Add_student_button.setText("Add");
        Add_student_button.setActionCommand("Find");
        Add_student_button.setNextFocusableComponent(find_student_name_box);
        Add_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_student_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(Add_student_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 100, 40));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Emergency Contact");
        jPanel4.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, -1, -1));

        find_last_name_box.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        find_last_name_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_last_name_box.setText("Last Name");
        find_last_name_box.setNextFocusableComponent(find_button);
        find_last_name_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                find_last_name_boxMouseClicked(evt);
            }
        });
        jPanel4.add(find_last_name_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 190, 30));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Edit/Remove Traveler");
        jPanel4.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Name");
        jPanel4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("MDC ID");
        jPanel4.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Phone");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Email");
        jPanel4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Campus");
        jPanel4.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Name");
        jPanel4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 720));

        find_button.setText("Find");
        find_button.setNextFocusableComponent(Get_Name_box);
        find_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(find_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 100, 40));

        find_student_name_box.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        find_student_name_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_student_name_box.setText("Name");
        find_student_name_box.setNextFocusableComponent(find_last_name_box);
        find_student_name_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                find_student_name_boxMouseClicked(evt);
            }
        });
        find_student_name_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_student_name_boxActionPerformed(evt);
            }
        });
        jPanel4.add(find_student_name_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 190, 30));

        Get_Box_6.setNextFocusableComponent(Get_Box_7);
        jPanel4.add(Get_Box_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 160, -1));

        Get_Box_4.setNextFocusableComponent(Get_Box_5);
        jPanel4.add(Get_Box_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 160, -1));

        Get_Box_3.setNextFocusableComponent(Get_Box_4);
        jPanel4.add(Get_Box_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 160, -1));

        Get_Box_2.setNextFocusableComponent(Get_Box_3);
        jPanel4.add(Get_Box_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 160, -1));

        Get_Name_box.setNextFocusableComponent(Get_Box_2);
        jPanel4.add(Get_Name_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 160, -1));

        Get_Box_5.setNextFocusableComponent(Get_Box_6);
        jPanel4.add(Get_Box_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 160, -1));

        Traveler_Update.setText("Update");
        Traveler_Update.setNextFocusableComponent(Remove);
        Traveler_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Traveler_UpdateActionPerformed(evt);
            }
        });
        jPanel4.add(Traveler_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 90, -1));

        Remove.setText("Remove");
        Remove.setToolTipText("");
        Remove.setNextFocusableComponent(stdt_quant_box);
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel4.add(Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 90, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Address");
        jPanel4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        Get_Box_7.setNextFocusableComponent(Emergency_Box_1);
        jPanel4.add(Get_Box_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 160, -1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 5, 280));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Add Traveler");
        jPanel4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Traveler");
        jPanel4.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        Emergency_Box_5.setNextFocusableComponent(Emergency_Box_6);
        jPanel4.add(Emergency_Box_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 170, -1));

        Emergency_Box_4.setNextFocusableComponent(Emergency_Box_5);
        jPanel4.add(Emergency_Box_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 170, -1));

        Emergency_Box_3.setNextFocusableComponent(Emergency_Box_4);
        jPanel4.add(Emergency_Box_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 170, -1));

        Emergency_Box_2.setNextFocusableComponent(Emergency_Box_3);
        jPanel4.add(Emergency_Box_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 170, -1));

        Emergency_Box_1.setNextFocusableComponent(Emergency_Box_2);
        jPanel4.add(Emergency_Box_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 170, -1));

        Emergency_Box_6.setNextFocusableComponent(Traveler_Update);
        jPanel4.add(Emergency_Box_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 170, -1));

        copyrigth_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        copyrigth_label.setForeground(new java.awt.Color(102, 153, 255));
        copyrigth_label.setText("MDC Blue");
        copyrigth_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copyrigth_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                copyrigth_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                copyrigth_labelMouseExited(evt);
            }
        });
        jPanel4.add(copyrigth_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 660, -1, -1));

        copyrigth_label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        copyrigth_label1.setForeground(new java.awt.Color(240, 240, 240));
        copyrigth_label1.setText("<html>\nEvent# &copy;\n</html>");
        jPanel4.add(copyrigth_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 660, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1830, 700));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void Update_button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_button1MouseClicked

    private void Update_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_button1ActionPerformed
        
        if (Empty) {
        if(
             Event_Name_box.getText().equals("") ||
             Org_Box.getText().equals("") ||
             Adv_Box.getText().equals("") || 
             Transp_box.getText().equals("") ||      
             Location.getText().equals("") ||
             Students_in_org_Box.getText().equals("") ||
             Students_Attending_Box.getText().equals("") ||
             Chaperones.getText().equals("") ||
             date_from_box.getText().equals("") ||
             To_box.getText().equals("")
             ) {
             Exceptions_box.setText("Fill All Event Information"); 
            }
            
        else {  
        try {
        Statement state = connection.createStatement(); 
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat(date_from_box.getText());
        String from_date = dateFormat.format(date);
        dateFormat = new SimpleDateFormat(date_from_box.getText());
        String to_date = dateFormat.format(date);
        
       state.executeUpdate("update Event_Info set Event =" + "'" +Event_Name_box.getText()+ "'");
       state.executeUpdate("update Event_Info set Organization =" + "'" +Org_Box.getText()+ "'");
       state.executeUpdate("update Event_Info set Advisor =" + "'" +Adv_Box.getText()+ "'");
       state.executeUpdate("update Event_Info set Transportation =" + "'" +Transp_box.getText() + "'");
       state.executeUpdate("update Event_Info set Location =" + "'" +Location.getText()+ "'");
       state.executeUpdate("update Event_Info set Students_in_Org =" + "'" +Students_in_org_Box.getText()+ "'");
       state.executeUpdate("update Event_Info set Students_Attending =" + "'" +Students_Attending_Box.getText()+ "'");
       state.executeUpdate("update Event_Info set Chaperones =" + "'" +Chaperones.getText()+ "'");
       state.executeUpdate("update Event_Info set from_date =" + "'" +from_date+ "'");
       state.executeUpdate("update Event_Info set To_date =" + "'" +to_date+ "'"); 
       
        Exceptions_box.setText("Event Created , Add Travelers Now");
        jPanel4.setVisible(true);
        Empty = false;
        
        }catch(Exception e) {
        connection_label.setText(e.getMessage());
        connection_status.setBackground(Color.red); 
        }
        }
        } 
        
        else {    
        Yes.setVisible(true);
        Update_Event.setVisible(true);
        Exceptions_box.setText("New to create new Event , Update to update Excisting Event");  
         }
    }//GEN-LAST:event_Update_button1ActionPerformed

    
    
    // Add student button
    private void Add_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_student_buttonActionPerformed
    Update_button1.setVisible(false);        
   
    if(Student_Name_box.getText().equals("") ||Student_Last.getText().equals("") || Mdc_Id_box.getText().equals("") || Student_Phone_box.getText().equals("")||
    Email_box.getText().equals("") || Address_box.getText().equals("") || Contact_Box_1.getText().equals("")|| Contact_Box_2.getText().equals("")||
    Contact_Box_3.getText().equals("")|| Contact_Box_4.getText().equals("")|| Contact_Box_5.getText().equals("")|| Contact_Box_6.getText().equals("")) 
    {       
    Exceptions_box.setText("|Please fill all the Information and Try Again|");
    }   
    
    else  {
            Exceptions_box.setText("");
            try {            
            Statement Add = connection.createStatement();
            String name = Student_Name_box.getText();
            String Last = Student_Last.getText();
            String Mdc_id = Mdc_Id_box.getText();
            String Phone = Student_Phone_box.getText();
            String email = Email_box.getText();
            String Address = Address_box.getText();       

        // Excecute Insertion Update to Students-Info Table        
        Add.executeUpdate(
        " insert into Students_info( Name , Last_Name , MDC_id ,Phone , Email , Address, Campus)" + "values(" + "'" +name+ "'," + "'" +Last+ "'," +
        "'" +Mdc_id+ "'," + "'" + Phone + "'," + "'" + email + "'," + "'" + Address + "'," + "'" + Campus_box.getSelectedItem() + "')" );

        name = Contact_Box_1.getText();
        Last = Contact_Box_2.getText();
        Phone = Contact_Box_3.getText();
        email = Contact_Box_4.getText();
        Address = Contact_Box_6.getText();       

        // Excecute Insertion Update to Emergency_Info Table
       
        Add.executeUpdate(
        "insert into Emergency_Info (Name ,Last_Name ,Phone ,Email ,Relationship ,Address)" + "values(" + "'" +name+ "'," + "'" +Last+ "'," +
        "'" +Phone+ "'," + "'" + email + "'," + "'" + Contact_Box_5.getText() + "'," + "'" + Address + "')");
        
        // Prompt Message
        Exceptions_box.setText("Traveler Added");
        
        // Set text_boxes to clear mode 
        Student_Name_box.setText("");
        Student_Last.setText("");
        Mdc_Id_box.setText("");
        Student_Phone_box.setText("");
        Email_box.setText("");
        Address_box.setText("");
        Contact_Box_1.setText("");
        Contact_Box_2.setText("");
        Contact_Box_3.setText("");
        Contact_Box_4.setText("");
        Contact_Box_5.setText("");
        Contact_Box_6.setText("");
        
        }
        catch(Exception e) {
        String error = e.getMessage();
        Exceptions_box.setText(error);
        connection_status.setBackground(Color.red); 
        }            
    }//GEN-LAST:event_Add_student_buttonActionPerformed
}
    
    
    // Find student button
    private void find_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_buttonActionPerformed

        Exceptions_box.setText("");
        int id = 0;        
        try {
        
        Find = DriverManager.getConnection("jdbc:ucanaccess://" + Path); 
        Statement find = Find.createStatement();
        Statement find_Emergency_Contact = Find.createStatement();
        String nombre = find_student_name_box.getText();
        String Last = find_last_name_box.getText();
         
        ResultSet Result = find.executeQuery("select Name from Students_Info where Name = \'" + nombre + "\'" + "and Last_Name = \'" + Last + "\'");
        
        if(Result.next()) {
        Get_Name_box.setText(Result.getString(1)); 
        }
        Result = find.executeQuery("select Last_Name from Students_Info where Name = \'" + nombre + "\'" + "and Last_Name = \'" + Last + "\'");
       
        if(Result.next()) {
        Get_Box_2.setText(Result.getString(1));
        }
        Result = find.executeQuery("select MDC_id from Students_Info where Name = \'" + nombre + "\'" + "and Last_Name = \'" + Last + "\'");
       
        if(Result.next()) {
        Get_Box_3.setText(Result.getString(1));
        }
        Result = find.executeQuery("select Phone from Students_Info where Name = \'" + nombre + "\'" + "and Last_Name = \'" + Last + "\'");
       
        if(Result.next()) {
        Get_Box_4.setText(Result.getString(1));
        }
        Result = find.executeQuery("select Email from Students_Info where Name = \'" + nombre + "\'" + "and Last_Name = \'" + Last + "\'");
       
        if(Result.next()) {
        Get_Box_5.setText(Result.getString(1));
        }
        Result = find.executeQuery("select Address from Students_Info where Name = \'" + nombre + "\'" + "and Last_Name = \'" + Last + "\'");
        
        if(Result.next()) {
        Get_Box_6.setText(Result.getString(1));
        }
       
       find_Emergency = DriverManager.getConnection("jdbc:ucanaccess://" + Path);   
       Statement Emergency_Lookup = find_Emergency.createStatement();
       ResultSet Index = Emergency_Lookup.executeQuery("select ID from Students_Info where Name = \'" + nombre + "\'" + "and Last_Name = \'" + Last + "\'");
       if(Index.next()) {
       id = Index.getInt(1);
       }
       // Emergency Contact LOOKUP
       
        ResultSet Emergency_Result = find_Emergency_Contact.executeQuery("select Name from Emergency_Info where ID ="+id);
        
        if(Emergency_Result.next()) {
            Emergency_Box_1.setText(Emergency_Result.getString(1));
        }
        
        Emergency_Result = find_Emergency_Contact.executeQuery("select Last_Name from Emergency_Info where ID ="+id);
        
        if(Emergency_Result.next()) {
            Emergency_Box_2.setText(Emergency_Result.getString(1));
        }
        
       Emergency_Result = find_Emergency_Contact.executeQuery("select Phone from Emergency_Info where ID ="+id);
        if(Emergency_Result.next()) {
            Emergency_Box_3.setText(Emergency_Result.getString(1));
        }
        
       Emergency_Result = find_Emergency_Contact.executeQuery("select Email from Emergency_Info where ID ="+id);
        if(Emergency_Result.next()) {
            Emergency_Box_4.setText(Emergency_Result.getString(1));
        }
        
        Emergency_Result = find_Emergency_Contact.executeQuery("select Relationship from Emergency_Info where ID ="+id);
        if(Emergency_Result.next()) {
            Emergency_Box_5.setText(Emergency_Result.getString(1));
        }
        Emergency_Result = find_Emergency_Contact.executeQuery("select Address from Emergency_Info where ID ="+id);
        if(Emergency_Result.next()) {
            Emergency_Box_6.setText(Emergency_Result.getString(1));
        }
        else {
         Exceptions_box.setText("|Traveler Not found|");
         Get_Name_box.setText("");
         Get_Box_2.setText("");
         Get_Box_3.setText("");
         Get_Box_4.setText("");
         Get_Box_5.setText("");
         Get_Box_6.setText("");
         Emergency_Box_1.setText("");
         Emergency_Box_2.setText("");
         Emergency_Box_3.setText("");
         Emergency_Box_4.setText("");
         Emergency_Box_5.setText("");
         Emergency_Box_6.setText("");
        }
        }catch(Exception e) {
        String error = e.getMessage();
        Exceptions_box.setText(error);
        }
    }//GEN-LAST:event_find_buttonActionPerformed

    private void Student_Name_boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Student_Name_boxMouseClicked
       Student_Name_box.setText("");
       find_last_name_box.setText("");
    }//GEN-LAST:event_Student_Name_boxMouseClicked

    private void find_last_name_boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_find_last_name_boxMouseClicked
       find_last_name_box.setText("");
       Student_Name_box.setText("");
    }//GEN-LAST:event_find_last_name_boxMouseClicked

    private void Student_Name_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Name_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_Name_boxActionPerformed

    private void find_student_name_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_student_name_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_find_student_name_boxActionPerformed

    private void find_student_name_boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_find_student_name_boxMouseClicked
        find_student_name_box.setText("");
    }//GEN-LAST:event_find_student_name_boxMouseClicked

    // Update Students Information Method
    private void Traveler_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Traveler_UpdateActionPerformed
       
        try {
        // Lookup  Text_boxes    
        String Name = find_student_name_box.getText();
        String Last = find_last_name_box.getText();
        int id = 0;
             
        Update = DriverManager.getConnection("jdbc:ucanaccess://" + Path);   
        Statement Actualization = Update.createStatement();
        ResultSet Result =  Actualization.executeQuery("select ID from Students_Info where Name = \'" + Name + "\'" + "and Last_Name = \'" + Last + "\'");
        
        if(Result.next()) {
        id  = Result.getInt(1);
        }
        Actualization.executeUpdate("update Students_Info set Name = \'" + Get_Name_box.getText() + "\'" + " where ID = " + id );
        Actualization.executeUpdate("update Students_Info set Last_Name = \'" + Get_Box_2.getText() + "\'" + " where ID = " + id );
        Actualization.executeUpdate("update Students_Info set MDC_id = \'" + Get_Box_3.getText() + "\'" + " where ID = " + id );
        Actualization.executeUpdate("update Students_Info set Phone = \'" + Get_Box_4.getText() + "\'" + " where ID = " + id );
        Actualization.executeUpdate("update Students_Info set Email = \'" + Get_Box_5.getText() + "\'" + " where ID =" + id );
        Actualization.executeUpdate("update Students_Info set Address = \'" + Get_Box_6.getText() + "\'" + " where ID =" + id );
        Actualization.executeUpdate("update Students_Info set Campus = \'" + Get_Box_7.getText() + "\'" + " where ID =" + id );
        
        Update = DriverManager.getConnection("jdbc:ucanaccess://" + Path);   
        Actualization = Update.createStatement();
        Actualization.executeUpdate("update Emergency_Info set Name = \'" + Emergency_Box_1.getText() + "\'" + " where ID = " + id );
        Actualization.executeUpdate("update Emergency_Info set Last_Name = \'" + Emergency_Box_2.getText() + "\'" + " where ID = " + id );
        Actualization.executeUpdate("update Emergency_Info set Phone = \'" + Emergency_Box_3.getText() + "\'" + " where ID = " + id );
        Actualization.executeUpdate("update Emergency_Info set Email = \'" + Emergency_Box_4.getText() + "\'" + " where ID =" + id );
        Actualization.executeUpdate("update Emergency_Info set Address = \'" + Emergency_Box_5.getText() + "\'" + " where ID =" + id );
        Actualization.executeUpdate("update Emergency_Info set Relationship = \'" + Emergency_Box_6.getText() + "\'" + " where ID =" + id );
        
        Exceptions_box.setText("|Traveler Information Updated|");
        }
        
        catch(Exception e) {
        String error = e.getMessage();
        Exceptions_box.setText(error);
        }
    }//GEN-LAST:event_Traveler_UpdateActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed

        String Name = find_student_name_box.getText();
        String Last = find_last_name_box.getText();
        int id = 0;
        
        try {
            
        Eliminate = DriverManager.getConnection("jdbc:ucanaccess://" + Path);   
        Statement remove = Eliminate.createStatement();
        ResultSet Result = remove.executeQuery("select ID from Students_Info where Name = \'" + Name + "\'" + "and Last_Name = \'" + Last + "\'");
        if(Result.next()) {
            id = Result.getInt(1);
        }
        remove.executeUpdate("delete from Students_Info where ID ="+id);
        remove.executeUpdate("delete from Emergency_Info where ID ="+id);
        
        Exceptions_box.setText("|Traveler Removed|");
        
        }catch(Exception e) {
        Exceptions_box.setText("|Error Removing Traveler|");
        }
    }//GEN-LAST:event_RemoveActionPerformed

    // Update Event Info 
    private void Update_EventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_EventActionPerformed
        if ( 
           Event_Name_box.getText().equals("") ||
           Org_Box.getText().equals("")||
           Adv_Box.getText().equals("")||
           Transp_box.getText().equals("")||
           Location.getText().equals("")||
           Students_in_org_Box.getText().equals("")||
           Students_Attending_Box.getText().equals("")||
           Chaperones.getText().equals("") ||
           date_from_box.getText().equals("") ||
           To_box.getText().equals("")
           ) 
        {
            Exceptions_box.setText("Please fill all the information");
        }
        
        else {
        try {
        Statement state = connection.createStatement(); 
        state.executeUpdate("update Event_Info set Event = "+ "'"  + Event_Name_box.getText()+"'");
        state.executeUpdate("update Event_Info set Advisor = "+ "'"  + Adv_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Chaperones = "+ "'"  + Chaperones.getText()+"'"); 
        state.executeUpdate("update Event_Info set Location = "+ "'"  + Location.getText()+"'");
        state.executeUpdate("update Event_Info set Organization = "+ "'"  + Org_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Students_Attending = "+ "'"  + Students_Attending_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Students_in_Org = "+ "'"  + Students_in_org_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Transportation = "+ "'"  + Transp_box.getText()+"'");
       
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat(date_from_box.getText());
        String from_date = dateFormat.format(date);
        state.executeUpdate("update Event_Info set from_date = "+ "'"  + from_date +"'");
        
        dateFormat = new SimpleDateFormat(date_from_box.getText());
        String to_date = dateFormat.format(date);
        state.executeUpdate("update Event_Info set To_date = "+ "'"  + to_date +"'");
        
        Exceptions_box.setText("Event Updated");
        jPanel4.setVisible(true);
        }catch(Exception e) {
        connection_label.setText("Error Creating Event");
        connection_status.setBackground(Color.red); 
        }
        Update_Event.setVisible(false);
        Yes.setVisible(false);
        }
    }//GEN-LAST:event_Update_EventActionPerformed

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
        Update_Event.setVisible(false);
        Yes.setVisible(false);
        Exceptions_box.setText("Current Event Information will be lost . Are you Sure");
        Allow_Remove.setVisible(true);
    }//GEN-LAST:event_YesActionPerformed

    private void Allow_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Allow_RemoveActionPerformed
        Event_Name_box.setText("");
        Org_Box.setText("");
        Adv_Box.setText("");
        Transp_box.setText("");
        Location.setText("");
        Students_in_org_Box.setText("");
        Students_Attending_Box.setText("");
        Chaperones.setText("");
        date_from_box.setText("");
        To_box.setText("");
        Add_New.setVisible(true);
       
        Allow_Remove.setVisible(false);
        Exceptions_box.setText("Fill Info for New Event");
        Update_button1.setVisible(false);
        try {
        Statement remove = connection.createStatement();
        remove.executeUpdate("delete * from Students_Info");
        remove.executeUpdate("delete * from Emergency_Info");
        }
        catch(Exception e) {
            
            
        }   
    }//GEN-LAST:event_Allow_RemoveActionPerformed

    private void Add_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_NewActionPerformed
        if ( 
           Event_Name_box.getText().equals("") ||
           Org_Box.getText().equals("")||
           Adv_Box.getText().equals("")||
           Transp_box.getText().equals("")||
           Location.getText().equals("")||
           Students_in_org_Box.getText().equals("")||
           Students_Attending_Box.getText().equals("")||
           Chaperones.getText().equals("") ||
           date_from_box.getText().equals("") ||
           To_box.getText().equals("")
           ) 
        {
        Exceptions_box.setText("Please fill all the information");
        }
        
        else {
        try {
        Statement state = connection.createStatement(); 
        state.executeUpdate("update Event_Info set Event = "+ "'"  + Event_Name_box.getText()+"'");
        state.executeUpdate("update Event_Info set Advisor = "+ "'"  + Adv_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Chaperones = "+ "'"  + Chaperones.getText()+"'"); 
        state.executeUpdate("update Event_Info set Location = "+ "'"  + Location.getText()+"'");
        state.executeUpdate("update Event_Info set Organization = "+ "'"  + Org_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Students_Attending = "+ "'"  + Students_Attending_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Students_in_Org = "+ "'"  + Students_in_org_Box.getText()+"'");
        state.executeUpdate("update Event_Info set Transportation = "+ "'"  + Transp_box.getText()+"'");
       
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat(date_from_box.getText());
        String from_date = dateFormat.format(date);
        state.executeUpdate("update Event_Info set from_date = "+ "'"  + from_date +"'");
        
        dateFormat = new SimpleDateFormat(date_from_box.getText());
        String to_date = dateFormat.format(date);
        state.executeUpdate("update Event_Info set To_date = "+ "'"  + to_date +"'");
        
        Exceptions_box.setText("New Event Created");
        jPanel4.setVisible(true);
        }catch(Exception e) {
        connection_label.setText("Error Creating Event");
        connection_status.setBackground(Color.red); 
        }
            }


    }//GEN-LAST:event_Add_NewActionPerformed

    
    /**
     * Ask for your local Access DataBase on your computer and set the
     * variable Path to the location of the file using  JFileChooser
     * 
     * @param evt 
     */
    
    private void connect_DB_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_DB_buttonActionPerformed
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Where is your Access Database");

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File accessDB = chooser.getSelectedFile();
                Path = accessDB.getAbsolutePath();
            }
        connection();
    }//GEN-LAST:event_connect_DB_buttonActionPerformed
    
    /**
     * Open www.MDC.blue when clicked
     * @param evt 
     */
    private void copyrigth_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyrigth_labelMouseClicked
            String url = "https://www.mdc.blue";
            
            try {
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            } catch (IOException ex) {
            }
    }//GEN-LAST:event_copyrigth_labelMouseClicked

    /**
     * Set color of the <b>MDC Blue</b> label to white
     * @param evt 
     */
    private void copyrigth_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyrigth_labelMouseEntered
        copyrigth_label.setForeground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_copyrigth_labelMouseEntered

    /**
     * Set color of the <b>MDC Blue</b> label to light blue 
     * @param evt 
     */
    private void copyrigth_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyrigth_labelMouseExited
        copyrigth_label.setForeground(new java.awt.Color(102, 153, 255));
    }//GEN-LAST:event_copyrigth_labelMouseExited
    
    /**
     * Makes the text blink every 1s asking the user
     * to connect database.
     */
    private void blink(){
        timer = new Timer( 1000, new TimerListenerTwo());
        timer.setInitialDelay(0);
        timer.start();
    }
 
 /**
  * Implements TimeListenerTwo class.
  * 
  * Sets Text with color <b>RED</b> or
  * color <b>WHITE</b>. 
  * 
  * It will stop blinking until the database is connected.
  */
    class TimerListenerTwo implements ActionListener{
        int count = 0;
        public TimerListenerTwo(){}
               
        @Override
        public void actionPerformed(ActionEvent e) {
            if(count % 2 == 0) //Print for even numbers
                Exceptions_box.setText("<html><div color='#FFFFFF';>Please Connect Database</blink></div><html>");    
            else
                Exceptions_box.setText("<html><div color='red';>Please Connect Database</blink></div><html>");
            
            count++;
            
            if(thereIsConnection){
                Exceptions_box.setText("");
                timer.stop();
            }        
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        EventQueue.invokeLater(() -> {
            new Event_UI().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Add_New;
    public static javax.swing.JButton Add_student_button;
    public static javax.swing.JTextField Address_box;
    public static javax.swing.JTextField Adv_Box;
    public static javax.swing.JButton Allow_Remove;
    public static javax.swing.JComboBox<String> Campus_box;
    public static javax.swing.JTextField Chaperones;
    public static javax.swing.JTextField Contact_Box_1;
    public static javax.swing.JTextField Contact_Box_2;
    public static javax.swing.JTextField Contact_Box_3;
    public static javax.swing.JTextField Contact_Box_4;
    public static javax.swing.JTextField Contact_Box_5;
    public static javax.swing.JTextField Contact_Box_6;
    public static javax.swing.JTextField Email_box;
    public static javax.swing.JTextField Emergency_Box_1;
    public static javax.swing.JTextField Emergency_Box_2;
    public static javax.swing.JTextField Emergency_Box_3;
    public static javax.swing.JTextField Emergency_Box_4;
    public static javax.swing.JTextField Emergency_Box_5;
    public static javax.swing.JTextField Emergency_Box_6;
    public static javax.swing.JTextField Event_Name_box;
    public static javax.swing.JLabel Exceptions_box;
    public static javax.swing.JTextField Get_Box_2;
    public static javax.swing.JTextField Get_Box_3;
    public static javax.swing.JTextField Get_Box_4;
    public static javax.swing.JTextField Get_Box_5;
    public static javax.swing.JTextField Get_Box_6;
    public static javax.swing.JTextField Get_Box_7;
    public static javax.swing.JTextField Get_Name_box;
    public static javax.swing.JTextField Location;
    public static javax.swing.JTextField Mdc_Id_box;
    public static javax.swing.JTextField Org_Box;
    public static javax.swing.JButton Remove;
    public static javax.swing.JTextField Student_Last;
    public static javax.swing.JTextField Student_Name_box;
    public static javax.swing.JTextField Student_Phone_box;
    public static javax.swing.JTextField Students_Attending_Box;
    public static javax.swing.JTextField Students_in_org_Box;
    public static javax.swing.JTextField To_box;
    public static javax.swing.JTextField Transp_box;
    public static javax.swing.JButton Traveler_Update;
    public static javax.swing.JButton Update_Event;
    public static javax.swing.JButton Update_button1;
    public static javax.swing.JButton Yes;
    public static javax.swing.JTextField advisor_fee_box;
    public static javax.swing.JTextField advisor_quant_box;
    public static javax.swing.JTextField club_contribution;
    private javax.swing.JButton connect_DB_button;
    public static javax.swing.JLabel connection_label;
    public static javax.swing.JPanel connection_status;
    private javax.swing.JLabel copyrigth_label;
    private javax.swing.JLabel copyrigth_label1;
    public static javax.swing.JTextField date_from_box;
    private javax.swing.JLabel expenses;
    public static javax.swing.JButton find_button;
    public static javax.swing.JTextField find_last_name_box;
    public static javax.swing.JTextField find_student_name_box;
    public static javax.swing.JTextField gas_fee_box;
    public static javax.swing.JTextField gas_quant_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JTextField lodging_fee_box;
    public static javax.swing.JTextField lodging_quant_box;
    public static javax.swing.JTextField meals_fee_box;
    public static javax.swing.JTextField meals_quant_box;
    public static javax.swing.JTextField no_days;
    public static javax.swing.JTextField slife_contribution;
    public static javax.swing.JTextField stdt_fee_box;
    public static javax.swing.JTextField stdt_quant_box;
    public static javax.swing.JTextField taxis_fee_box;
    public static javax.swing.JTextField taxis_qualit_box;
    // End of variables declaration//GEN-END:variables
}
    /**
     * Creates new form Event_UI
     */
