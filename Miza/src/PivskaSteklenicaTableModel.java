import javax.swing.table.*;


public class PivskaSteklenicaTableModel extends DefaultTableModel {
    public PivskaSteklenicaTableModel() {
        super();
        addColumn("Znamka");
        addColumn("Stopnja alkohola");
        Object[] vrstica = new Object[] {"Znamka test", "Stopnja test"};
        addRow(vrstica);
    }



    public void addPivskaSteklenica(PivskaSteklenica ps) {
        Object[] vrstica = new Object[] {ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};
        addRow(vrstica);

    }
}