import java.awt.*;
import java.awt.event.*;
class MyDialog extends  Dialog implements ActionListener{
    Prog1 p;
    MyDialog(Frame parent, String title){
        super(parent, title, false);
        setLayout(new FlowLayout());
        setSize(300,150);
        p = (Prog1)parent;
        Button b = new Button("OK");
        Label l = new Label("Error: " + p.error);
        add(l);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        dispose();
    }
}


public class Prog1 extends Frame implements ActionListener{
    TextField Num1, Num2;
    Button divide = new Button("Divide");
    float res = 0;
    public String error = "";
    public Prog1(){
        setLayout(new FlowLayout());
        Num1 = new TextField(1);
        Num2 = new TextField(1);
        Label Num1L = new Label("Num1: ", Label.RIGHT);
        Label Num2L = new Label("Num2: ", Label.RIGHT);
        add(Num1L);
        add(Num1);
        add(Num2L);
        add(Num2);
        add(divide);
        divide.addActionListener(this);
        addWindowListener(new WinAdapter());
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == divide){
            try{
                int n1 = Integer.parseInt(Num1.getText());
                int n2 = Integer.parseInt(Num2.getText());
                if(n2 <= 0){
                    throw new ArithmeticException("Error");
                }
                res = (float)n1/n2;
                repaint();
            }catch(NumberFormatException exception){
                System.out.println(exception);
                res = 0;
                error = "Entered no. is not an integer.";
                repaint();
            }catch(ArithmeticException exception){
                System.out.println(exception);
                res = 0;
                error = "You tried to divide by zero.";
                repaint();
            }
            if(res == 0){
                System.out.println(this.error);
                MyDialog d = new MyDialog(this, "Error");
                d.setVisible(true);
            }
        }
    }

    public void paint(Graphics g){
        g.drawString("Result: " + String.valueOf(res), 20, 100);
    }

    public static void main(String[] args) {
        Prog1 p = new Prog1();
        p.setSize(new Dimension(400,400));
        p.setTitle("Divide");
        p.setVisible(true);
    }
}

class WinAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}