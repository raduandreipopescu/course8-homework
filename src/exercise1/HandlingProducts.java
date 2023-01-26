package exercise1;

public class HandlingProducts {
    public static void main(String[] args) {
        Cosmetics handCream = new Cosmetics(15, "Avon", "Soft hand cream", 50, "White", 0.1);
        System.out.printf("The hand cream is made by %s and is a %s.\n" +
                        "We have %d in stock and it costs %d lei.\n" +
                        "Just have in mind that it is %s and weights %s grams.\n",
                handCream.getName(), handCream.getDescription(),
                handCream.getQuantity(), handCream.getPrice(),
                handCream.getColor(), (handCream.getWeight() * 1000));

        Electronics tv = new Electronics(2500, "Samsung", "Smart TV", 5, "100 inch TV", 100, 5, 50, 7);
        System.out.printf("\nCheck out this new %s from %s, for only %d lei.\n" +
                        "We only have %d in stock of this %s.\n" +
                        "It's lightweight (only %d kg) and dimensions are: %d cm x %d cm x %d cm.\n",
                tv.getDescription(), tv.getName(), tv.getPrice(),
                tv.getQuantity(), tv.getType(),
                tv.getWeight(), tv.getLength(), tv.getWidth(), tv.getHeight());

        Fridge fridge = new Fridge(999, "Electrolux", "Small fridge", 5, "One door", 60, 60, 150, 40, 4);
        System.out.printf("\nIf you need a new fridge, we have %d in stock from %s for only %d lei.\n" +
                        "It's a %s with just %s, but gets your beer to %d degrees Celsius.\n" +
                        "You will need a friend to carry the %d kg and dimensions are: %d cm x %d cm x %d cm.\n",
                fridge.getQuantity(), fridge.getName(), fridge.getPrice(),
                fridge.getDescription(), fridge.getType(), fridge.getTemperature(),
                fridge.getWeight(), fridge.getLength(), fridge.getWidth(), fridge.getHeight());
    }
}
