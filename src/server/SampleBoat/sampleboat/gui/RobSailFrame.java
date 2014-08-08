/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RobSailFrame.java
 *
 * Created on Nov 1, 2010, 9:47:58 PM
 */

package sampleboat.gui;

/**
 *
 * @author Alex
 */
public class RobSailFrame extends javax.swing.JFrame {

    /** Creates new form RobSailFrame */
    public RobSailFrame() {
        initComponents();
        this.inputPanel1.setInputMap(inputMap1);
        this.worldServerPanel1.setSimpleMap(inputMap1);
        this.boatPanel1.setComponents(inputMap1,controlPanel1,worldServerPanel1);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        worldServerPanel1 = new sampleboat.gui.WorldServerPanel();
        boatPanel1 = new sampleboat.gui.BoatPanel();
        controlPanel1 = new sampleboat.gui.ControlPanel();
        jPanel1 = new javax.swing.JPanel();
        inputMap1 = new map.InputMap();
        inputPanel1 = new map.InputPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addTab("WorldServer", worldServerPanel1);
        jTabbedPane1.addTab("Boat", boatPanel1);
        jTabbedPane1.addTab("Control", controlPanel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputMap1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputMap1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Map", jPanel1);
        jTabbedPane1.addTab("MapEditor", inputPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RobSailFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sampleboat.gui.BoatPanel boatPanel1;
    private sampleboat.gui.ControlPanel controlPanel1;
    private map.InputMap inputMap1;
    private map.InputPanel inputPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private sampleboat.gui.WorldServerPanel worldServerPanel1;
    // End of variables declaration//GEN-END:variables

}
