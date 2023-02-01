import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("give a number: ");
            num = reader.nextInt();
            if (num == 4) {
                System.out.println("Great!");
                break;
            }
        }

    }
}
