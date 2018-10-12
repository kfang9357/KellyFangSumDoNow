package KellyFang;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number you want to find the sum up to?");
        int sum = 0;
        int num = input.nextInt();
        for (int i = 0; i<num+1; i++)
        {
            sum = sum +i;
        }
        System.out.println("The sum of all numbers up to "+num+" is "+sum);
    }
}
