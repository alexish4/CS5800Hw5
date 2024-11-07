package Order;

public class LoyaltyDiscount {
    private String loyaltyStatus;
    private double discountRate;

    public LoyaltyDiscount(String loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public String getLoyaltyStatus() {
        return loyaltyStatus;
    }

    public void setLoyaltyStatus(String loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public double getDiscountRate() {
        setDiscountBasedOffOfStatus();
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setDiscountBasedOffOfStatus() {
        switch (loyaltyStatus) {
            case "Bronze":
                discountRate = .05;
                break;
            case "Silver":
                discountRate = 0.10;
                break;
            case "Gold":
                discountRate = 0.15;
                break;
            default:
                discountRate = 0.00;
                break;
        }
    }
}
