/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.EconomyOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.appointment;
import Business.WorkQueue.vaccinate;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diyabaldota
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        //populateRequestTable();
        populateTable();
//        btnPrescribeMed.setVisible(false);
//        btnTest.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        btnApproved = new javax.swing.JButton();
        appointmentjDateChooser = new com.toedter.calendar.JDateChooser();
        btnPrescribedmed = new javax.swing.JButton();
        btnRejected = new javax.swing.JButton();
        lblTxt = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTest.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnTest.setText("Send for lab tests");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });
        add(btnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblReq.setForeground(new java.awt.Color(36, 47, 65));
        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Sender Email", "Receiver", "Status", "Result", "Name"
            }
        ));
        tblReq.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblReq.setRowHeight(20);
        jScrollPane1.setViewportView(tblReq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 680, 180));

        btnApproved.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnApproved.setText("Approve Appointment");
        btnApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovedActionPerformed(evt);
            }
        });
        add(btnApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        appointmentjDateChooser.setBackground(new java.awt.Color(220, 241, 251));
        add(appointmentjDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        btnPrescribedmed.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnPrescribedmed.setText("Prescribe Medicine");
        btnPrescribedmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribedmedActionPerformed(evt);
            }
        });
        add(btnPrescribedmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        btnRejected.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnRejected.setText("Reject Appointment");
        btnRejected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectedActionPerformed(evt);
            }
        });
        add(btnRejected, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, -1, -1));

        lblTxt.setBackground(new java.awt.Color(0, 0, 0));
        lblTxt.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblTxt.setText("Currently Logged in as:");
        add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 30));

        lblVal.setBackground(new java.awt.Color(0, 0, 0));
        lblVal.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblVal.setText("<value>");
        add(lblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 230, 30));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/docworkarea.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 1580, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's record to test");
            return;
        }
        appointment a = (appointment)tblReq.getValueAt(selectedRow, 0);
        if(!(a.getStatus().equals("Approved"))){
            JOptionPane.showMessageDialog(this, "Please approve appointment first");
            return;
        }
        UserAccount labUser = new UserAccount();
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof LabOrganization){
                org = organization;
                for(UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                    System.out.println(u.getUsername());
                    System.out.println(u.getRole().toString());
                    if(u.getRole().toString().equals("Business.Role.LabRole")){
                        a.setLab(u);
                        labUser = u;
                        break;
                    }
                }
            break;
            }
            
        }
        populateTable();
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(a);
            labUser.getWorkQueue().getWorkRequestList().add(a);
        }

            JOptionPane.showMessageDialog(this, "Request sent to lab!");
        
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's request to schedule");
            return;
        }
        Date d = new Date();
        System.out.println(d);
        //Date date = appointmentjDateChooser.getDate();
       try{
        if(appointmentjDateChooser.getDate().toString().length()<1){
            JOptionPane.showMessageDialog(this, "Please choose a date to schedule vaccination");
            return;
        }
        }
        catch(NullPointerException e){
            System.out.println("Null exception caught");
            JOptionPane.showMessageDialog(this, "Please select a date");
            return;
        }
        if(appointmentjDateChooser.getDate().before(d)){
            JOptionPane.showMessageDialog(this, "Please select a future date");
            return;
        }
        appointment req = (appointment)tblReq.getModel().getValueAt(selectedRow, 0);
        
        if(req.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Person is already scheduled an appointment");
            //System.out.println("Person is already scheduled a vaccination slot");
            return;
        }
        
        
        req.setStatus("Approved");
        dB4OUtil.storeSystem(system);
        populateTable();
//        btnPrescribeMed.setVisible(true);
//        btnTest.setVisible(true);



        
    }//GEN-LAST:event_btnApprovedActionPerformed

    private void btnPrescribedmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribedmedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's record to prescribe");
            return;
        } 
        appointment a = (appointment)tblReq.getValueAt(selectedRow, 0);
        if(!(a.getStatus().equals("Approved"))){
            JOptionPane.showMessageDialog(this, "Please approve appointment first");
            return;
        }
        WorkRequest w = (WorkRequest) tblReq.getModel().getValueAt(selectedRow, 0);
        UserAccount p = w.getSender();
        userProcessContainer.removeAll();
        AddPrescriptionJPanel addPresciptionJPanel = new AddPrescriptionJPanel(userProcessContainer, enterprise, organization, system, userAccount, p);
        userProcessContainer.add("addPresciptionJPanel", addPresciptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateTable();



        
    }//GEN-LAST:event_btnPrescribedmedActionPerformed

    private void btnRejectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectedActionPerformed
        // TODO add your handling code here:int selectedRow = tblRequest.getSelectedRow();
        int selectedRow = tblReq.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's request to schedule");
            return;
        }
        appointment a = (appointment)tblReq.getValueAt(selectedRow, 0);
        a.setDate(appointmentjDateChooser.getDate().toString());
        a.setStatus("Rejected");
        dB4OUtil.storeSystem(system);
        populateTable();
        btnPrescribedmed.setVisible(true);
        btnTest.setVisible(true);

        
    }//GEN-LAST:event_btnRejectedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser appointmentjDateChooser;
    private javax.swing.JButton btnApproved;
    private javax.swing.JButton btnPrescribedmed;
    private javax.swing.JButton btnRejected;
    private javax.swing.JButton btnTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblVal;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblReq.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            if(request instanceof appointment){
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            String email = ((appointment) request).getEmail();
            row[2] = email;
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            String result = ((appointment) request).getTestResult();
            row[5] = result;
            row[6] = request.getReceiver().getUsername();
            
            model.addRow(row);
        }
        }
    }
}
