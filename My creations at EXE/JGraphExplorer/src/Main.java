
import java.awt.*;
import java.awt.geom.Line2D;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash
 */
public class Main extends javax.swing.JFrame {
    Graphics2D g2d;
    int middleX, middleY;
    int mousex, mousey, graphx, graphy;
    int lx, ly;
    int p1x = 0, p1y = 0, p2x = 0, p2y = 0;
    Line2D l2d;
    int type;
 
    /**
     * Creates new form Main
     */
    public Main()  {
        initComponents();
    
    }
  public void drawGraph(int type){
      if(type == 1){                                                            //type 1
      int temp = Integer.parseInt(jTextField6.getText());
jLabel8.setText("x = "+temp+"c");
        for(int i=-temp*250; i<=temp*250;i=i+1){
                        jLabel13.setText(""+p1x);
            jLabel14.setText(""+p1y);
            jLabel15.setText(""+p2x);
            jLabel16.setText(""+p2y);
            p2x = middleX+(i*8);
            p2y = middleY-((temp*i)*8);
            g2d.setColor(Color.RED);
            g2d.drawLine(p1x, p1y, p2x, p2y);
            p1x = p2x;
            p1y = p2y;
            jLabel13.setText(""+p1x);
            jLabel14.setText(""+p1y);
            jLabel15.setText(""+p2x);
            jLabel16.setText(""+p2y);
            g2d.clearRect(0, 0, middleX, middleY);
        }
                    g2d.setColor(Color.DARK_GRAY);
   for(int z=0; z<=middleX; z=z+8){                          //draw x bars
       g2d.drawLine(z,0,z,middleX);
   }
   for(int z=0; z<=middleY; z=z+8){                        //draws y bars
       g2d.drawLine(0,z,middleX,z);
   }
      g2d.setColor(Color.GREEN);
g2d.drawLine(jPanel1.getWidth()/2, 0,jPanel1.getWidth()/2,jPanel1.getHeight());         // draws the middle x line
g2d.drawLine(0, jPanel1.getHeight()/2,jPanel1.getWidth(),jPanel1.getHeight()/2);        //draws the middle y line
      }
      else if(type == 2){                                                               // type 2
          int temp = Integer.parseInt(jTextField6.getText());
jLabel8.setText("x = (b^"+temp+")");
        for(int i=(-50);i<=50;i=i+1){
                        jLabel13.setText(""+p1x);
            jLabel14.setText(""+p1y);
            jLabel15.setText(""+p2x);
            jLabel16.setText(""+p2y);
            p2x = middleX+(i*8);
            p2y = (int) (middleY-((Math.pow(i, temp))*8));
            g2d.setColor(Color.RED);
            g2d.drawLine(p1x, p1y, p2x, p2y);
            p1x = p2x;
            p1y = p2y; 
            g2d.clearRect(0, 0, middleX, middleY);
        }
                    g2d.setColor(Color.DARK_GRAY);
   for(int z=0; z<=middleX; z=z+8){                          //draw x bars
       g2d.drawLine(z,0,z,middleX);
   }
   for(int z=0; z<=middleY; z=z+8){                        //draws y bars
       g2d.drawLine(0,z,middleX,z);
   }
      g2d.setColor(Color.GREEN);
g2d.drawLine(jPanel1.getWidth()/2, 0,jPanel1.getWidth()/2,jPanel1.getHeight());         // draws the middle x line
g2d.drawLine(0, jPanel1.getHeight()/2,jPanel1.getWidth(),jPanel1.getHeight()/2);        //draws the middle y line
      }
            else if(type == 3){                                                        // type 3
          int temp = Integer.parseInt(jTextField6.getText());
jLabel8.setText("x = (b/"+temp+")");
int cv = temp*5;
        for(int i=0; i<=cv;i=i+temp){
                        jLabel13.setText(""+p1x);
            jLabel14.setText(""+p1y);
            jLabel15.setText(""+p2x);
            jLabel16.setText(""+p2y);
            p2x = middleX+(i*8);
            p2y = middleY-((i/temp)*8);
            g2d.setColor(Color.RED);
            g2d.drawLine(p1x, p1y, p2x, p2y);
            p1x = p2x;
            p1y = p2y; 
            g2d.clearRect(0, 0, middleX, middleY);
        }
                    g2d.setColor(Color.DARK_GRAY);
   for(int z=0; z<=middleX; z=z+8){                          //draw x bars
       g2d.drawLine(z,0,z,middleX);
   }
   for(int z=0; z<=middleY; z=z+8){                        //draws y bars
       g2d.drawLine(0,z,middleX,z);
   }
      g2d.setColor(Color.GREEN);
g2d.drawLine(jPanel1.getWidth()/2, 0,jPanel1.getWidth()/2,jPanel1.getHeight());         // draws the middle x line
g2d.drawLine(0, jPanel1.getHeight()/2,jPanel1.getWidth(),jPanel1.getHeight()/2);        //draws the middle y line
      }
                  else if(type == 4){                                                        // type 4
                                          
                      
          int temp = Integer.parseInt(jTextField6.getText());
jLabel8.setText("x = sin("+temp+")");
int cv = temp*5;
        for(int i=-600; i<=600;i=i+1){
                        jLabel13.setText(""+p1x);
            jLabel14.setText(""+p1y);
            jLabel15.setText(""+p2x);
            jLabel16.setText(""+p2y);
            p2x = middleX+(i*8);
            p2y = middleY-((i/temp)*8);
            g2d.setColor(Color.RED);
            g2d.drawLine(p1x, p1y, p2x, p2y);
            p1x = p2x;
            p1y = p2y; 
            g2d.clearRect(0, 0, middleX, middleY);
        }
                    g2d.setColor(Color.DARK_GRAY);
   for(int z=0; z<=middleX; z=z+8){                          //draw x bars
       g2d.drawLine(z,0,z,middleX);
   }
   for(int z=0; z<=middleY; z=z+8){                        //draws y bars
       g2d.drawLine(0,z,middleX,z);
   }
      g2d.setColor(Color.GREEN);
g2d.drawLine(jPanel1.getWidth()/2, 0,jPanel1.getWidth()/2,jPanel1.getHeight());         // draws the middle x line
g2d.drawLine(0, jPanel1.getHeight()/2,jPanel1.getWidth(),jPanel1.getHeight()/2);        //draws the middle y line
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1140, 730));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("Current graph coordinates = 0,0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Current Mouse coordinates = 0,0");

