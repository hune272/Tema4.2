import java.awt.*;
import java.util.StringJoiner;

public class Autovehicul {
    private String marca;
    private Color color;
    private int viteza;
    private int treaptaVitezei;
    private int vitezaMax;
    private static final int NR_TREPTE = 6;

    private Sofer sofer = new Sofer();

    private Rezervor rezervor = new Rezervor();

    public Autovehicul(String marca, Color color, int viteza, int treaptaVitezei, int vitezaMax, Sofer sofer, Rezervor rezervor) {
        this.marca = marca;
        this.color = color;
        this.viteza = viteza;
        this.treaptaVitezei = treaptaVitezei;
        this.vitezaMax = vitezaMax;
        this.sofer = sofer;
    }
    public Autovehicul(){
        this("Logan", Color.white, 0, 0, 200, new Sofer(), new Rezervor());
    }

    public String getMarca(){
        return marca;
    }
    public Color getColor(){
        return color;
    }
    public int getViteza(){
        return viteza;
    }
    public int getTreaptaVitezei(){
        return treaptaVitezei;
    }
    public int getVitezaMax(){
        return vitezaMax;
    }
    public int getNrTreapta(){
        return NR_TREPTE;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setViteza(int viteza){
        this.viteza = viteza;
    }
    public void setTreaptaVitezei(int treaptaVitezei){
        this.treaptaVitezei = treaptaVitezei;
    }
    public void setVitezaMax(int vitezaMax){
        this.vitezaMax = vitezaMax;
    }

    public String toString(){
        String s = "Autovehicului " + this.marca + " cu culoarea " + this.color + ", viteza curenta " + this.viteza + ", treapta curenta " +
                this.treaptaVitezei + ", treapta curenta " + this.NR_TREPTE + ", viteza max " +
                this.vitezaMax + ", treapta max " + this.NR_TREPTE + "\n" + "Sofer: " + this.sofer;
        return s;
    }

    public void accelerare(){
        if(this.viteza < vitezaMax){
            this.viteza += 20;
        }
        if(this.treaptaVitezei < NR_TREPTE){
            this.treaptaVitezei++;
        }
        this.treaptaVitezei += 20;
    }
    public void deccelerare(){
        if(this.treaptaVitezei > 0){
            this.treaptaVitezei--;
        }
        if(this.viteza > 20){
            this.viteza -= 20;
        }
    }
    public void oprire(){
        while(this.viteza > 0){
            deccelerare();
        }
    }
    public static void main(String[] args) {}
}
