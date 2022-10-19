public class Penguin extends Bird{
    protected double height;

    public Penguin(String name, double age, boolean isPredator, int caloriesInMeal, double flightHeight, double wingsLength, double height) {
        super(name, age, isPredator, caloriesInMeal, flightHeight, wingsLength);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal+ "\nflight height: " + flightHeight + "\nwings length: " + wingsLength + "\nheight: "+ height;
    }
}
