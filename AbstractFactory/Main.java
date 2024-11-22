public class Main {
    public static void main(String[] args){
        PizzaStore NYPizzaStore = new NYPizzaStore();
        Pizza pizza = NYPizzaStore.orderPizza("cheese");

        System.out.println(pizza);
        
        PizzaStore chicagPizzaStore = new NYPizzaStore();
        Pizza VeggiePizza = chicagPizzaStore.orderPizza("veggie");

        System.out.println(VeggiePizza);


    }
    
}
