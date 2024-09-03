package streamingService;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private CreditCard creditCard;
    private boolean hasSubscription;
    private Payment payment;

    public User(String firstName, String lastName, String email, CreditCard creditCard, boolean hasSubscription, Payment payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.creditCard = creditCard;
        this.hasSubscription = hasSubscription;
        this.payment = payment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public boolean isHasSubscription() {
        return hasSubscription;
    }

    public void setHasSubscription(boolean hasSubscription) {
        this.hasSubscription = hasSubscription;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", creditCard=" + creditCard +
                ", hasSubscription=" + hasSubscription +
                ", payment=" + payment +
                '}';
    }
}
