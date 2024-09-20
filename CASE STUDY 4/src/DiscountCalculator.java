public class DiscountCalculator {
    //fields
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    //constructor
    DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;

    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
        calculateDiscountAmount();
        calculateFinalPrice();
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
        calculateDiscountAmount();
        calculateFinalPrice();
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    private void calculateDiscountAmount() {
        this.discountAmount = originalPrice * (discountRate / 100);
    }

    private void calculateFinalPrice() {
        this.finalPrice = originalPrice - discountAmount;
    }

    @Override
    public String toString(){
        return String.format("Discount Amount : ₹%.2f Final Price: ₹%.2f", discountAmount , discountRate);
    }


}
