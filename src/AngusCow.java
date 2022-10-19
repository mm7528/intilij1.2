public class AngusCow extends Cow{
    protected double weight;

    public AngusCow(String name, double age, boolean isPredator, int caloriesInMeal, int caloriesInMilk, int pregnancyMonths, int numberOfBirths, double weight) {
        super(name, age, isPredator, caloriesInMeal, caloriesInMilk, pregnancyMonths, numberOfBirths);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal + "\ncalories in milk: " + caloriesInMilk + "\nnumber of pregnancy months: " + pregnancyMonths + "\nnumber of births: " + numberOfBirths + "\nweight: "+ weight;
    }
}