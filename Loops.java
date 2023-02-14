import java.util.Arrays;

public class Loops {

  // nHellos method
  public static void hello(int n){
    
    for (int i = 1; i<=n; i++){
      if (i%10 == 1 && i!= 11){
        System.out.println(i+"st hello");
      }else if (i%10 == 2 && i != 12){
        System.out.println(i+"nd hello");
      }else if(i%10 == 3 && i != 13){
        System.out.println(i+"rd hello");
      }else{
        System.out.println(i+"th hello");
      }
    }
  }

  // nRandoms method
  public static double nRandoms(int n){
    
    double sum = 0;
    double randnum;
    for (int i = 0; i<n; i++){
      randnum = Math.random();
      System.out.println(randnum);
      sum += randnum;
    }
    return sum/((double)n);
    
  }

  public static boolean isPrime(int n){
    
    for (int i = 2; i<n; i++){
      if (n%i == 0){
        return false;
      }
    return true;
    }
    return true;
  }

  public static  int[] getFactors(int n){
    int [] factorList = new int[0];
    for (int i = 1; i <= n; i++){
      if (n%i==0){
        int [] copyList = new int[factorList.length+1];
        for(int x = 0; x< factorList.length; x++){
          copyList[x] = factorList[x];
        }
        copyList[copyList.length-1] = i;
        factorList = copyList;
      }
    }
    
    return factorList;
  }
    
 
  private static int rollDie(){
    return (int)(Math.random()*6)+1;
  }

  public static void pepys(){
    final int TRIALS = 100000;
    int oneOf6 = 0;
    int twoOf12 = 0;
    for (int trial = 0; trial<TRIALS; trial++){
      int oneCount = 0;
      for (int roll = 0; roll<6; roll++){
        int roll1 = rollDie();
        //System.out.println("Just rolled a " + roll1);
        if (roll1 == 1){
          oneCount ++;
        }
      }
      //System.out.println("About to decide whether we passed or failed...");
      if (oneCount>=1){
        oneOf6 ++;
      } 
      oneCount = 0;
      for (int roll = 0; roll<12; roll++){
        int roll2 = rollDie();
        if (roll2 ==1){
          oneCount ++;
        }
      }
      if (oneCount>=2){
        twoOf12 ++;
      }
    }
    System.out.println("rolled one at least once out of 6 rolls "+(double)oneOf6/TRIALS *100+"% of the time");
    System.out.println("rolled one at least twice out of 12 rolls "+(double)twoOf12/TRIALS*100+"% of the time");

  }
    
  private static int randDoor(){
    return (int)(Math.random()*3)+1;
  }

  public static void montyHall(int n){
    final int MAXDOORVAL = 6;
    for (int trial = 0; trial<n; trial++){
      int winningDoor = randDoor();
      int initialChoice = randDoor();
      if (winningDoor!=initialChoice){
        int newmax = MAXDOORVAL - (6-winningDoor-initialChoice);
        
      }
    }
  }
  

  public static void main(String[] args) {

    // testing of static methods goes here
    hello(24);
    System.out.println(nRandoms(2));
    System.out.println(isPrime(59));
    System.out.println(Arrays.toString(getFactors(59)));
    pepys();
    


  }
}