public class UserImpl implements User {

    @Override
    public Coffee orderCoffee(String type) {
        switch (type) {
            case "Espresso":
                return new Espresso();
            case "Latte":
                return new Latte();
            default:
                return null;  // handle default or error case
        }
    }

    @Override
    public Coffee addTopping(Coffee coffee, String topping) {
        switch (topping) {
            case "Milk":
                return new Milk(coffee);
            case "Sugar":
                return new Sugar(coffee);
            case "Syrop":
                return new Syrop(coffee);
            default:
                return coffee;  // handle default or error case
        }
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + String.format("%.2f", amount) + " tg");
    }
}
