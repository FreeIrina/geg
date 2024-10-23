import java.util.Scanner;

public class geg
{
    public static void main(String[] args) {
        Scanner cv = new Scanner(System.in);
        System.out.println("введите время");
        int time = cv.nextInt();

        if (time >= 24){
            System.out.println("время введено неверно");
        }
        else if (time == 23){
            System.out.println("доброй ночки");
        }
        else if (time >= 18){
            System.out.println("добрейший вечерочек");
        }
        else if (time >= 12){
            System.out.println("доброго денёчка");
        }
        else if (time >= 4){
            System.out.println("доброе утречко");
        }
        else if (time >= 0){
            System.out.println("доброй ночи");
        }
        else if (time < 0){
            System.out.println("время введено неверно");
        }

    }
}
