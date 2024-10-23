import java.util.Scanner;

public class poop {
    public static void main(String[] args) {
        int number = (int) (Math.random()*100)+ 1;
        System.out.println("предположи,бро");
        for (int i = 1; i <= 1; i++){
            Scanner sc = new Scanner(System.in);
            int chislo = sc.nextInt();
            if (chislo > number){
                System.out.println("ти глупий,у меня меньше...");
            } else if (chislo < number){
                System.out.println("эм, у меня больше...");
            } else {
                System.out.println("о да, кажется, ты догадливое бревно");
                break;
            }
            if (i==1) {
                System.out.println("ты идиотинка. моё численько было " + number);
            }
        }

    }
}
