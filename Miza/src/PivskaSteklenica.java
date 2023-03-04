public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
    private String znamka;
    private boolean jePovratna;
    private double temperatura;
    private double stopnjaAlkohola;
    public PivskaSteklenica(String z, int k, double s) {
        super(k);
        odpri();
        try {
            napolni(k, "Pivo");
        }
        catch(Exception e) {
            System.out.println("Napaka pri uvodnem polnjenju nove steklenice: " + e);
        }
        zapri();
        znamka = z;
        jePovratna = false;
        temperatura = 22.0;
        stopnjaAlkohola = s;
    }
    public void ohladi(double t){
        System.out.println("Hladimo pivo " + znamka + " iz " + temperatura + " na " );
        temperatura = temperatura - t;
        System.out.println(temperatura + " st. C" );
        

    }
    public String getZnamkaKolicina(){
        return znamka + ", " + getKolicinaVsebine() + " ml";
    }

    public double getStopnjaAlkohola() {
        return stopnjaAlkohola;
    }



}