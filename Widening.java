public class Widening{
    public static void main(String[] args){
        //byte to int
        byte b =10;
        int i = b;
        System.out.println("Integer I: "+i);

        // long to float
        long l=9223372036854775805L;
        float f = l;

        System.out.println("Float value is: "+f);

        //Char to Double
        char c= 'A';
        double d = c;

        System.out.println("Double value is: "+d);
    }
}