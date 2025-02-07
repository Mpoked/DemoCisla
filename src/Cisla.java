import javax.swing.*;
import java.util.Random;

public class Cisla extends JFrame{
    private JTextField txField;
    private JTextArea txArea;
    private JButton btAdd;
    private JPanel pnMain;
    private JButton btRandom;

    public Cisla(){
        this.initComponents();
    }

    public void initComponents(){
        setContentPane(pnMain);
        setTitle("Random čísla");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        btAdd.addActionListener(e -> addText());
        btRandom.addActionListener(e -> randomNumber());

    }

    public void addText(){
        String text = txField.getText();
        txField.setText("");
        txArea.append(text + "\n");
    }

    public void randomNumber(){
        Random generator = new Random();
        int nahodne = generator.nextInt(1, 100);
        txField.setText(String.valueOf(nahodne));
    }
}
