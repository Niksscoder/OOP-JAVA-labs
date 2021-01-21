import java.util.Random;

// create interface
interface Stale{
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}
// implements just
class Decydowanie implements Stale{
    Random rand = new Random();
    double p1 = 0.3, p2 = 0.3, p3 = 0.1, p4 = 0.15, p5 = 0.13;

    // metoda klasy decydowanie
    int Decyzja(){
        double proba = rand.nextDouble();
        if (proba < p1)               return NO;          // 30%
        else if (proba < p1+p2)       return YES; // 30%
        else if (proba < p1+p2+p3)    return MAYBE; //10%
        else if (proba < p1+p2+p3+p4) return LATER; // 15%
        else if (proba < 0.98)        return SOON;
        else                          return NEVER;
    }
}
class Drukowanie implements Stale{
    static void pisz(int result){ // przeczytac o static
//        System.out.println(result + " ");
        switch (result){
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }

    }
}
public class TestDecyzji {
    public static void main(String[] args) {
        Decydowanie d = new Decydowanie(); // potrzebuje miec metody, nie ma zadnych argumentow (konstruktor nie piszemy jezeli nie ma parametrow)
        int dd;
        for (int i = 0; i < 100; i++){
            dd = d.Decyzja();

            Drukowanie.pisz(dd);
        }
    }
}
