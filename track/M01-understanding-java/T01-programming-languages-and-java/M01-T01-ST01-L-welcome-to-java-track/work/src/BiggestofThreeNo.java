public class BiggestofThreeNo {
    public static void main(String[] args) {

        int a = 45;
        int b = 78;
        int c = 32;

        int biggest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(biggest);
    }

}
