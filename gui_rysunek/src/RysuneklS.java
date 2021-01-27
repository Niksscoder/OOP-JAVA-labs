import javax.swing.*;
import java.awt.*;

public class RysuneklS extends JFrame{
// create konstruktor klasy
    public RysuneklS(){
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(800, 500);
       setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // ?
            public void run() {
                new RysuneklS();
            }
        });

    }
public void paint(Graphics g){

        int tabX[] = {30, 40, 60, 40, 30 ,20, 0, 20, 30};
        int tabY[] = {220, 240, 250, 260, 280, 260, 250, 240, 220};

        Color color1 = Color.red;
        for (int i=0; i<30;i++){

            g.setColor(color1); // ustalenie coloru
            color1 = new Color(color1.getRed() - 8, color1.getGreen(), color1.getBlue());
            g.drawLine(235+i*3, 40, 325-i*3, 200);

            g.setColor(Color.green);
            g.drawOval(60+i*2, 100-i*2, 150-i*4, 150-i*4);

            g.setColor(Color.blue);
            g.drawOval(360 + i * 2, 100-i*2, 150-i*4, 150-i*4);
        }

        boolean flaga = false;
        Color color2 = Color.green;
        Color color3 = Color.blue;

        for (int i=0; i<10; i++){
            int tempTabX[] = new int [9];

            for(int j=0; j<9;j++) {
                tempTabX[j] = tabX[j] + i * 60;
            }
            Polygon p = new Polygon(tempTabX, tabY, 9);
            g.setColor(color3);
            // zmieniamy color
            color3 = new Color(color3.getRed() + 25, color3.getGreen(), color3.getBlue()-25);


            if (flaga){
                g.drawPolygon(p);
            }else {
                g.fillPolygon(p);
            }
                flaga =! flaga;


        }


}

}
