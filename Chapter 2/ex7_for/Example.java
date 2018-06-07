public class Example {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nSecond example");
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}