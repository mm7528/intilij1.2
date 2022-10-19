public abstract class Mammal extends Animal {
    protected int caloriesInMilk, pregnancyMonths;
    public Mammal(String name, double age, boolean isPredator, int caloriesInMeal, int caloriesInMilk, int pregnancyMonths) {
        super(name, age, isPredator, caloriesInMeal);
        this.caloriesInMilk = caloriesInMilk;
        this.pregnancyMonths = pregnancyMonths;

    }

    public void setCaloriesInMilk(int caloriesInMilk) {
        this.caloriesInMilk = caloriesInMilk;
    }

    public int getCaloriesInMilk()
    {
        return this.caloriesInMilk;
    }

    public void setPregnancyMonths(int pregnancyMonths) {
        this.pregnancyMonths = pregnancyMonths;
    }

    public int getPregnancyMonths()
    {
        return this.pregnancyMonths;
    }

    @Override
    public int eat(){
        return super.eat() + caloriesInMilk;
    }

    public String toString()
    {
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal + "\ncalories in milk: " + caloriesInMilk + "\nnumber of pregnancy months: " + pregnancyMonths;
    }
}
