import java.util.Scanner;

public class Loopspractics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 0;
        while (true) {
        System.out.println("Give a number: ");
        num = reader.nextInt();
        if (num == 4) {
        break;
            }
        }
    }
}