package lesson1;

public class First {
    public static void main(String[] args) {
        int a,b, FixPrice;
        char с = 'c';
        String abc = "popka slona";
        a=4;
        b=4;
        FixPrice=8;
        System.out.println(abc);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a+FixPrice);
        System.out.println(a-FixPrice);
        System.out.println(a*FixPrice);
        System.out.println(a/FixPrice);


        int fareng = 182;
        double cel = 0;
        cel = (fareng - 32) / 1.8;
        System.out.println(cel);

        int status = 1;
        if (status == 0)
        {
            System.out.println("programma zakryta");

        }
        if (status == 1)
            System.out.println("programma otkryta");

        int mounth = 9;
        if (mounth == 12 || mounth == 1 || mounth == 2)
        {
            System.out.println("зима");
        }
        if (mounth == 3 || mounth == 4 || mounth == 5)
        {
            System.out.println("весна");
        }
        if (mounth == 6 || mounth == 7|| mounth == 8)
        {
            System.out.println("лето");
        }
        if (mounth == 9 || mounth == 10 || mounth == 11)
        {
            System.out.println("осень");
        }


    }
}
