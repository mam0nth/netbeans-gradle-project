
package org.netbeans.gradle.project.model.issue;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.netbeans.gradle.project.NbStrings;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;

@SuppressWarnings("serial")
public class IssueDetailsPanel extends javax.swing.JPanel {
    public IssueDetailsPanel(String detailsContent) {
        initComponents();

        jInfoTextArea.setText(detailsContent);
        jInfoTextArea.setCaretPosition(0);
    }

    public static JButton createShowStackTraceButton(final String caption, final String detailsContent) {
        JButton button = new JButton(NbStrings.getShowStackTrace());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showModalDialog(caption, detailsContent);
            }
        });
        return button;
    }

    public static void showModalDialog(String caption, String detailsContent) {
        IssueDetailsPanel panel = new IssueDetailsPanel(detailsContent);
        DialogDescriptor dlgDescriptor = new DialogDescriptor(
                panel,
                caption,
                true,
                new Object[]{DialogDescriptor.OK_OPTION},
                DialogDescriptor.OK_OPTION,
                DialogDescriptor.BOTTOM_ALIGN,
                null,
                null);
        Dialog dlg = DialogDisplayer.getDefault().createDialog(dlgDescriptor);
        dlg.pack();
        dlg.setVisible(true);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jInfoTextArea = new javax.swing.JTextArea();
        jHintCaption = new javax.swing.JLabel();

        jInfoTextArea.setEditable(false);
        jInfoTextArea.setColumns(20);
        jInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(jInfoTextArea);

        jHintCaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jHintCaption, org.openide.util.NbBundle.getMessage(IssueDetailsPanel.class, "IssueDetailsPanel.jHintCaption.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(jHintCaption))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jHintCaption, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jHintCaption;
    private javax.swing.JTextArea jInfoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
