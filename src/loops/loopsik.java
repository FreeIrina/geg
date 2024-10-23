package loops;

public class loopsik
{
    public static void main(String[] args) {
        int l = 1;
      while (l <=9)
        {
            System.out.println("этаж " + l);
            l++;
        }
         for (int i =1; i<=9;i++) {
             System.out.println("этаж " + i);
         }
         for (int k= 1; k<=100;k++){

            if (k==25){
                break;
            }
         if (k%2==0){
             continue;
             }
             System.out.println(k);
         }
    }

}
