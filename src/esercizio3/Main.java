package esercizio3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("=> Creo nuovo articolo <=");
        Articolo art1 = new Articolo("1111111", "Laptop Lenovo", 700, 100);
        System.out.println("Articolo creato:");
        art1.stampaArticolo();

        System.out.println("=> Creo nuovo articolo <=");
        Articolo art2 = new Articolo("22222", "Monitor HP", 150, 100);
        System.out.println("Articolo creato:");
        art2.stampaArticolo();

        System.out.println("=> Creo nuovo cliente <=");
        Cliente cliente1 = new Cliente("aaaa", "Mario Rossi", "mario.rossi@mail.com", new Date());
        System.out.println("Cliente creato: \n Codice: " + cliente1.getCodiceCliente() + ", nome e cognome: " + cliente1.getNomeCognome() + ", email: " + cliente1.getEmail() + ", data iscrizione: " + cliente1.getDataIscrizione());
        Carrello carrello1 = new Carrello(cliente1.getCodiceCliente());
        System.out.println("=> Stampo carrello <=");
        carrello1.stampaCarrello();

        carrello1.addArticolo(art1);
        System.out.println("=> Stampo carrello aggiornato <=");
        carrello1.stampaCarrello();

        carrello1.addArticolo(art2);
        System.out.println("=> Stampo carrello aggiornato <=");
        carrello1.stampaCarrello();


    }
}