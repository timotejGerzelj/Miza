import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
public class Miza extends JFrame implements ActionListener {
    private JPanel povrsina;
    private JButton dodajJButton;
    private JTextField znamkaPolje, alkoholPolje;
    private JTable tabela;
    private PivskaSteklenicaTableModel modelTabele;
    public static void main(String[] args) {
                Miza m = new Miza("Miza s pivskimi steklenicami");

    }
    public Miza(String n) {
        super(n);
        povrsina = new JPanel();
        povrsina.setToolTipText("Sem vnesete znamko piva");
        dodajJButton = new JButton("Dodaj steklenico");
        znamkaPolje = new JTextField(32);
        alkoholPolje = new JTextField(8);
        modelTabele = new PivskaSteklenicaTableModel();
        tabela = new JTable(modelTabele);
        getContentPane().add(povrsina);

        dodajJButton.addActionListener(this);

        JLabel label = new JLabel("Znamka");
        label.setFont(new Font("Ubuntu Mono", Font.BOLD, 12));
        povrsina.add(label);
        povrsina.add(znamkaPolje);
        JLabel label_1 = new JLabel("Stopnja alkohola");
        label_1.setFont(new Font("Ubuntu", Font.BOLD, 10));
        povrsina.add(label_1);
        povrsina.add(alkoholPolje);
        povrsina.add(dodajJButton);
        povrsina.add(tabela);
        setVisible(true);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Ustvarjam objekt Miza");
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("Dodajam steklenico...");
        System.out.println("Znamka je " + znamkaPolje.getText());
        System.out.println("Stopnja alkohola je " + alkoholPolje.getText());
        //double d = Double.parseDouble(alkoholPolje.getText());
        //PivskaSteklenica flasa = new PivskaSteklenica(znamkaPolje.getText(), 500, Double.parseDouble(alkoholPolje.getText()););
        modelTabele.addPivskaSteklenica(new PivskaSteklenica(znamkaPolje.getText(), 500, Double.parseDouble(alkoholPolje.getText())));

    }
}