        jLabel2.setText("Locate point:");

        jLabel3.setText("X:");

        jLabel4.setText("Y:");

        jButton2.setText("Locate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "a = bc", "a = (b^c)", "a = b/c" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Equation"));
        jPanel3.setEnabled(false);

        jLabel5.setText("x = bc");

        jLabel7.setText("B = ");

        jButton3.setText("Create graph");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("The equation is:");

        jLabel8.setText("NULL");

        jLabel9.setText("Point 1 X = ");

        jLabel10.setText("Point 1 Y = ");

        jLabel11.setText("Point 2 X = ");

        jLabel12.setText("Point 2 Y = ");

        jLabel13.setText("000");

        jLabel14.setText("000");

        jLabel15.setText("000");

        jLabel16.setText("000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6))
                            .addComponent(jLabel5))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reset Graph");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
    }//GEN-LAST:event_formMouseMoved
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    }//GEN-LAST:event_formMouseClicked
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
    }//GEN-LAST:event_formMouseWheelMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jButton1.setEnabled(false);
        Graphics g = jPanel1.getGraphics();
        g2d = (Graphics2D)g;
    super.paintComponents(g);
   g2d.fillRect(0,0,jPanel1.getWidth(), jPanel1.getHeight());
   g2d.setColor(Color.DARK_GRAY);
   for(int i=0; i<=jPanel1.getWidth(); i=i+8){                          //draw x bars
       g2d.drawLine(i,0,i,jPanel1.getWidth());
   }
   for(int i=0; i<=jPanel1.getHeight(); i=i+8){                        //draws y bars
       g2d.drawLine(0,i,jPanel1.getWidth(),i);
   }
   middleX = jPanel1.getWidth()/2;
   middleY = jPanel1.getHeight()/2;
   g2d.setColor(Color.GREEN);
