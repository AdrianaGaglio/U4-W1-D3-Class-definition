package esercizio2;

public class Chiamata {
    private double durata;
    private String numeroChiamato;
    private double costo;

    public Chiamata(String numeroChiamato, double durata) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
        this.costo = 0.2;
    }

    public void setCosto(double durata) {
        this.costo += costo * durata;
    }

    public double getCostoChiamata() {
        return this.costo;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public double getDurata() {
        return durata;
    }



}
