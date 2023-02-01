import java.util.Scanner;

public class findingNumberInArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] num = new int[5];
        int i = 0;
        System.out.println(num.length);
        while (i < num.length) {
            System.out.print("Give a number : ");
            num[i] = reader.nextInt();
            i++;
        }
        System.out.print("Search for ? ");
        int n = reader.nextInt();
        i = 0;
        while (i < num.length) {
            if (num[i] == n || i == num.length - 1) {
                break;
            }
            i++;
        }
        if (num[i] == n) {
            System.out.println(n + " is at index " + i + 1);
        } else
            System.out.println(n + " Not found");
    }
}
