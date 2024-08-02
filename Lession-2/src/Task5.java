import java.util.Scanner;

public class Task5 {
    public static void checkSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Задание 5. Введите числа а и b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        boolean c = a+b >=10 & a+b <= 20 ? true:false;
        System.out.println(c);

    }
}
