
// Deklariramo javni razred Steklenica
/**
 * Razred za delo z steklenicami
 * @author Timotej Gerželj
 *
 */
public class Steklenica {
    private int kolicinaVsebine;
    private String vrstaVsebine;
    private boolean jeOdprta;
    private int kapaciteta;
    public static final String material = "Steklo";
    /**
     * Javni konstruktor
     * Ustvari nov objekt tipa Steklenica
     * @param k kapaciteta steklenice
     */
    public Steklenica(int k){
        kolicinaVsebine = 0;
        vrstaVsebine = "";
        jeOdprta = false;
        kapaciteta = k;
        System.out.println("Ustvarjam nov objekt tipa steklenica s kapaciteto " + k);
    }
    /**
     * Javna metoda za polnjenje steklenice
     * prišteje natočeno količino in doda vrsto vsebine
     * 
     * @param k količina vsebine
     * @param v vrsta vsebine
     * @return količina vsebine po polnjenju
     * @throws Exception vrže izjemo, če je steklenica zaprta
     */
    public int napolni(int k, String v) throws Exception {
        System.out.println("Steklenico polnim z " + v);
        System.out.println("Količina vsebine pred polnjenjem: " + kolicinaVsebine);
    if(jeOdprta){
        kolicinaVsebine = kolicinaVsebine + k;
        vrstaVsebine = vrstaVsebine + v;

        System.out.println("Količina vsebine po polnjenju: " + kolicinaVsebine);
    }
    else {
        throw new Exception("Steklenica je zaprta");
    }
            return kolicinaVsebine;

    }
    /**
     * Javna metoda za odpiranje steklenice
     * spremeni vrednost jeOdprta na true
     * @return true - odpiranje uspešno, false - odpiranje ni uspešno
     */
    public boolean odpri() {
        System.out.println("Odpiram steklenico ...");
        if(jeOdprta){
            return false;
        }
        else {
            jeOdprta = true;
            return true;
        }
    }
    /**
     * Javna metoda za zapiranje steklenice
     * spremeni vrednost jeOdprta na false
     * @return true- zapiranje uspešno, false - zapiranje ni uspešno
     */
    public boolean zapri() {
        System.out.println("Zapiram steklenico ...");
        if(!jeOdprta){
            return false;
        }
        else {
            jeOdprta = false;
            return true;
        }
    }
    /**
     * 
     * @return kolicinaVsebine
     */
    public int getKolicinaVsebine() {
        return kolicinaVsebine;
    }

}