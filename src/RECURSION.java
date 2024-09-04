//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RECURSION {
    public static void print(int n){
        if(n == 0 ){
            return;
        }
        else{
            print(n-1);
            System.out.println("Hello World"+n);
        }
    }
    public static void main(String[] args) {
     print(5);
    }
}