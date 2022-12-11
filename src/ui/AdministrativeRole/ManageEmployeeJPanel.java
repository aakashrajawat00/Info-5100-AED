/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruchachotalia
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
    
    public void populateOrganizationComboBox(){
        cmbOrg.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            cmbOrg.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        cmborgEmp.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            cmborgEmp.addItem(organization);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
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
        tblOrg = new javax.swing.JTable();
        btnCreatee = new javax.swing.JButton();
        cmbOrg = new javax.swing.JComboBox();
        lblOrg = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmborgEmp = new javax.swing.JComboBox();
        lblSelOrganization = new javax.swing.JLabel();
        separatorLine2 = new javax.swing.JSeparator();
        lbltitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrg.setForeground(new java.awt.Color(36, 47, 65));
        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrg.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblOrg.setRowHeight(20);
        jScrollPane1.setViewportView(tblOrg);
        if (tblOrg.getColumnModel().getColumnCount() > 0) {
            tblOrg.getColumnModel().getColumn(0).setResizable(false);
            tblOrg.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 480, 180));

        btnCreatee.setBackground(new java.awt.Color(204, 255, 255));
        btnCreatee.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnCreatee.setText("Create Employee");
        btnCreatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateeActionPerformed(evt);
            }
        });
        add(btnCreatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        cmbOrg.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });
        add(cmbOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 240, -1));

        lblOrg.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblOrg.setForeground(new java.awt.Color(255, 255, 255));
        lblOrg.setText("Organization:");
        add(lblOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lblName.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        txtName.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 210, -1));

        cmborgEmp.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmborgEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmborgEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmborgEmpActionPerformed(evt);
            }
        });
        add(cmborgEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 260, -1));

        lblSelOrganization.setBackground(new java.awt.Color(0, 0, 0));
        lblSelOrganization.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblSelOrganization.setText("Select organization to add new employee in:");
        add(lblSelOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        separatorLine2.setForeground(new java.awt.Color(0, 0, 0));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 220, 10));

        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/providers.gif"))); // NOI18N
        add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 830, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateeActionPerformed
        
       
           
    }//GEN-LAST:event_btnCreateeActionPerformed

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
       
    }//GEN-LAST:event_cmbOrgActionPerformed

    private void cmborgEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmborgEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmborgEmpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatee;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JComboBox cmborgEmp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblSelOrganization;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
