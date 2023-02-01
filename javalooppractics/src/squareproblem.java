import java.util.Scanner;

public class squareproblem {
    public static void main(String[] args) {
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = reader.nextInt();
        num = Math.abs(num);
        System.out.println("Square of " + num + " is " + (num * num));
    }
}
