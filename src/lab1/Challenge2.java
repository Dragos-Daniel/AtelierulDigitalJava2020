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
        } else {
            if (nbr % 3 == 0)
                s1 = s1 + ("Foo");
            if (nbr % 5 == 0)
                s1 = s1 + ("Bar");
            if (nbr % 7 == 0)
                s1 = s1 + ("Qix");

            s1 = s1 + nbr;
            s1 = s1.replace("1", "");
            s1 = s1.replace("2", "");
            s1 = s1.replace("4", "");
            s1 = s1.replace("6", "");
            s1 = s1.replace("8", "");
            s1 = s1.replace("9", "");


        }


        s1 = s1.replace('0', '*');
        s1 = s1.replace("3", "Foo");
        s1 = s1.replace("5", "Bar");
        s1 = s1.replace("7", "Qix");
        return s1;
    }
    // String compute2(){
    //     String s2="";
    //     s2=compute();
    //     s2=s2.replace('0','*');
    //     return s2;

    // }


    public static void main(String[] args) {
        Challenge2 x = new Challenge2(101);
        String s1 = x.compute();
        System.out.println(s1);


    }
}
