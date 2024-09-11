public class problem {
    public static void main(String[] args) {
        String name = "sayan";
//        name  = name.toUpperCase();
        System.out.println(name);
        String name2 = "Sayan";
        System.out.println(name.trim());
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.charAt(3));
        //typecasting from int to string (also to other data types)
        int age  = 30;
        String Strage = String.valueOf(age);
        //replace method
        String love = "I love python, python is a good language";
        String love2 = love.replace("python", "java");
        System.out.println(love2);
        System.out.println(love2.contains("java"));
        String substring1 = love2.substring(2,5);
        System.out.println(substring1);
        //split--returns array
        String sords[] = love2.split(" ");
        for (String word: sords ){
            System.out.println(word);
        }
        // array of characters
        String color = "Brown";
        char arr[] = color.toCharArray();
        for (char a:arr){
            System.out.println(a);
        }
        // study about isEmpty or isBlank methods




    }
}
