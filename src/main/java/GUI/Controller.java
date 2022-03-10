package GUI;

import GUI.GUI_app;
import Model.Polinom;
import Operatii.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private GUI_app view;
    private AddClass add;
    private DerivativeClass der;
    private IntegrationClass inter;
    private SubClass subb;
    private MultiplicClass inmul;

    private Polinom p1;
    private Polinom p2;

    public Controller(GUI_app view, AddClass add, DerivativeClass der, IntegrationClass inter, SubClass subb, MultiplicClass inmul) {
        this.view = view;
        this.add = add;
        this.der = der;
        this.inter = inter;
        this.subb = subb;
        this.inmul = inmul;

        this.view.makeAdunareList(new AddPackage());
        this.view.makeScadereList(new SubbPackage());
        this.view.makeDerivareList(new DerivativePackage());
        this.view.makeIntegrareList(new IntegraTionPackage());
        this.view.makeInmultireList(new MultiplicPackage());
    }
   public class AddPackage implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            p1 = new Polinom();
            p2 = new Polinom();

            try{
                p1.transformP(view.getTextFieldP1().getText());
                p2.transformP(view.getTextFieldP2().getText());
                view.setTextField1(add.forAll(p1, p2).toString());
            } catch (Exception ex) {
                view.afisareEroare("error");
            }
        }
    }
    public class SubbPackage implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent b) {
            p1 = new Polinom();
            p2 = new Polinom();


            try{
                p1.transformP(view.getTextFieldP1().getText());
                p2.transformP(view.getTextFieldP2().getText());
                Polinom p3 = subb.forAll(p1, p2);
                System.out.println(p3.toString());
                view.setTextField1(p3.toString());
            } catch (Exception ex) {
                view.afisareEroare("Erroare");
            }
        }
    }
    public class DerivativePackage implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            p1 = new Polinom();


            try{
                p1.transformP(view.getTextFieldP1().getText());
                view.setTextField1(der.forAll1(p1).toString());
            } catch (Exception ex) {
                view.afisareEroare("Erroare");
            }
        }
    }
   public class IntegraTionPackage implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            p1 = new Polinom();


            try{
                p1.transformP(view.getTextFieldP1().getText());
                view.setTextField1(inter.forAll1(p1).toString());
            } catch (Exception ex) {
                view.afisareEroare("Erroare");
            }
        }
    }
    public class MultiplicPackage implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            p1 = new Polinom();
            p2 = new Polinom();

            try{
                p1.transformP(view.getTextFieldP1().getText());
                p2.transformP(view.getTextFieldP2().getText());
                view.setTextField1(inmul.forAll(p1, p2).toString());
            } catch (Exception ex) {
                view.afisareEroare("Erroare");
            }
        }
    }

}
