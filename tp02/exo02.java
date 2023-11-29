package tp02;
import java.util.Scanner;
public class exo02{
 
public static void main(String args[]){
        System.out.println("entre un nombre");
        Scanner scanner=new Scanner(System.in);
        int M=scanner.nextInt();
        int i=2;
        int co=0;
        while(co<M){
            if(premier(i)==true){
                co++;
                System.out.println(i);

            }
       
       i++;
     }
       
  }
 
public static boolean premier (int n){
  
    for(int i = 2;i<= n ;i++){
      if(n%2==0){
    return false;
   }

    }
    return true;
  }
 

}