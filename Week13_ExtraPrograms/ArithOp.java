import java.awt.*;
import java.awt.event.*;

public class ArithOp extends Frame implements ActionListener {
    TextField f1, f2, f3, f4;
    Label lf1, lf2, lf3, lf4;
    Button b;

    public ArithOp() {
        setLayout(new FlowLayout());
        Label lf1 = new Label("FIELD 1", Label.RIGHT);
        Label lf2 = new Label("FIELD 2", Label.RIGHT);
        Label lf3 = new Label("OPERATION", Label.RIGHT);
        Label lf4 = new Label("RESULT", Label.RIGHT);
        f1 = new TextField(12);
        f2 = new TextField(12);
        f3 = new TextField(12);
        f4 = new TextField(12);
        b = new Button("PERFORM");
        add(lf1);
        add(f1);
        add(lf2);
        add(f2);
        add(lf3);
        add(f3);
        add(b);
        add(lf4);
        add(f4);
        
        b.addActionListener(this);
        addWindowListener(new WindowAdapter1());

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {

            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int num3 = 0;
            String op = f3.getText();
            switch(op){
                case "+": num3 = num1+num2;
                break;

                case "-": num3 = num1-num2;
                break;

                case "*": num3 = num1 * num2;
                break;

                case "/": num3 = num1 / num2;
            }
            f4.setText(String.valueOf(num3));

        }
    }

    public static void main(String args[]) {
        ArithOp cp = new ArithOp();
        cp.setSize(new Dimension(400, 400));
        cp.setTitle("PERFORM");
        cp.setVisible(true);
    }

    class WindowAdapter1 extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}
