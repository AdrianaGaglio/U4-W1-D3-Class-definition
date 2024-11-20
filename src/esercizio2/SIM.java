package esercizio2;

public class SIM {
    private String numeroTelefono;
    private double creditoDisponibile;
    private Chiamata[] listaChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public double getCreditoDisponibile() {
        return this.creditoDisponibile;
    }

    public void setCreditoDisponibile(double costoChiamata) {
        this.creditoDisponibile -= costoChiamata;
    }

    public void stampaDati() {
        System.out.println("=> Numero telefono: " + this.getNumeroTelefono());
        System.out.println("=> Credito disponibile: " + this.getCreditoDisponibile() + "€");
        int counter = 0;
        for (int i = 0; i < this.listaChiamate.length; i++) {
            if (this.listaChiamate[i] == null) {
                break;
            } else {
                counter++;
                System.out.println("Numero chiamato: " + this.listaChiamate[i].getNumeroChiamato() + ", durata: " + this.listaChiamate[i].getDurata());
            }
        }
        if(counter == 0) {
            System.out.println("Nessuna chiamata effettuata");
        } else {
            System.out.println("Totale chiamate: " + counter);
        }
    }

    public void ricarica(int ricarica) {
        this.creditoDisponibile += ricarica;
    }

    public void effettuaChiamata(String numero, double durata) {
        for (int i = 0; i < this.listaChiamate.length; i++) {
            if (this.listaChiamate[i] == null) {
                this.listaChiamate[i] = new Chiamata(numero, durata);
                this.listaChiamate[i].setCosto(durata);
                this.setCreditoDisponibile(this.listaChiamate[i].getCostoChiamata());
                return;
            }
        }
    }
}
