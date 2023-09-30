package frequencyCount;



	import java.util.HashMap;
	import java.util.Map;

	public class CountArrayFrequency {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 2, 4, 1, 5, 2, 4};

	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Count the frequency of each element in the array
	        for (int element : array) {
	            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
	        }

	        // Print the elements with their frequencies
	        System.out.println("Frequency of elements in the array:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + " - Frequency: " + entry.getValue());
	        }
	    }
	}


