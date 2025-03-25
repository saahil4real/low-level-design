public class PaymentMerchant extends Payment{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of Payment ot Merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fee charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic for Payment to merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the remaining amount");
    }
}
