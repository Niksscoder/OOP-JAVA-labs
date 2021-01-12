/*
Learning Algorithms and Data structures. This is example uses Stack.
Stack is a linear data structure which follows a particular order in which the operations are performed.
The order may be LIFO(Last In First Out) or FILO(First In Last Out)

In this example I've created algorithms(Stack) with methods: zeStosu() and naStos() (static and dynamic)
*
*
*
*/


interface IntStos{
    // method
    void naStos(int element);
    //zwracanie liczb calkowitych
    int zeStosu();
}

// stos static(statyczny) - o okreslonej wielkosci
class StosST implements IntStos{
    // create a table
    private int stos[]; // stos
    private int pozycja;// wymiar stosu

    StosST(int ile) {
        stos = new int[ile];
        pozycja = -1; // ustawiamy pozycje
    }

    public void naStos(int element){
        // czy mozemy cos dolozyc
        if (pozycja == stos.length-1){
            System.out.println("Stos jest pelny !");
        }else{
            stos[++pozycja] = element;
        }
    }

    // method 2
    public int zeStosu(){
        // czy nasza pozycja jest mniejsza od zera ?
        if(pozycja < 0){
            System.out.println("Stos nie zawiera zadnych elementow !");
            return 0;
        }
        else{
            return stos[pozycja--];
        }
    }

}
// dynamiczny stos
class StosDy implements IntStos{
    private int stos[];
    private int poz;

    // konstruktor
    StosDy(int ile){
        stos = new int[ile];
        poz = -1;
    }
    StosDy(){
        stos = new int[8];
        poz = -1;
    }
    public void naStos(int element){
        if (poz == stos.length-1){
            // musi roznac stos
            // tworzymy tablice
            int temp[] = new int[stos.length*2];
            //kopiowanie starej tablicy do nowej
            for (int i = 0; i < stos.length; i++){
                temp[i]=stos[i];
                stos = temp;
                stos[++poz] = element;
            }
        }else{
            stos[++poz] = element;
        }
    }

    public int zeStosu(){
        // czy nasza pozycja jest mniejsza od zera ?
        if(poz < 0){
            System.out.println("Stos nie zawiera zadnych elementow !");
            return 0;
        }
        else{
            return stos[poz--];
        }
    }
}

public class TestStosu {
    public static void main(String[] args) {
        // create objects
        StosST myStos1 = new StosST(5); // 5 elementow w stosie
        for (int i = 0; i < 5; i++) myStos1.naStos(i);
        System.out.println("Stos w myStos1 : ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStos1.zeStosu());

        StosDy myStos2 = new StosDy();
        for (int i = 0; i < 6; i++) myStos2.naStos(i);

        System.out.println("Stos w myStos2 : ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStos2.zeStosu());

    }
}
