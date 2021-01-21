import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class SzalonyUIS {
    public static void main(String[] args) throws IOException{

            FileReader fin = new FileReader("IMIONA.IN");
            Scanner src = new Scanner(fin);

            TreeSet <String> LI = new TreeSet<String>();

            String imie;
            while(src.hasNext()){
                imie = src.next();
                imie = imie.replace("-", ""); // usuniecie minusow
                imie = imie.toLowerCase();
                LI.add(imie);
            }
            for (String im: LI) System.out.println(im);
        }
    }