g2d.drawLine(jPanel1.getWidth()/2, 0,jPanel1.getWidth()/2,jPanel1.getHeight());         // draws the middle x line
g2d.drawLine(0, jPanel1.getHeight()/2,jPanel1.getWidth(),jPanel1.getHeight()/2);        //draws the middle y line
g2d.drawString("0,0", middleX+5, middleY+15);                   //draws the 0,0 string

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
 mousex = evt.getX();
mousey = evt.getY();
        jTextField1.setText("Current Mouse coordinates ="+mousex+","+mousey); //sets current mouse coordinateS
    
     graphx = (mousex-middleX)/8;                                                   //calculates the graph x
     graphy = (middleY-mousey)/8;                                                   //calculates the graph y
jTextField2.setText("Current Graph coordinates ="+graphx+","+graphy); //sets current graph coordinateS       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
g2d.setColor(Color.GREEN);                                      
g2d.drawString(""+graphx+","+graphy, evt.getX(), evt.getY());   //draws the coordinates when mouse clicked
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
lx = Integer.parseInt(jTextField3.getText());
ly = Integer.parseInt(jTextField4.getText());
int hrx = middleX+(lx*8);                                                   //calculates the x position on graph 
int hry = middleY-(ly*8);                                                   //calculates the y position on graph
g2d.drawString(""+lx+","+ly, hrx, hry);                                     //draws the required coodinates of the entered values
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
p1x = p1y = p2x = p2y = 0;
        if(jComboBox1.getSelectedItem()!= "..."){
jPanel3.setEnabled(true);
}
else{
jPanel3.setEnabled(false);    
}
if(jComboBox1.getSelectedItem() == "a = (b^c)"){
    jLabel5.setText("a = (b^c)");
    jLabel7.setText("c = ");
}
else if(jComboBox1.getSelectedItem() == "a = b/c"){
    jLabel5.setText("a = b/c");
    jLabel7.setText("c = ");
}
else{
    jLabel5.setText("a = bc");
    jLabel7.setText("B = ");
}
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(jComboBox1.getSelectedItem() == "a = bc"){
    type = 1;
    drawGraph(1);
}
else if(jComboBox1.getSelectedItem() == "a = (b^c)"){
     drawGraph(2);
}
else if(jComboBox1.getSelectedItem() == "a = b/c"){
     drawGraph(3);
}
else if(jComboBox1.getSelectedItem() == "a = sin(b)"){
     drawGraph(4);
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
p1x = p1y = p2x = p2y = 0;
            jLabel13.setText(""+p1x);
            jLabel14.setText(""+p1y);
            jLabel15.setText(""+p2x);
            jLabel16.setText(""+p2y);
        g2d.clearRect(0, 0, getWidth(), getHeight());
g2d.setColor(Color.BLACK);
   g2d.fillRect(0,0,jPanel1.getWidth(), jPanel1.getHeight());
   g2d.setColor(Color.DARK_GRAY);
   for(int i=0; i<=jPanel1.getWidth(); i=i+8){                          //draw x bars
       g2d.drawLine(i,0,i,jPanel1.getWidth());
   }
   for(int i=0; i<=jPanel1.getHeight(); i=i+8){                        //draws y bars
       g2d.drawLine(0,i,jPanel1.getWidth(),i);
   }
   middleX = jPanel1.getWidth()/2;
   middleY = jPanel1.getHeight()/2;
   g2d.setColor(Color.GREEN);
g2d.drawLine(jPanel1.getWidth()/2, 0,jPanel1.getWidth()/2,jPanel1.getHeight());         // draws the middle x line
g2d.drawLine(0, jPanel1.getHeight()/2,jPanel1.getWidth(),jPanel1.getHeight()/2);        //draws the middle y line
g2d.drawString("0,0", middleX+5, middleY+15);                   //draws the 0,0 string


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
