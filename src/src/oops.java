public class oops {
    public static void main(String[] args) {
        dog muko = new dog();
        muko.walk();

    }
}
// can create many classes but only one public class is possible.
class dog{
    String name;
    int age;
    String color;
    void walk(){
        System.out.println("Dog is walking");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}