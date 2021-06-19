package queue;

import java.util.LinkedList;
import java.util.Queue;

class PetrolPump{
    int petrol=0, distance = 0, position = -1;
    PetrolPump(int petrol, int distance, int position){
        this.distance = distance;
        this.petrol = petrol;
        this.position = position;
    }
}
public class CircularTour {
    public static void main (String[] args) {
        PetrolPump[] petrolPumpsWithoutCircle = new PetrolPump[]{
                new PetrolPump(4,6, 0),
                new PetrolPump(6,5, 1),
                new PetrolPump(7,3, 2),
                new PetrolPump(4,15, 3)
        };
        PetrolPump[] petrolPumpsWithCircle = new PetrolPump[]{
                new PetrolPump(4,6, 0),
                new PetrolPump(6,5, 1),
                new PetrolPump(7,3, 2),
                new PetrolPump(4,5, 3)
        };

        findFirstStartingPointMethod1(petrolPumpsWithoutCircle);
    }
// Method 1 :- naive solution
    private static void findFirstStartingPointMethod1(PetrolPump[] petrolPumps) {
        int totalPumps = petrolPumps.length;
        int startingPump = 0;
        int leftOverPetrol = 0;
        int isCircle = -1;
        for(int i = 0; i < totalPumps; i ++){
            startingPump = i;
            leftOverPetrol = 0;
            for(int j=i; j < totalPumps; j++){
                if(leftOverPetrol + petrolPumps[j].petrol > petrolPumps[j].distance){
                    leftOverPetrol = leftOverPetrol + petrolPumps[j].petrol - petrolPumps[j].distance;
                } else {
                    leftOverPetrol = -1;
                    break;
                }
            }

            if(startingPump>0){
                for(int j=0; j < startingPump; j++){
                    if(leftOverPetrol + petrolPumps[j].petrol > petrolPumps[j].distance){
                        leftOverPetrol = leftOverPetrol + petrolPumps[j].petrol - petrolPumps[j].distance;
                    } else {
                        leftOverPetrol = -1;
                        break;
                    }
                }
            }

            if(leftOverPetrol >=0 ){
                System.out.println("Starting point  = " + startingPump);
                isCircle = 1;
                return;
            } else {
                isCircle = -1;
            }
        }

        if(isCircle< 0){
            System.out.println("No Circle");
        }



    }


    // Method 2 :- Optimized solution
    private static void findFirstStartingPointMethod2(PetrolPump[] petrolPumps){

    }
}


