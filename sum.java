import java.util.Arrays;
import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];

      
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) {
            numbers[i] = sc.nextInt();
        }
        int sum[] = sum(numbers);
        System.out.println("Cumulative sum = " + Arrays.toString(sum));
        sc.close();
    }

    
    public static int[] sum(int[] numbers) {
        int sum = 0;

    
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; 
            numbers[i] = sum; 
        }

        return numbers;
        }
}