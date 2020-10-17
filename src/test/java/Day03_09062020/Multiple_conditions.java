package Day03_09062020;

public class Multiple_conditions {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;


        //print either a & b is equal, greater or less than c

        if (a+b < c){
            System.out.println("a and b less than c");

        }else if(a+b > c){
            System.out.println("a and b greater than c");
        }else{
            System.out.println("a and b is equal c");
        }//end of conditional statements
    }//end of main method
}//end of java method
