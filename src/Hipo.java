public class Hipo extends Mammal {
    protected int fatPercentage;

    public Hipo(String name, double age, boolean isPredator, int caloriesInMeal, int caloriesInMilk, int pregnancyMonths, int fatPercentage) {
        super(name, age, isPredator, caloriesInMeal, caloriesInMilk, pregnancyMonths);
        this.fatPercentage = fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal + "\ncalories in milk: " + caloriesInMilk + "\nnumber of pregnancy months: " + pregnancyMonths + "\nfat percentage: " + fatPercentage;
    }
}
