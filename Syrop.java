public class Syrop extends BaseDecorator{
    Coffee coffee;
    public Syrop(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription() + ", Syrop";
    }

    public int getCost(){
        return coffee.getCost() + 250;
    }
}
