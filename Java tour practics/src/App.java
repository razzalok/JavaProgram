import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        String messege = scanner.nextLine();
        System.out.println("Here is message " + messege);
        int num = scanner.nextInt();
        System.out.println(num);
        boolean isValid = scanner.nextBoolean();
        System.out.println(isValid);
        double rate = scanner.nextDouble();
        System.out.println(rate);

    }
}
