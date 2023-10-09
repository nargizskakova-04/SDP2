import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello user! Click 1 to choose espresso(500 tg), 2 to choose latte(400 tg)");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch == 1){
            Espresso espresso = new Espresso();
            System.out.println("You can add: 1)Nothing 2)Milk(200) 3)Sugar(100) 4)Syrop(250)");
            int addIngredient = sc.nextInt();
            if(addIngredient == 1){
                System.out.println("The cost is: " + espresso.getCost());
            }
            if(addIngredient == 2){
                Milk espressoMilk = new Milk(espresso);
                System.out.println("The cost is: " + espressoMilk.getCost());
            }
            if(addIngredient == 3){
                Sugar espressoSugar = new Sugar(espresso);
                System.out.println("The cost is: " + espressoSugar.getCost());
            }
            if(addIngredient == 4){
                Syrop espressoSyrop = new Syrop(espresso);
                System.out.println("The cost is: " + espressoSyrop.getCost());
            }
            else{
                System.out.println("Wrong");
            }
        }
        if(ch == 2){
            Latte latte = new Latte();
            System.out.println("You can add: 1)Nothing 2)Milk(200) 3)Sugar(100) 4)Syrop(250)");
            int addIngredient = sc.nextInt();
            if(addIngredient == 1){
                System.out.println("The cost is: " + latte.getCost());
            }
            if(addIngredient == 2){
                Milk latteMilk = new Milk(latte);
                System.out.println("The cost is: " + latteMilk.getCost());
            }
            if(addIngredient == 3){
                Sugar latteSugar = new Sugar(latte);
                System.out.println("The cost is: " + latteSugar.getCost());
            }
            if(addIngredient == 4){
                Syrop latteSyrop = new Syrop(latte);
                System.out.println("The cost is: " + latteSyrop.getCost());
            }
            else{
                System.out.println("Wrong");
            }
        }
    }
}