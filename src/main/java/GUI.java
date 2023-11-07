import javax.swing.*;

public class GUI extends JFrame{
    private JPanel panelMain;
    private JTable matrixInput;


    public GUI(String title) {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panelMain);
        this.pack();
        this.setSize(800, 500);
        this.setVisible(true);
        matrixInput = new JTable(5, 5);



    }

}
