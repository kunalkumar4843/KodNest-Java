public class DiscountCalculationTernary {
    public static void main(String[] args) {

        double price = 2500.0;

        double finalPrice = (price > 2000) ? price - (price * 10 / 100) : price;
        System.out.println(finalPrice);
    }
}
