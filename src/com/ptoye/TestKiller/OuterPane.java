/*
 * OuterPane.java
 *
 * Created on 22 January 2007, 22:10
 */
package com.ptoye.TestKiller;

//import com.ptoye.TestKiller.TestKiller;
import java.awt.Color;

/**
 *
 * @author PToye
 */
public class OuterPane extends javax.swing.JPanel {

  /**
   *
   */
  static final long serialVersionUID = 2L;

  static Color PERM_COLOUR = Color.BLACK;
  private static Color TEMP_COLOUR = new Color(192, 90, 192);
  private static Color INITIAL_CUSTOM_COLOUR = Color.CYAN;

  private TestKiller tk;

  /**
   * does the work for the constructor
   */
  private void initialiseNew() {
    initComponents();
    pnlButtons.setSize(pnlButtons.getSize().width, 250);
    setVisible(true);

  }

  /**
   * Constructor which should be called
   *
   * @param tk The Outer TestKiller frame
   */
  public OuterPane(TestKiller tk) {
    this.tk = tk;
    initialiseNew();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgColours = new javax.swing.ButtonGroup();
    pnlButtons = new javax.swing.JPanel();
    btnStart = new javax.swing.JButton();
    pnlColourButtons = new javax.swing.JPanel();
    rbtPerm = new javax.swing.JRadioButton();
    rbtTemp = new javax.swing.JRadioButton();
    rbtCustom = new javax.swing.JRadioButton();
    rbtCustom2 = new javax.swing.JRadioButton();
    btnUndo = new javax.swing.JButton();
    btnRedo = new javax.swing.JButton();
    btnSq = new javax.swing.JButton();
    btnRow = new javax.swing.JButton();
    btnCol = new javax.swing.JButton();
    btnPtoT = new javax.swing.JButton();
    btnTtoP = new javax.swing.JButton();
    btnSwap = new javax.swing.JButton();
    btnSwapPerm = new javax.swing.JButton();
    btnCustomCol = new javax.swing.JButton();
    filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
    lblGameTime = new javax.swing.JLabel();

    FormListener formListener = new FormListener();

    addComponentListener(formListener);
    setLayout(new java.awt.BorderLayout());

    pnlButtons.setLayout(new javax.swing.BoxLayout(pnlButtons, javax.swing.BoxLayout.LINE_AXIS));

    btnStart.setText("Start");
    btnStart.setToolTipText("Start game");
    btnStart.setMargin(new java.awt.Insets(2, 5, 2, 5));
    btnStart.setMaximumSize(new java.awt.Dimension(45, 23));
    btnStart.setMinimumSize(new java.awt.Dimension(45, 23));
    btnStart.setPreferredSize(new java.awt.Dimension(50, 23));
    pnlButtons.add(btnStart);

    pnlColourButtons.setLayout(new javax.swing.BoxLayout(pnlColourButtons, javax.swing.BoxLayout.Y_AXIS));

    bgColours.add(rbtPerm);
    rbtPerm.setMnemonic('P');
    rbtPerm.setText("Permanent");
    rbtPerm.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    rbtPerm.setMargin(new java.awt.Insets(0, 0, 0, 0));
    pnlColourButtons.add(rbtPerm);

    bgColours.add(rbtTemp);
    rbtTemp.setForeground(new java.awt.Color(255, 0, 255));
    rbtTemp.setMnemonic('T');
    rbtTemp.setText("Temporary");
    rbtTemp.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    rbtTemp.setMargin(new java.awt.Insets(0, 0, 0, 0));
    pnlColourButtons.add(rbtTemp);

    bgColours.add(rbtCustom);
    rbtCustom.setForeground(new java.awt.Color(0, 255, 255));
    rbtCustom.setMnemonic('C');
    rbtCustom.setText("Custom");
    rbtCustom.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    rbtCustom.setMargin(new java.awt.Insets(0, 0, 0, 0));
    pnlColourButtons.add(rbtCustom);

    bgColours.add(rbtCustom2);
    rbtCustom2.setForeground(new java.awt.Color(0, 153, 153));
    rbtCustom2.setText("Custom 2");
    rbtCustom2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    rbtCustom2.setMargin(new java.awt.Insets(0, 0, 0, 0));
    pnlColourButtons.add(rbtCustom2);

    pnlButtons.add(pnlColourButtons);

    btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptoye/TestKiller/images/undo_16.gif"))); // NOI18N
    btnUndo.setMnemonic('z');
    btnUndo.setToolTipText("Undo last move");
    btnUndo.setMaximumSize(new java.awt.Dimension(31, 25));
    btnUndo.setMinimumSize(new java.awt.Dimension(31, 25));
    btnUndo.setPreferredSize(new java.awt.Dimension(31, 25));
    pnlButtons.add(btnUndo);

    btnRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptoye/TestKiller/images/redo_16.gif"))); // NOI18N
    btnRedo.setMnemonic('y');
    btnRedo.setToolTipText("Redo");
    btnRedo.setMaximumSize(new java.awt.Dimension(31, 25));
    btnRedo.setMinimumSize(new java.awt.Dimension(31, 25));
    btnRedo.setPreferredSize(new java.awt.Dimension(31, 25));
    pnlButtons.add(btnRedo);

    btnSq.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
    btnSq.setText("□");
    btnSq.setToolTipText("Confine selected squares to square");
    btnSq.setMargin(new java.awt.Insets(2, 5, 2, 5));
    pnlButtons.add(btnSq);

    btnRow.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
    btnRow.setText("↔");
    btnRow.setToolTipText("Confine selected squares to row");
    btnRow.setMargin(new java.awt.Insets(2, 5, 2, 5));
    pnlButtons.add(btnRow);

    btnCol.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
    btnCol.setText("↔");
    btnCol.setToolTipText("Confine selected squares to column");
    btnCol.setMargin(new java.awt.Insets(2, 5, 2, 5));
    pnlButtons.add(btnCol);

    btnPtoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptoye/TestKiller/images/PtoT.gif"))); // NOI18N
    btnPtoT.setToolTipText("Make selected squares temporary");
    btnPtoT.setMargin(new java.awt.Insets(2, 5, 2, 5));
    pnlButtons.add(btnPtoT);

    btnTtoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptoye/TestKiller/images/TtoP.gif"))); // NOI18N
    btnTtoP.setToolTipText("Make selected squares permanent");
    btnTtoP.setMargin(new java.awt.Insets(2, 5, 2, 5));
    pnlButtons.add(btnTtoP);

    btnSwap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptoye/TestKiller/images/Swap.gif"))); // NOI18N
    btnSwap.setToolTipText("Swap");
    btnSwap.setMargin(new java.awt.Insets(2, 5, 2, 5));
    pnlButtons.add(btnSwap);

    btnSwapPerm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptoye/TestKiller/images/Swap_Perm.gif"))); // NOI18N
    btnSwapPerm.setToolTipText("Swap & make permanent");
    btnSwapPerm.setMargin(new java.awt.Insets(2, 5, 2, 5));
    pnlButtons.add(btnSwapPerm);

    btnCustomCol.setForeground(new java.awt.Color(0, 255, 255));
    btnCustomCol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptoye/TestKiller/images/CustomColour.gif"))); // NOI18N
    btnCustomCol.setToolTipText("Change custom colour");
    btnCustomCol.setMaximumSize(new java.awt.Dimension(70, 23));
    btnCustomCol.setMinimumSize(new java.awt.Dimension(70, 23));
    btnCustomCol.setPreferredSize(new java.awt.Dimension(65, 23));
    pnlButtons.add(btnCustomCol);
    pnlButtons.add(filler1);

    lblGameTime.setText("xx:xx:xx");
    pnlButtons.add(lblGameTime);

    add(pnlButtons, java.awt.BorderLayout.NORTH);
  }

