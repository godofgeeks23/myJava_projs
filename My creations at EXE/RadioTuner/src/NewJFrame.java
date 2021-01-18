
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Mar 21, 2014, 8:14:58 AM
 */

/**
 *
 * @author Aakash
 */
public class NewJFrame extends javax.swing.JFrame {
int pv = 0, cx, ra = 0, width, height;;
double fa;
Graphics g;
Graphics2D g2d;
AffineTransform at;
BufferedImage img;
    /** Creates new form NewJFrame */
    public NewJFrame() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        panel1 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel1MouseDragged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panel1Layout = new org.jdesktop.layout.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 996, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 574, Short.MAX_VALUE)
        );

        jToolBar1.add(panel1);

        jButton1.setText("Load Components");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1)
                .addContainerGap(889, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(8, 8, 8)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
g = panel1.getGraphics();
g2d = (Graphics2D)g;
try {
img = ImageIO.read(new File("src/Picture1.png"));
g2d.drawImage(img, 0, 0 ,panel1);
width = img.getWidth();
height = img.getHeight();
} catch (IOException ex) {
Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
}
jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseDragged
cx = evt.getX();
if(cx>pv) {
    at = new AffineTransform();
    ra = ra+5;
    fa = Math.toRadians(ra);
    at.setToRotation(fa, (width/2), (height/2));
    g2d.setTransform(at);
    g2d.drawImage(img, null, 0, 0);
}
if(cx<pv) {
    at = new AffineTransform();
    ra = ra-5;
    fa = Math.toRadians(ra);
    at.setToRotation(fa, (width/2), (height/2));
    g2d.setTransform(at);
    g2d.drawImage(img, null, 0, 0);
}
pv = cx;
    }//GEN-LAST:event_panel1MouseDragged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
} 
catch (Exception exc) {
}

                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables

}