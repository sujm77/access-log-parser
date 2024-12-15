import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int number2 = new Scanner(System.in).nextInt();
        int sum = number1+number2;
        System.out.println("Сумма чисел : "+sum);
        int dif = number1-number2;
        System.out.println("Разность чисел : "+ dif);
        int comp = number1*number2;
        System.out.println("Произведение чисел : "+comp);
        double quotient = (double) number1/number2;
        System.out.println("Частное чисел : "+quotient);
    }
}
