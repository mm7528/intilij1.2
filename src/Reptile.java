public abstract class Reptile extends Animal{
    protected double tailLength;
    public Reptile(String name, double age, boolean isPredator, int caloriesInMeal,double tailLength) {
        super(name, age, isPredator, caloriesInMeal);
        this.tailLength=tailLength;
    }

    public void setTailLength(double tailLength)
    {
        this.tailLength=tailLength;
    }

    public double getTailLength()
    {
        return this.tailLength;
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal + "\ntail length: " + tailLength;
    }
}
