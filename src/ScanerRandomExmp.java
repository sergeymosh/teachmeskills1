import java.util.Random;
import java.util.Scanner;

public class ScanerRandomExmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество случайных чисел: ");
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){
            Random random = new Random();
            System.out.println(random.nextInt(50));
        }




    }
}
