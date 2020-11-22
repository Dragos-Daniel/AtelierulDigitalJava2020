package lab1;

public class Challenge2 {
    int nbr;

    Challenge2(int nr1) {
        nbr = nr1;
    }

    //compute() contine si compute2()
    String compute() {
        String s1 = "";
        if (nbr % 3 != 0 && nbr % 5 != 0 && nbr % 7 != 0) {
            s1 = s1 + (nbr);
        }
        if (nbr % 3 == 0)
            s1 = s1 + ("Foo");
        if (nbr % 5 == 0)
            s1 = s1 + ("Bar");
        if (nbr % 7 == 0)
            s1 = s1 + ("Qix");
        int a2 = 0;
        int aux = nbr;
        while (aux != 0) {
            a2 = a2 * 10 + aux % 10;
            aux = aux / 10;
        }

        while (a2 != 0) {
            int a = a2 % 10;
            if (a == 3)
                s1 = s1 + ("Foo");
            if (a == 5)
                s1 = s1 + ("Bar");
            if (a == 7)
                s1 = s1 + ("Qix");
            if (a == 0)
                s1 = s1 + a;
            a2 = a2 / 10;

        }
        s1 = s1.replace('0', '*');
        return s1;
    }
    // String compute2(){
    //     String s2="";
    //     s2=compute();
    //     s2=s2.replace('0','*');
    //     return s2;

    // }


    public static void main(String[] args) {
        Challenge2 x = new Challenge2(10101);
        String s1 = x.compute();
        System.out.print(s1);


    }
}
