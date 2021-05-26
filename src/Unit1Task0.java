public class Unit1Task0 {
    public static void main(String[] args){
       int a = 8;
       int b = 15;
       //Арифметические
        System.out.println("Арифметические операции: ");
        System.out.println("Сложение: " + (a + b));
        System.out.println("Сложение с присвоением: " + (a+=b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Вычитание с присвоение: " + (a-=b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Умножение с присвоением: " + (a *=b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Деление с присвоением: " + (a/=b));
        System.out.println("Остаток от деления: " + (a % b));
        System.out.println("Остаток от деления с присвоенеим: " + (a %= b));
        System.out.println("Инкремент A: " + ++a);
        System.out.println("Декремент B: " + --b);

        //Битовые
        System.out.println();
        System.out.println("Битовые операции: ");
        System.out.println("ИЛИ: " + (a | b));
        System.out.println("ИЛИ с присваиванием: " + (a |= b));
        System.out.println("И: " + (a & b));
        System.out.println("И с присвлением: " + (a &= b));
        System.out.println("Исключающие ИЛИ: " + (a ^ b));
        System.out.println("Исключающие ИЛИ с присваиванием: " + (a ^= b));
        System.out.println("унарное отрицание A: " + ~a);
        System.out.println("Сдвиг вправо: " + (a>>b));
        System.out.println("Сдвиг вправо с присовоением: " + (a>>=b));
        System.out.println("Сдвиг вправо с появлением нулей: " + (a>>>b));
        System.out.println("Сдвиг вправо с появлением нулей с присвоением: " + (a>>>=b));
        System.out.println("Сдвиг влево: " + (a<<b));
        System.out.println("Сдвиг влево с присвоением: " + (a<<=b));

        //Операторы сравнения
     System.out.println();
     System.out.println("Операторы сравнения: ");
     System.out.println("Меньше: " + (a < b));
     System.out.println("Меньше либо равно: " + (a <= b));
     System.out.println("Равно: " + (a == b));
     System.out.println("Больше: " + (a > b));
     System.out.println("Больше либо равно: " + (a >= b));
     System.out.println("Не равно: " + (a != b));




    }
}
