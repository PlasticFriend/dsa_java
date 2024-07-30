import java.util.Scanner;

//lecture 2
public class lec2 {
    public static void main(String[] args){
        System.out.println("123....code testing");
        System.out.print("123....code testing");
        //println command generates a new next line another method to do so in \n
        System.out.print("testing testing.....\nnow next line\n");
//        pattern printint
        System.out.println("*\n**\n***\n****\n*****");
        int a;
        a= 10;
        System.out.println(a);
        int b = 7;
        System.out.println(b);

//        String name = "sayan";
//        System.out.println(name);
        //data types
//        1. primitive- byte,short,char,boolean,int,long,float,double
//          2. non primitive- string, array, class, object, interface
        int sum  = a+b;
        System.out.println(sum);

        int mul = a*b;
        System.out.println(mul);

        //taking input
        Scanner sc  = new Scanner(System.in);
        String name = sc.next();  //next function takes only one token that is one word for taking in different data types refer next para
        System.out.println(name);

        // sc.nextInt()
        //sc.nextFloat()
        //sc.nextLine()







    }
}
