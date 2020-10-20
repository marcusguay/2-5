import java.util.Scanner;
class displayBox{
public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int w,h;
    
    w= sc.nextInt(); 
    h= sc.nextInt(); 
    
    
    box(w,h);
    
    
    
    
}


public static void box(int w,int h){
    int i=0;
    int k=0;
    while(i < h ){
        
        while(k < w){
        System.out.print("$");
        
        k++;
    }
    System.out.println("");
    k=0;
    i++;
}

}


}

