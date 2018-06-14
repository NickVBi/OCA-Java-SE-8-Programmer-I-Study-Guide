public class Bear implements Herbivore, Omnivore {
    public int eatPlants(int quantity) {
        System.out.println("Eating plants: "+quantity);
        return quantity;
    }
    public void eatPlants() {
        System.out.println("Eating plants");
    }
    public static void main(String[] args) {
        new Bear().eatPlants(8);
        new Bear().eatPlants();
    }
}