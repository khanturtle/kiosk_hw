package MenuAndFood;

public class Food extends Menu{

    int price;

    public Food(String name, String description, int price) {
        super(name, description);
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\t | W " + price + " | " + description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
