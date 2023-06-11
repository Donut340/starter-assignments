import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {
        // Create an array with 20 positions and generate random values between 1 and 6
        int[] array1 = new int[20];
        Random random = new Random();
        int countOnes = 0;

        for (int i = 0; i < array1.length; i++) {
            // Generate a random value between 1 and 6
            int randomValue = random.nextInt(6) + 1;
            array1[i] = randomValue;

            // Count the number of 1's generated in the array
            if (randomValue == 1) {
                countOnes++;
            }
        }

        // Print the array and the count of 1's
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Count of 1's: " + countOnes);

        // Create another array with 10 positions and generate random values between 1 and 100
        int[] array2 = new int[10];
        double sum = 0;

        for (int i = 0; i < array2.length; i++) {
            // Generate a random value between 1 and 100
            int randomValue = random.nextInt(100) + 1;
            array2[i] = randomValue;

            // Calculate the sum of all values in the array
            sum += randomValue;
        }

        // Calculate the average of the values in the array
        double average = sum / array2.length;

        // Print the array and the average
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Average: " + average);

        // Swap two different index positions in the array
        int index1 = random.nextInt(array2.length);
        int index2 = random.nextInt(array2.length);

        // Ensure that the two index positions are different
        while (index2 == index1) {
            index2 = random.nextInt(array2.length);
        }

        // Swap the values at the two index positions
        int temp = array2[index1];
        array2[index1] = array2[index2];
        array2[index2] = temp;

        // Print the array after swapping
        System.out.println("Array 2 after swapping: " + Arrays.toString(array2));

        // Reverse the order of the array
        for (int i = 0; i < array2.length / 2; i++) {
            // Swap the values at symmetric positions from the start and end of the array
            int tempValue = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = tempValue;
        }

        // Print the array after reversing
        System.out.println("Array 2 after reversing: " + Arrays.toString(array2));
    }
}
