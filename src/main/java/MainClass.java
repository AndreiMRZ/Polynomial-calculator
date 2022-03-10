import GUI.Controller;
import GUI.GUI_app;
import Operatii.*;

public class MainClass {

        public static void main(String[] args){
         GUI_app gui = new GUI_app();
            AddClass add = new AddClass();
             DerivativeClass der = new DerivativeClass();
             IntegrationClass inter = new IntegrationClass();
            SubClass subb = new SubClass();
            MultiplicClass inmul = new MultiplicClass();
         Controller con = new Controller(gui,add, der, inter, subb, inmul );

        }
}
