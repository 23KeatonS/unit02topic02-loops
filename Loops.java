import java.util.Arrays;

public class Loops {

  // nHellos method
  public static void hello(int n){
    
    for (int i = 1; i<=n; i++){
      if (i%10 == 1 || i%100 == 1){
        System.out.println(i+"st hello");
      }else if (i%10 == 2 || i%100 == 2){
        System.out.println(i+"nd hello");
      }else if(i%10 == 3 || i%100 == 3){
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
    
  public static double rollDie(int maxVal){
    
    double randNum = Math.random();
    double val = maxVal*randNum;
    double roll = Math.floor(val)+1;
    return roll;
  }

  public static void pepysSimulation(){
    
    int totalOnes6 = 0;
    int totalOnes12 = 0;
    for (int a = 0; a<100; a++){
      int oneCount6 = 0;
      int oneCount12 = 0;
      for (int i = 0; i<6; i++){
        if (rollDie(6)<1){
          oneCount6++;
        }
        totalOnes6 += oneCount6;
      for (int x = 0; i <12; x++){
        if (rollDie(6)==1){
          oneCount12 ++;
        }
        totalOnes12 += oneCount12;
      }
      }
      double avgOnes6 = totalOnes6/100;
      double avgOnes12 = totalOnes12/100;
      System.out.println(avgOnes6);
      System.out.println(avgOnes12);
  }
  }
    
    
  

  public static void main(String[] args) {

    // testing of static methods goes here
    hello(24);
    System.out.println(nRandoms(2));
    System.out.println(isPrime(59));
    System.out.println(Arrays.toString(getFactors(59)));
    pepysSimulation();


  }
}