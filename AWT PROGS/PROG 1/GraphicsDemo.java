import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo extends Frame{
    
    public GraphicsDemo(){
        addWindowListener(new WindowAdapter(){
            public void windowClsoing(WindowEvent we){
                System.exit(0);
            }
        });
    }



    public void paint(Graphics g) {
        g.drawLine(20,40,100,90);
        g.drawLine(20,90,100,40);
        g.drawLine(40,45,250,80);    
    
        g.drawRect(20,150,60,50);
        g.fillRect(110,150,60,50);
        g.drawRoundRect(200,150,60,50,15,15);
        g.fillRoundRect(290,150,60,50,30,40);

        g.drawOval(20,250,50,50);
        g.fillOval(100,250,75,50);
        g.drawOval(200,260,100,40);

        g.drawArc(20,350,70,70,0,180);
        g.fillArc(70,350,70,70,0,75);

        int xpoints[] = {20,200,20,200,20};
        int ypoints[] = {450,450,650,650,450};
        int num=5;

        g.drawPolygon(xpoints, ypoints, num);
        }

        public static void main(String[] args){
            GraphicsDemo appwin = new GraphicsDemo();

            appwin.setSize(new Dimension(370, 700));
            appwin.setTitle("GraphicsDemo");
            appwin.setVisible(true);
        }
    }