import java.util.Scanner;

public class Unit1Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите 2 числа:");


        if (sc.hasNextInt() && sc2.hasNextInt()) {
            int number1 = sc.nextInt();
            System.out.println("Первое число " + number1);
            int number2 = sc2.nextInt();
            System.out.println("Второе число " + number2);
            if(number1>number2){
                System.out.println(number1 + " больше чем " + number2);
            } else if(number1<number2){
                System.out.println(number2 + " больше чем" + number1);
            }


        } else {
            System.out.println("Введите числа!");
        }
    }
}
