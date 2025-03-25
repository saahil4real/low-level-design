public class PaymentFriend  extends Payment{
    @Override
    public void validateRequest() {
        System.out.println("Validate Logic of Payment to Friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fee charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the Amount logic of Payment to Friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the full amount");
    }
}
