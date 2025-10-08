
public class recursion {
    static void printNumbers(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+ " ");
        printNumbers(n-1);
    }
    static void system(int n){
        if(n==0){
            return ;
        }
        system(n-1);
        System.out.print(n+ " ");
    
    }

    public static void main(String[]args){
        int n = 10;
       
        printNumbers(n);
         System.out.println("\n");
        system(n);
    }
    


    
}
