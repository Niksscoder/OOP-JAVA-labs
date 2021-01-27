



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Paint extends JFrame implements MouseListener {
    int count = 0;
    int tabX[] = new int[100];
    int tabY[] = new int[100];


    // create construktor
    public Paint() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);// size of the window
        addMouseListener(this); // for clicks
        setVisible(true); // for true
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Paint();
            }
        });
    }
    public void paint(Graphics g){
        for (int i=0; i<count;i++){
            g.fillOval(tabX[i] - 10, tabY[i] - 10, 20, 20);
        }
        System.out.println(count);
    }

    public void mouseClicked(MouseEvent evt) {
        int x = evt.getX();
        int y = evt.getY();
        tabX[count] = x;
        tabY[count] = y;
        count++;
        repaint();
    }
    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseReleased(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){}

}