public class Snake extends Reptile{
    protected boolean isVenomous;

    public Snake(String name, double age, boolean isPredator, int caloriesInMeal, double tailLength, boolean isVenomous) {
        super(name, age, isPredator, caloriesInMeal, tailLength);
        this.isVenomous=isVenomous;
    }

    public void getIsVenomous(boolean isVenomous){
        this.isVenomous=isVenomous;
    }

    public boolean getIsVenomous() {
        return this.isVenomous;
    }

    public void dance(){
        System.out.println("snakey shakey...");
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal + "\ntail length: " + tailLength + "\nis venomous: " + isVenomous;
    }
}
