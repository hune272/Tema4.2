import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autovehicul dacia = new Autovehicul();
        Autovehicul doi = new Autovehicul("BMW", Color.white, 0, 0, 250, new Sofer());
        Autovehicul trei = new Autovehicul("Mazda", Color.black, 0, 0, 230, new Sofer());
        //apeleaza automtat un string, merge fara toString
        /*System.out.println(dacia.toString());
        System.out.println(doi);
        System.out.println(trei);
        dacia.accelerare();
        dacia.accelerare();
        System.out.println(dacia);
        dacia.deccelerare();
        System.out.println(dacia.toString());
        dacia.oprire();*/
        System.out.println(dacia);
        }
    }

