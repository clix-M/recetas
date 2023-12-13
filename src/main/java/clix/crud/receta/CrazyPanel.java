/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package clix.crud.receta;


/**
 *
 * @author clint
 */
public class CrazyPanel extends javax.swing.JPanel {

    private FlatLafStyleComponent flatLafStyleComponent;
    private MigLayoutConstraints migLayoutConstraints;
    private MigLayoutCustom migLayout;

    public FlatLafStyleComponent getFlatLafStyleComponent() {
        return this.flatLafStyleComponent;
    }

    public void setFlatLafStyleComponent(FlatLafStyleComponent flatLafStyleComponent) {
        this.flatLafStyleComponent = flatLafStyleComponent;
        this.installStyleComponents();
    }

    public MigLayoutConstraints getMigLayoutConstraints() {
        return this.migLayoutConstraints;
    }

    public void setMigLayoutConstraints(MigLayoutConstraints migLayoutConstraints) {
        this.migLayoutConstraints = migLayoutConstraints;
        this.installLayoutConstraints();
    }
    public CrazyPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        this.migLayoutConstraints = new MigLayoutConstraints("", "", "", new String[0]);
        this.migLayout = new MigLayoutCustom();
        this.migLayout.setMigLayoutConstraints(this.migLayoutConstraints);
        this.setLayout(this.migLayout);
    }// </editor-fold>//GEN-END:initComponents
    private void installLayoutConstraints() {
        this.migLayout.setMigLayoutConstraints(this.migLayoutConstraints);
    }

    public void installStyleComponents() {
        this.putClientProperty("FlatLaf.style", this.flatLafStyleComponent.getOwnStyle());
        this.migLayout.setFlatLafStyleComponent(this.flatLafStyleComponent);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
