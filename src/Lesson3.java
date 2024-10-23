import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("введи ловера");
            Scanner sc = new Scanner(System.in);
            String lover = sc.nextLine();
            if (lover.equalsIgnoreCase("exit") || lover.equalsIgnoreCase("выход")) {
                break;
            } else {
                array[i] = lover;
            }
        }
        System.out.println("все ловеры" + Arrays.toString(array));
    }
}
