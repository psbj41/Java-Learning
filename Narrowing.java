public class Narrowing {
    public static void main(String[] args){
        int i = 2000;
        byte b = (byte)i;

        System.out.println("int to byte: "+b);
    }
}
