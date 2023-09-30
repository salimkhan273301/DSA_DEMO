package String_demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReversal {
    public static String reverseStringUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

  

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    
    public static String reverseStringUsingCharArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static String reverseStringUsingRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
        }
    }

    
    public static String reverseStringUsingStringBuilderStream(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    public static String reverseStringUsingStreamAPI(String str) {
        return Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining());
    }

    public static String reverseStringUsingCollections(String str) {
        List<String> characters = Arrays.asList(str.split(""));
        Collections.reverse(characters);
        return String.join("", characters);
    }

    public static void main(String[] args) {
        String original = "Hello, World!";

        System.out.println("Original String: " + original);
        System.out.println("Reversed String Using Stack: " + reverseString(original));
        System.out.println("Reversed String using StringBuilder: " + reverseStringUsingStringBuilder(original));
        System.out.println("Reversed String using char array: " + reverseStringUsingCharArray(original));
        System.out.println("Reversed String using recursion: " + reverseStringUsingRecursion(original));
        System.out.println("Reversed String using StringBuilder and Stream: " + reverseStringUsingStringBuilderStream(original));
        System.out.println("Reversed String using Stream API: " + reverseStringUsingStreamAPI(original));
        System.out.println("Reversed String using Collections: " + reverseStringUsingCollections(original));
    }
}

