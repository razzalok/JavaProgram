import java.util.Scanner;

public class SumOfArray {
    public static int arraySum(int[] numList) {
        int i = 0, sum = 0;
        while (i < numList.length) {
            sum += numList[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numList = new int[6];
        Scanner reader = new Scanner(System.in);
        int i = 0;
        while (i < numList.length) {
            numList[i] = reader.nextInt();
            i++;
        }
        System.out.println("Sum of the given numbers : " + arraySum(numList));
    }
}