  // Code for dispatching events from components to event handlers.

  private class FormListener implements java.awt.event.ComponentListener {
    FormListener() {}
    public void componentHidden(java.awt.event.ComponentEvent evt) {
    }

    public void componentMoved(java.awt.event.ComponentEvent evt) {
    }

    public void componentResized(java.awt.event.ComponentEvent evt) {
      if (evt.getSource() == OuterPane.this) {
        OuterPane.this.formComponentResized(evt);
      }
    }

    public void componentShown(java.awt.event.ComponentEvent evt) {
    }
  }// </editor-fold>//GEN-END:initComponents

  private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
  }//GEN-LAST:event_formComponentResized

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup bgColours;
  private javax.swing.JButton btnCol;
  private javax.swing.JButton btnCustomCol;
  private javax.swing.JButton btnPtoT;
  private javax.swing.JButton btnRedo;
  private javax.swing.JButton btnRow;
  private javax.swing.JButton btnSq;
  private javax.swing.JButton btnStart;
  private javax.swing.JButton btnSwap;
  private javax.swing.JButton btnSwapPerm;
  private javax.swing.JButton btnTtoP;
  private javax.swing.JButton btnUndo;
  private javax.swing.Box.Filler filler1;
  private javax.swing.JLabel lblGameTime;
  private javax.swing.JPanel pnlButtons;
  private javax.swing.JPanel pnlColourButtons;
  private javax.swing.JRadioButton rbtCustom;
  private javax.swing.JRadioButton rbtCustom2;
  private javax.swing.JRadioButton rbtPerm;
  private javax.swing.JRadioButton rbtTemp;
  // End of variables declaration//GEN-END:variables
}
