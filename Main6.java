import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new UserImpl();
        System.out.println("Please write what do you want: Espresso(500 tg) or Latte(400 tg)");
        String kind = sc.next();
        Coffee orderedCoffee = user.orderCoffee(kind);
        System.out.println("Now write how many toppings do you want, and what toppings(Sugar(100 tg), Milk(200 tg), Syrop(250 tg)");
        int col = sc.nextInt();
        for(int i = 0; i < col; i++){
            String topping = sc.next();
            orderedCoffee = user.addTopping(orderedCoffee, topping);
        }

        System.out.println(orderedCoffee.getDescription() + " costs " + orderedCoffee.getCost());
        user.pay(orderedCoffee.getCost());
    }
}
