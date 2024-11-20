package esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int numeroPezzi;

    public String getCodiceArticolo() {
        return this.codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return this.descrizioneArticolo;
    }

    public int getNumeroPezzi() {
        return this.numeroPezzi;
    }

    public void setNumeroPezzi() {
        this.numeroPezzi -= 1;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezzi) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezzi = numeroPezzi;
    }

    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
    }

    public void stampaArticolo() {
        System.out.println("Codice: " + this.getCodiceArticolo() + ", descrizione: " + this.getDescrizioneArticolo() + ", prezzo: " + this.getPrezzo());
    }


}