public class Sugar extends BaseDecorator{
    Coffee coffee;
    public Sugar(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription() + ", Sugar";
    }

    public int getCost(){
        return coffee.getCost() + 100;
    }
}
