import java.util.Arrays;     // import just Arrays

public class ArraySample {
    public static void main(String[] args) {
        int[] numbers1 = new int[3]; // initial empty array
        int[] numbers2 = {42, 55, 99}; // initial not empty array

        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));     // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
        System.out.println(java.util.Arrays.toString(bugs));
    
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);           // 3
        System.out.println(mammals[0]);               // monkey
        System.out.println(mammals[1]);               // chimp
        System.out.println(mammals[2]);               // donkey
    
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;

        numbers = new int[]{ 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] +  " ");
        System.out.println();

        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
        System.out.println();

        numbers = new int[] {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
    }
}