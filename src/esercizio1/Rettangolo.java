package esercizio1;

public class Rettangolo {

    private int larghezza;
    private int altezza;

    public Rettangolo(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }
    
    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }
    
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public static void stampaRettangolo(Rettangolo rett) {
        int area = rett.altezza * rett.larghezza;
        int perimetro = 2 * (rett.larghezza + rett.altezza);
        System.out.println("Area: " + area + ", Perimetro: " + perimetro);
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("Primo rettangolo:");
        stampaRettangolo(rett1);
        System.out.println("Secondo rettangolo:");
        stampaRettangolo(rett2);
        int sommaAree = (rett1.altezza * rett1.larghezza) + (rett2.altezza * rett2.larghezza);
        int sommaPerimetri = 2 * (rett1.altezza + rett1.larghezza + rett2.altezza + rett2.larghezza);
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(5, 10);
        Rettangolo rett2 = new Rettangolo(3, 7);
        System.out.println("Primo rettangolo: ");
        Rettangolo.stampaRettangolo(rett1);
        System.out.println("Secondo rettangolo: ");
        Rettangolo.stampaRettangolo(rett2);
        System.out.println("-----------------");
        Rettangolo.stampaDueRettangoli(rett1, rett2);
    }
}
