public interface User {
    Coffee orderCoffee(String type);
    Coffee addTopping(Coffee coffee, String topping);
    void pay(double amount);
}