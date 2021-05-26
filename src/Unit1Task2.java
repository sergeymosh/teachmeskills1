public class Unit1Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 2;

        if((a + b) < c || (a + c) < b || (c + b) < a){
            System.out.println("Такой треугольник не существет!");
        } else {
            System.out.println("Такой треугольник существует!");
        }

    }
}
