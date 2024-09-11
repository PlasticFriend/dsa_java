import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int arr[] = new int[20];
//        for (int i=0; i<20; i++){
//            arr[i] = i;
//        }
//        for ( int i: arr){
//            System.out.println("This is "+i);
//        }
        // two methods to declare string
        // String <name> = "value"; --memory in string pool
        // String <name> = new String("value"); --memory in heap memory
        /* comparing string
        use <==> operator

        Note that in this case both should be in string pool.
        if both of them are from heap memory then test fails and
         if one from heap and other from string pool then also fails
         ** to check if value is same irrespective of storage location use <.equals> method
         syntax-> var1.equals(var2)


         */
        String name = "sayan";
        String newname = new String("sayan");
        String name2 = "sayan";
        String newname2 = new String("sayan");
        if (newname == newname2){
            System.out.println("you were correct...");
        }
        else {
            System.out.println("you were wrong...");
        }
        boolean af = name.equals(name2);
        System.out.println(af);



    }
    static void greet(){
        System.out.println("Good Morning..");

    }
    static int average(int a, int b){
        int avg = (a+b)/2;
        return avg;
    }
    static int min(int a, int b){
        int ret  = Math.min(a,b);
        return ret;
    }

}