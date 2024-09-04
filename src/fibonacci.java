public class fibonacci {

    static int findFib(int n){ // to find the fib of nth number
        if(n < 2){
            return n ;
        }
        else{
            return  findFib(n-1)+findFib(n-2);
        }
    }

    static void printFib(int n){
        if(n == 0 || n == 1){
            System.out.println(n);
            return;
        }
        else{
            printFib(n-1);
            System.out.println(findFib(n) + " ");
        }
    }
    public static void main(String[] args){
      printFib(10);
    }
}
