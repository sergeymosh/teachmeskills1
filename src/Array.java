import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int max = 0;
        int min = 0;
        for(int i = 0; i<9; i++){
            Random random = new Random();
            arr[i] = random.nextInt(10);
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            System.out.println(arr[i]);
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " +max);
    }
}
