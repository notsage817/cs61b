public class Dessert {
    private int flavor;
    private int price;
    private static int numDessert = 0;

    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDessert++;
    }

    public void printDessert() {
        System.out.println(flavor + " " + price + " " + numDessert);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
