import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int num;
        while (true) {
            System.out.print("Give a number : ");
            num = reader.nextInt();
            if (num < 0) {
                break;
            }
            numList.add(num);
        }
        System.out.print("Enter Initial Index : ");
        int initIndex = reader.nextInt();
        System.out.print("Enter Last Index : ");
        int lastIndex = reader.nextInt();
        for (int i = initIndex - 1; i < lastIndex; i++) {
            System.out.print(numList.get(i) + " ");
        }

    }
}
