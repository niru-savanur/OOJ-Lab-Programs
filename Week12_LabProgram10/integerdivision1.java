import java.awt.*;
import java.awt.event.*;

class dia extends Dialog implements ActionListener {
    integerdivision1 id;

    dia(Frame parent, String title) {
        super(parent, title, false);
        id = (integerdivision1) parent;
        setLayout(new FlowLayout());
        setSize(300, 200);
        add(new Label(id.msg));
        Button b;
        add(b = new Button("OK"));
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        dispose();
    }
}

public class integerdivision1 extends Frame implements ActionListener {
    String msg = "";
    TextField n1, n2, res;
    Label ln1, ln2, lres;
    Button b;

    public integerdivision1() {
        setLayout(new FlowLayout());
        Label ln1 = new Label("NUMBER 1", Label.RIGHT);
        Label ln2 = new Label("NUMBER 2", Label.RIGHT);
        Label lres = new Label("RESULT", Label.RIGHT);
        n1 = new TextField(12);
        n2 = new TextField(8);
        res = new TextField(10);
        b = new Button("DIVIDE");
        add(ln1);
        add(n1);
        add(ln2);
        add(n2);
        add(b);
        add(lres);
        add(res);
        b.addActionListener(this);
        addWindowListener(new WindowAdapter1());
    }

public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b)
    {
        try{
        int num1=Integer.parseInt(n1.getText());
        int num2=Integer.parseInt(n2.getText());
        int num3=num1/num2;
        res.setText(String.valueOf(num3));
    }catch(NumberFormatException ne ){
       
       msg="NUMBERFORMAT EXCEPTION";
       dia d=new dia(this,"EXCEPTION");
       d.setVisible(true);
      
    }
    catch(ArithmeticException a){
      
        msg="ARITHMETIC EXCEPTION";
        dia d=new dia(this,"EXCEPTION");
        d.setVisible(true);
        
    }
}
}

   
    public static void main(String args[]) {
        integerdivision1 i = new integerdivision1();
        i.setSize(new Dimension(300, 300));
        i.setTitle("INTEGER DIVISION OF TWO NUMBERS");
        i.setVisible(true);
    }

    class WindowAdapter1 extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}
