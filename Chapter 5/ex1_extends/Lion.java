public class Lion extends Animal {
    private void roar() {
        System.out.println("The "+getAge()+" year old lion says: Roar!");
    }

    public static void main(String[] args) {
        Lion l = new  Lion();
        l.setAge(5);
        l.roar();
    }
}