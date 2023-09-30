package frequencyCount;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountArrayFrequencys {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 2, 4};

        // Count the frequency of each element using Stream and Collectors
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the elements with their frequencies
        System.out.println("Frequency of elements in the array:");
        frequencyMap.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " - Frequency: " + entry.getValue()));
    }
}

