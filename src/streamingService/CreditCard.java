package streamingService;

public class CreditCard {
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "CardNumber: " + cardNumber +
                " ExpiryDate: " + expiryDate;
    }
}
