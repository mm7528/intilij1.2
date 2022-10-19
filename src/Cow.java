public class Cow extends Mammal{
    protected int numberOfBirths;

    public Cow(String name, double age, boolean isPredator, int caloriesInMeal, int caloriesInMilk, int pregnancyMonths,int numberOfBirths) {
        super(name, age, isPredator, caloriesInMeal, caloriesInMilk, pregnancyMonths);
        this.numberOfBirths=numberOfBirths;
    }

    public void setNumberOfBirths(int numberOfBirths) {
        this.numberOfBirths = numberOfBirths;
    }

    public int getNumberOfBirths() {
        return this.numberOfBirths;
    }

    @Override
    public int eat() {
        return super.eat()/4;
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal + "\ncalories in milk: " + caloriesInMilk + "\nnumber of pregnancy months: " + pregnancyMonths + "\nnumber of births: " + numberOfBirths;
    }
}
