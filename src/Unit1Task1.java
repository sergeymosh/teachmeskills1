public class Unit1Task1 {
    public static void main(String[] args) {
        int a = -8991;

        if(a < 10 && a > -10){
            System.out.println("В этом числе 1 цифра");
        } else if (a < 100 && a > -100){
            System.out.println("В этом числе 2 цифры");
        } else if (a < 1000 && a > -1000){
            System.out.println("В этом числе 3 цифры");
        } else if (a < 10000 && a > -10000){
            System.out.println("В этом числе 4 цифры");
        }


        if(a>0){
            System.out.println("Это положительное число");
        }
        else {
            System.out.println("Это отрицательное число");
        }
    }
}
