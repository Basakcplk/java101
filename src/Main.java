import java.util.Random;

public class Main {
     public static void main(String[] args) { 
        Fighter f1 = new Fighter("A", 20, 90, 90 ,40);       
        Fighter f2 = new Fighter("B", 20, 85, 85, 40);
        
        Random random = new Random();
        boolean f1Starts = random.nextBoolean();

       
        Fighter firsFighter, secondFighter;
        if(f1Starts){
            firsFighter = f1;
            secondFighter =f2;
        }else{
            firsFighter = f2;
            secondFighter = f1;
        }
       
       
        Match match = new Match(firsFighter, secondFighter, 85, 90);
        match.run();
    }   


}
