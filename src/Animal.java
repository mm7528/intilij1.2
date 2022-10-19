public abstract class Animal {
        protected  String name;
        protected double age;
        protected boolean isPredator;
        protected int caloriesInMeal;

        public Animal(String name,double age, boolean isPredator, int caloriesInMeal)
        {
            this.name=name;
            this.age=age;
            this.isPredator=isPredator;
            this.caloriesInMeal=caloriesInMeal;

        }

        public String getName(){
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAge(){
            return this.age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public boolean getIsPredator() {
            return this.isPredator;
        }

        public void setIsPredator(boolean predator) {
            isPredator = predator;
        }

        public int getCaloriesInMeal() {
            return this.caloriesInMeal;
        }

        public void setCaloriesInMeal(int caloriesInMeal) {
            this.caloriesInMeal = caloriesInMeal;
        }

        public int eat(){
            return 3*this.caloriesInMeal;
        }


        public String toString()
        {
            return "name: " + this.name + "\nage: " + this.age + "\nis a predator: " + this.isPredator + "\ncalories in a meal: " + caloriesInMeal;
        }
    }

