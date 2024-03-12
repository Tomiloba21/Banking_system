package ICHDApp;

public class FundTransfer {

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    private double amount;

    public FundTransfer(double amount) {
        this.amount = amount;
    }
}
