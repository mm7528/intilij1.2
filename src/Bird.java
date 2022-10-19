public abstract class Bird extends Animal{
    protected double flightHeight, wingsLength;

    public Bird(String name, double age, boolean isPredator, int caloriesInMeal, double flightHeight, double wingsLength) {
        super(name, age, isPredator, caloriesInMeal);
        this.flightHeight=flightHeight;
        this.wingsLength=wingsLength;
    }

    public void setFlightHeight(double flightHeight) {
        this.flightHeight = flightHeight;
    }

    public double getFlightHeight() {
        return this.flightHeight;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    public double getWingsLength() {
        return this.wingsLength;
    }

    public void sing(){
        System.out.println("shrik shrik...");
    }

    public void dance(){
        System.out.println("birdy dancing...");
    }

    @Override
    public int eat(){
        return super.eat()/6;
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal+ "\nflight height: " + flightHeight + "\nwings length: " + wingsLength;
    }
}

