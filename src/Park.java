public class Park {
    Animal [] arr = new Animal[1000];
    int numberOfAnimals;

    public Park(){
        numberOfAnimals=0;
    }

    public void addAnimal(Animal animal){
        arr[numberOfAnimals]=animal;
        numberOfAnimals++;
    }

    public String listOfPredatorsAbove10(){
        int i;
        String list="Animals above 10:\n";
        for(i=0;i<numberOfAnimals;i++){
            if(arr[i].getIsPredator() && arr[i].getAge()>10){
                list =  list + arr[i].getName() + "\n";
            }
        }
        return list;
    }

    public int predatorReptilesAndBirds(){
        int i;
        int sum=0;
        for(i=0;i<numberOfAnimals;i++)
        {
            if(arr[i] instanceof Bird && arr[i].getIsPredator()){
                sum++;
            }
            else if(arr[i] instanceof Reptile && arr[i].getIsPredator()){
                sum++;
            }
        }
        return sum;
    }
}
