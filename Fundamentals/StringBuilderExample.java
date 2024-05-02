package Fundamentals;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Samuel");
        System.out.println(str);

        // charAt index
        System.out.println(str.charAt(4));

        // set characters
        str.setCharAt(0, 'M');
        System.out.println(str);

        // insert characters
        str.insert(1, 'S');
        System.out.println(str);

        // delete characters
        str.delete(0, 1);
        System.out.println(str);

        // append characters
        str.append(" Mans");
        System.out.println(str);


      

    }
}
