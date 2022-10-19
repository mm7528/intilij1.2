public class Main {

    public static int sumOfCalories(Animal[] arr){
        int i;
        int sum=0;
        for(i=0;i<arr.length;i++){
            sum+=arr[i].eat();
        }
        return sum;
    }

    public static void singingBirds(Animal[]arr){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i] instanceof Bird){
                ((Bird)arr[i]).sing();
            }
        }
    }

    public static void dancingBirdsAndSnakes(Animal[]arr){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i] instanceof Bird){
                ((Bird)arr[i]).dance();
            }
            else if(arr[i] instanceof Snake){
                ((Snake) arr[i]).dance();
            }
        }
    }

    public static String fattestHipo(Animal[]arr){
        int i;
        int max=-472500087;
        String name="";
        for(i=0;i<arr.length;i++){
            if(arr[i] instanceof Hipo){
                if(((Hipo) arr[i]).getFatPercentage()>max){
                    max=((Hipo) arr[i]).getFatPercentage();
                    name=arr[i].getName();
                }
            }

        }
        return name;
    }

    public static void main(String[] args) {
        Cow cow = new Cow("cow",2,false,250,300,10,3);
        Penguin bird1 = new Penguin("bird",2.3,true,230,2,20,80);
        Penguin bird2 = new Penguin("bird",2.3,false,230,2,20,80);
        Hipo hipo1 = new Hipo("hipopotami",3.5,false,2000,250,10,70);
        Hipo hipo2 = new Hipo("hipopotamus",3.5,false,2000,250,10,80);
        Hipo hipo = new Hipo("hipopo",12,true,2000,250,10,50);
        Snake snake= new Snake("cobra",11,true,2600,3,true);
        Animal[]arr={cow,hipo,bird1,hipo2,bird2,hipo1,snake};
        singingBirds(arr);
        dancingBirdsAndSnakes(arr);
        System.out.println(fattestHipo(arr));
        Park park = new Park();
        park.addAnimal(hipo);
        park.addAnimal(cow);
        park.addAnimal(snake);
        park.addAnimal(bird1);
        System.out.println(park.listOfPredatorsAbove10());
        System.out.println(park.predatorReptilesAndBirds());


    }

}