package esercizio3;

public class Carrello {
    private String clienteAssociato;
    private Articolo[] articoli;
    private double totale;

    public Carrello(String clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = new Articolo[20];
        this.totale = 0;
    }

    public double setTotale(Articolo articolo) {
        return this.totale += articolo.getPrezzo();
    }

    public String getClienteAssociato() {
        return this.clienteAssociato;
    }

    public Articolo[] getArticoli() {
        return this.articoli;
    }

    public double getTotale() {
        return this.totale;
    }

    public void addArticolo(Articolo articolo) {
        articolo.setNumeroPezzi();
        for(int i = 0; i < this.articoli.length; i++) {
            if(this.articoli[i] == null) {
                this.articoli[i] = new Articolo(articolo.getCodiceArticolo(), articolo.getDescrizioneArticolo(), articolo.getPrezzo());
                this.setTotale(articoli[i]);
                break;
            }
        }
    }
    public void stampaCarrello() {
        System.out.println("Cliente: " + this.getClienteAssociato());
        int counter = 0;
        for(Articolo articolo : articoli) {
            if(articolo == null) {
                break;
            } else {
                if(counter == 0) System.out.println("Lista articoli:");
                counter ++;
                System.out.println("Codice: " + articolo.getCodiceArticolo() + ", " + articolo.getDescrizioneArticolo() + ", " + articolo.getPrezzo());
            }
        }
            if(counter == 0) System.out.println("!!! non ci sono articoli nel carrello !!!");
        System.out.println("Totale: " + this.getTotale() + "€");
    }
}
