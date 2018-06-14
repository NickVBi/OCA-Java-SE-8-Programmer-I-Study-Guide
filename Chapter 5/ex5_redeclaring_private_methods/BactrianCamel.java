public class BactrianCamel extends Camel {
    private int getNumberOfHumps() {
        return 2;
    }
    public static void main(String[] args) {
        System.out.println(
            new BactrianCamel().getNumberOfHumps()
        );
    }
}