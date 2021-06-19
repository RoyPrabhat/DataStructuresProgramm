package queue;

import java.util.LinkedList;
import java.util.Queue;

class PetrolPump{
    int petrol, distance;
    PetrolPump(int petrol, int distance){
        this.distance = distance;
        this.petrol = petrol;
    }
}
public class CircularTour {
    public static void main (String[] args) {
        PetrolPump[] petrolPumpsWithoutCircle = new PetrolPump[]{
                new PetrolPump(4,6),
                new PetrolPump(6,5),
                new PetrolPump(7,3),
                new PetrolPump(4,15)
        };
        PetrolPump[] petrolPumpsWithCircle = new PetrolPump[]{
                new PetrolPump(4,6),
                new PetrolPump(6,5),
                new PetrolPump(7,3),
                new PetrolPump(4,5)
        };

        findFirstStartingPointMethod1(petrolPumpsWithoutCircle);
    }
// Method 1 :- naive solution
    private static void findFirstStartingPointMethod1(PetrolPump[] petrolPumps) {
        int totalPumps = petrolPumps.length;
        int startingPump, leftOverPetrol;
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
                return;
            }
        }

        System.out.println("No Circle");

    }


    // Method 2 :- Optimized solution
    private static void findFirstStartingPointMethod2(PetrolPump[] petrolPumps){
        int startPoint = 0;
        int endPoint = 1;
        Queue<PetrolPump> petrolPumpQueue = new LinkedList<>();
        petrolPumpQueue.add(petrolPumps[0]);

        while(startPoint != endPoint){

        }

    }
}


