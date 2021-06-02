import java.util.Random;

public class Unit3Task1 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.println(arr[i]);

            }

    }
}




