import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener,MouseMotionListener{
    String msg="";
    int mouseX=0,mouseY=0;
    
    public MouseEvents(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent me){
        msg=msg+"--Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg="Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent me){
        mouseX=100;
        mouseY=100;
        msg="Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Down";
        repaint();
    }

    public void mouseReleased(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Up";
        repaint();
    }

    public void mouseDragged(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Dragging mouse at "+mouseX+" , "+mouseY;
        //showStatus("Dragging mouse at "+mouseX+" , "+mouseY);
        repaint();
    }

    public void mouseMoved(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Moving mouse at "+mouseX+" , "+mouseY;
        //showStatus("Moving mouse at "+mouseX+" , "+mouseY);
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg,mouseX,mouseY);
    }

    public static void main(String args[]){
        MouseEvents obj=new MouseEvents();
        obj.setSize(new Dimension(300,300));
        obj.setTitle("Mouse Events demo");
        obj.setVisible(true);;
    }
}