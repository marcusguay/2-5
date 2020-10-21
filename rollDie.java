import java.util.Scanner;
class rollDie{
    
  
public static void main (String[] args){
     Scanner sc=new Scanner(System.in);
     boolean run = true; 
     while(run == true){    
     int roll = 0;
         int total=0;
          System.out.print(" Roll x times");
        int x=sc.nextInt();
        System.out.print(" How many sides");
         int sides=sc.nextInt();
         int i=0;
         int f=0;
    
         
         
        while(i < x){
        roll = (int) (Math.random()*sides +1);
        System.out.print(roll + ",");
        
        total=total+roll;
        i++;
    }
    System.out.println("Total is" + total);
    System.out.println(" 'true' to run again,'false to quit'");
     run=sc.nextBoolean();
    
    
}}
}