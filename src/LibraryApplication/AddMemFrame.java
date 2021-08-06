/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddMemFrame.java
 *
 * Created on 01-Oct-2010, 11:57:20
 */
package LibraryApplication;

/**
 *
 * @author Esau
 */
import java.sql.*;

public class AddMemFrame extends javax.swing.JInternalFrame {

    /** Creates new form AddMemFrame */
    public AddMemFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        telephoneField = new javax.swing.JTextField();
        aStatusField = new javax.swing.JTextField();
        okAddMemButton = new javax.swing.JButton();
        clearAddMemButton = new javax.swing.JButton();
        cancelAddMemButton = new javax.swing.JButton();
        amLabel = new javax.swing.JLabel();
        mStatusComboBox = new javax.swing.JComboBox();
        addressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Add Member");

        jLabel1.setText("Name:");

        jLabel2.setText("Address:");

        jLabel3.setText("Telephone No:");

        jLabel4.setText("Library Status:");

        jLabel5.setText("Membership Fee:");

        nameField.setPreferredSize(new java.awt.Dimension(59, 20));

        telephoneField.setPreferredSize(new java.awt.Dimension(59, 20));

        aStatusField.setPreferredSize(new java.awt.Dimension(59, 20));

        okAddMemButton.setText("Add");
        okAddMemButton.setPreferredSize(new java.awt.Dimension(73, 23));
        okAddMemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAddMemButtonActionPerformed(evt);
            }
        });

        clearAddMemButton.setText("Clear");
        clearAddMemButton.setPreferredSize(new java.awt.Dimension(73, 23));
        clearAddMemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAddMemButtonActionPerformed(evt);
            }
        });

        cancelAddMemButton.setText("Cancel");
        cancelAddMemButton.setPreferredSize(new java.awt.Dimension(73, 23));
        cancelAddMemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddMemButtonActionPerformed(evt);
            }
        });

        amLabel.setText("Please Fill All Details Then Press Add");

        mStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reader", "Borrower" }));

        addressField.setPreferredSize(new java.awt.Dimension(59, 20));

        jLabel6.setText("Ksh.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressField, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(telephoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(okAddMemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(clearAddMemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cancelAddMemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(amLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mStatusComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(amLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(aStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okAddMemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearAddMemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelAddMemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearAddMemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAddMemButtonActionPerformed
        // TODO add your handling code here:
        nameField.setText("");
        addressField.setText("");
        telephoneField.setText("");
        aStatusField.setText("");
    }//GEN-LAST:event_clearAddMemButtonActionPerformed

    private void cancelAddMemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddMemButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelAddMemButtonActionPerformed

    private void okAddMemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAddMemButtonActionPerformed
        // TODO add your handling code here:
        int updateQuery = 0;
        String feedback = "New Member Details Not Inserted";

        String name = nameField.getText();
        String address = addressField.getText();
        String telephone = telephoneField.getText();
        String status = (String) mStatusComboBox.getSelectedItem();
        String owing = aStatusField.getText();
        try {
            Connection con = null;
            //Load JBBC driver "com.mysql.jdbc.Driver"
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

            PreparedStatement statement = con.prepareStatement("INSERT INTO library.members (name, address, telephone, status, owing) VALUES ('" + name + "', '" + address + "', '" + telephone + "', '" + status + "', '" + owing + "')");
            updateQuery = statement.executeUpdate();

            statement.close();
            con.close();

            if (updateQuery != 0) {
                feedback = "Member Details Inserted Successfully";
                nameField.setText("");
                addressField.setText("");
                telephoneField.setText("");
                aStatusField.setText("");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        amLabel.setText(feedback);

    }//GEN-LAST:event_okAddMemButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aStatusField;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel amLabel;
    private javax.swing.JButton cancelAddMemButton;
    private javax.swing.JButton clearAddMemButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox mStatusComboBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton okAddMemButton;
    private javax.swing.JTextField telephoneField;
    // End of variables declaration//GEN-END:variables
}
