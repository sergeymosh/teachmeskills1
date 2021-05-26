public class Unit1Task5 {
            public static void main(String[] args) {
                int a = 1;
                int b = -2;
                int c = -7;
                if(a>0 && b<0 && c<0){
                    System.out.println("Одно положительное число и два отрицательных");
                } else if (a<0 && b>0 && c<0){
                    System.out.println("Одно положительное число и два отрицательных");
                } else if (a<0 && b<0 && c>0){
                    System.out.println("Одно положительное число и два отрицательных");
                } else if(a>0 && b>0 && c<0){
                    System.out.println("Два положительных числа и одно отрицательное");
                } else if(a>0 && b<0 && c>0){
                    System.out.println("Два положительных числа и одно отрицательное");
                } else if(a<0 && b>0 && c>0){
                    System.out.println("Два положительных числа и одно отрицательное");
                } else if (a>0 && b>0 && c>0) {
                    System.out.println("Три положительных числа");
                } else if (a==0 && b==0 && c==0) {
                    System.out.println("Все числа равны 0");
                } else {
                    System.out.println("Три числа отрицательные");
                }
            }
}

