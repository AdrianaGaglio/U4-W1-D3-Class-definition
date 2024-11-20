package esercizio2;

public class Main {
    public static void main(String[] args) {
        SIM sim1 = new SIM("123456789");
        System.out.println("Creata sim1:");
        sim1.stampaDati();
        System.out.println("Ricarica e stampo dettagli");
        sim1.ricarica(10);
        sim1.stampaDati();
        System.out.println("Effettuo chiamata e stampo dettagli");
        sim1.effettuaChiamata("111111", 5);
        sim1.effettuaChiamata("222222", 5);
        sim1.effettuaChiamata("333333", 5);
        sim1.effettuaChiamata("444444", 5);
        sim1.effettuaChiamata("555555", 5);
        sim1.stampaDati();
    }
}
