public class Unit1Task4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        if(a>0 && b<0 && c<0){
            System.out.println("Одно положительное число");
        } else if (a<0 && b>0 && c<0){
            System.out.println("Одно положительное число");
        } else if (a<0 && b<0 && c>0){
            System.out.println("Одно положительное число");
        } else if(a>0 && b>0 && c<0){
            System.out.println("Два положительных число");
        } else if(a>0 && b<0 && c>0){
            System.out.println("Два положительных число");
        } else if(a<0 && b>0 && c>0){
            System.out.println("Два положительных число");
        } else if (a>0 && b>0 && c>0) {
            System.out.println("Три положительных числа");
        } else if (a==0 && b==0 && c==0) {
            System.out.println("Все числа равны 0");
        } else {
            System.out.println("Положительных чисел нет!");
        }
    }
}
