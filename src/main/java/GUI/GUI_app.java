package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GUI_app extends JFrame {
    private JPanel panel1;
    private JTextField textFieldP1;
    private JTextField textFieldP2;
    private JButton adunareButton;
    private JButton scadereButton;
    private JButton inmultireButton;
    private JButton impartireButton;
    private JButton derivareButton;
    private JButton integrareButton;
    private JTextField textField1;
    private JLabel Label;

    public void setTextField1(String textField1) {
        this.textField1.setText(textField1);
    }

    public void setLabel(String label) {
        this.Label.setText(label);
    }

    public GUI_app(){
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public JButton getAdunareButton() {
        return adunareButton;
    }

    public JButton getScadereButton() {
        return scadereButton;
    }

    public JButton getInmultireButton() {
        return inmultireButton;
    }

    public JButton getImpartireButton() {
        return impartireButton;
    }

    public JButton getDerivareButton() {
        return derivareButton;
    }

    public JButton getIntegrareButton() {
        return integrareButton;
    }
    public void makeAdunareList(ActionListener listenForAdunare){
        adunareButton.addActionListener(listenForAdunare);
    }
    public void makeScadereList(ActionListener listenForScadere){
        scadereButton.addActionListener(listenForScadere);
    }
    public void makeInmultireList(ActionListener listenForInmultire){
        inmultireButton.addActionListener(listenForInmultire);
    }
    public void makeDerivareList(ActionListener listenForDerivare){
        derivareButton.addActionListener(listenForDerivare);
    }
    public void makeIntegrareList(ActionListener listenForIntegrare){
        integrareButton.addActionListener(listenForIntegrare);
    }

    public JTextField getTextFieldP1() {
        return textFieldP1;
    }

    public JTextField getTextFieldP2() {
        return textFieldP2;
    }
    public void afisareEroare(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
