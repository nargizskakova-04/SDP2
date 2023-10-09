public class Milk extends BaseDecorator{
    Coffee coffee;
    public Milk(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription() + ", Milk";
    }

    public int getCost(){
        return coffee.getCost() + 200;
    }
}
