public class Sofer {
    private String name;
    private int age;
    private int nrPermisConducere;

    public Sofer(String name, int age, int nrPermisConducere) {
        this.name = name;
        this.age = age;
        this.nrPermisConducere = nrPermisConducere;
    }
    public Sofer(){this("Ion", 50, 1);}

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getNrPermisConducere() {
        return nrPermisConducere;
    }
     public void setName(String name) {
        this.name = name;
     }
     public void setAge(int age) {
        this.age = age;
     }
     public void setNrPermisConducere(int nrPermisConducere) {
        this.nrPermisConducere = nrPermisConducere;
     }
    public String toString(){
        return "Numele " + this.name + " varsta " + this.age + " permisul " + this.nrPermisConducere;
    }

}
