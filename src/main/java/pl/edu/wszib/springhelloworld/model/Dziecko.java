package pl.edu.wszib.springhelloworld.model;

public class Dziecko {

    private Ciastko ciastko;

    public Dziecko(Ciastko ciastko) {
        this.ciastko = ciastko;
    }

    public void ugryz() {
        if(!this.ciastko.ugryzione()) {
            this.ciastko.ugryz();
            System.out.println("Yum");
        } else {
            System.out.println("Juz ugryzione");
        }
    }

}
