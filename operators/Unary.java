public class Unary{
    public static void main(String[] args){
        // Unary plus operator
        int a = +20;
        // Unary Minus operator 
        int b = -20;

        //Post Increment
        System.out.println("a++ : "+ a++);
        System.out.println("Value of 'a' post Increment : "+a);
        //Pre Increment
        System.out.println("++a : "+ ++a);

        a = +20;
        // Decrement
        System.out.println("a-- : " +a--);
        System.out.println("Value after post decrement: " +a);
        //Pre Decrement
        System.out.println("--a : " + --a);

        //Logical Operator 
        System.out.println("is a > b ? : " + (a > b));
        System.out.println("Logical Complement a > b ? : " + !(a > b) );
    }
}