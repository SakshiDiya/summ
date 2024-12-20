import java.util.Scanner;

public class summ{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the first number:");
        int num2 = sc.nextInt();

        System.out.println("Enter the first number:");
        int num3 = sc.nextInt();

        int largest = Math.max(num1 , Math.max(num2, num3));

        int sum =0;
        int number = largest;

        if(number > 0){
            int num = number % 10;
            sum = sum + num ;
            number = number /10;
        }
        System.out.println("The largest number is :" + sum);

        sc.close();
    }

}