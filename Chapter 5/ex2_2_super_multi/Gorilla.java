public class Gorilla extends Animal {
    public Gorilla(int age) {
      super(age,"Gorilla");
    }
    public Gorilla() {
      super(5);
    }
    public static void main(String[] args) {
        new Gorilla();
        new Gorilla(10);
    }
}