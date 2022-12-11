/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PurchaseRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ServiceEnterprise;
import Business.Network.Network;
import Business.Organization.DistributionOrganization;
import Business.Organization.Organization;
import Business.Organization.PurchaseInventory;
import Business.Organization.PurchaseOrganization;
import Business.Organization.VaccineCount;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.requestVaccine;
import Business.WorkQueue.vaccineCount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.ManufacturingRole.AddVaccineJPanel;

/**
 *
 * @author diyabaldota
 */
public class PurchaseWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private PurchaseOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public int currEP;
    public int currentCount;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public PurchaseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PurchaseOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        currEP = ((ServiceEnterprise) enterprise).getVaccineCount();
        currentCount = 0;
        lblVal.setText(account.getEmployee().getName());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVacc = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();
        cardRequestPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTxt = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tblVacc.setForeground(new java.awt.Color(36, 47, 65));
        tblVacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        tblVacc.setGridColor(new java.awt.Color(0, 0, 0));
        tblVacc.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblVacc.setRowHeight(20);
        jScrollPane1.setViewportView(tblVacc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 420, 180));

        btnRequest.setBackground(new java.awt.Color(0, 0, 0));
        btnRequest.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnRequest.setText("Request Vaccine");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        cardRequestPanel.setBackground(new java.awt.Color(255, 255, 255));
        cardRequestPanel.setMinimumSize(new java.awt.Dimension(670, 848));
        cardRequestPanel.setPreferredSize(new java.awt.Dimension(670, 848));
        cardRequestPanel.setLayout(new java.awt.CardLayout());
        add(cardRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 50, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchase.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, -80, 750, 850));

        lblTxt.setBackground(new java.awt.Color(0, 0, 0));
        lblTxt.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblTxt.setText("Currently Logged in as:");
        add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 30));

        lblVal.setBackground(new java.awt.Color(0, 0, 0));
        lblVal.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblVal.setText("<value>");
        add(lblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JPanel cardRequestPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblVal;
    private javax.swing.JTable tblVacc;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVacc.getModel();
        model.setRowCount(0);
        UserAccount distributor = new UserAccount();
        try{
        for(WorkRequest rv:userAccount.getWorkQueue().getWorkRequestList()){
            System.out.println(enterprise.getName());
//        ArrayList<PurchaseInventory> inv = ((requestVaccine) rv).getInventoryPurchase();
            Object row[] = new Object[4];
            row[0] = rv;
            row[1] = rv.getReceiver().getUsername();
            
//            if(inv!=null){
//            for(PurchaseInventory p : inv){
                
                if(rv.getStatus().equals("Approved")){
                System.out.println(enterprise.getName());
                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                        System.out.println(u.getRole().toString());
                        if(u.getRole().toString().equals("Business.Role.DistributionRole")){
                            ((requestVaccine) rv).setDistribution(u);
                            distributor = u;
                            System.out.println(distributor.getUsername());
                            int c = ((requestVaccine) rv).getCount();
                row[2] = c;
                
                currentCount = c;
                ((requestVaccine) rv).setCount(c);
//                            System.out.println(o.getName());
//                            VaccineCount vc = new VaccineCount();
//                            vc.setVaccineName(rv.getReceiver().toString());
//                            vc.setCount(p.getQty());
//                            currEP += p.getQty();
//                            System.out.println(p.getQty());
//                            c+=p.getQty();
//                            System.out.println(c);
                            
//                            DistributionOrganization org = ((DistributionOrganization) o).getVaccineDirectory().add(vc);
                        }
                    }
                }
            }
                
                distributor.getWorkQueue().getWorkRequestList().add(rv);
                
//            }
//            }
            row[3] = rv.getStatus();
            System.out.println(rv.getStatus());
            
//            row[2] = 
            model.addRow(row);
        }
        }
        catch(NullPointerException e){
            System.out.println("No records found");
        }
    }
}
