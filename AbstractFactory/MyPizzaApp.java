public class MyPizzaApp {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: MyPizzaApp <franchise> <pizzaKind>");
            return;
        }

        String franchise = args[0];
        String pizzaKind = args[1];
        PizzaStore pizzaStore = null;

        // Determine which franchise to use
        if (franchise.equalsIgnoreCase("NYPizzaStore")) {
            pizzaStore = new NYPizzaStore();
        } else if (franchise.equalsIgnoreCase("ChicagoPizzaStore")) {
            pizzaStore = new ChicagoPizzaStore();
        } else {
            System.out.println("Unknown franchise: " + franchise);
            return;
        }

        // Order pizza
        Pizza pizza = pizzaStore.orderPizza(pizzaKind);
        if (pizza != null) {
            System.out.println("Ordered a " + pizza.getName());
        } else {
            System.out.println("Pizza type not available.");
        }
    }
}
