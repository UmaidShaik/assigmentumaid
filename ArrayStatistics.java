package assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayStatistics {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide integer values as command line arguments.");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input format. Please provide only integer values.");
                return;
            }
        }

        // Calculating the statistics
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = (double) sum / numbers.length;

        // Finding the median
        Arrays.sort(numbers);
        double median;
        if (numbers.length % 2 == 0) {
            int mid = numbers.length / 2;
            median = (double) (numbers[mid - 1] + numbers[mid]) / 2;
        } else {
            int mid = numbers.length / 2;
            median = numbers[mid];
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Displaying results
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Median: " + median);
        System.out.println("Frequency of each number:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
