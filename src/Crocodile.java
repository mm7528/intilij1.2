public class Crocodile extends Reptile{
    protected boolean hadDentalTreatment;
    public Crocodile(String name, double age, boolean isPredator, int caloriesInMeal, double tailLength, boolean hadDentalTreatment) {
        super(name, age, isPredator, caloriesInMeal, tailLength);
        this.hadDentalTreatment=hadDentalTreatment;
    }

    public void setHadDentalTreatment(boolean hadDentalTreatment) {
        this.hadDentalTreatment = hadDentalTreatment;
    }

    public boolean getHadDentalTreatment() {
        return this.hadDentalTreatment;
    }

    @Override
    public int eat(){
        return super.eat()*2;
    }

    public String toString(){
        return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal + "\ntail length: " + tailLength + "\nhad dental treatment: " + hadDentalTreatment;
    }
}
