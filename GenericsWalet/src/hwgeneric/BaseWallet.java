package hwgeneric;

public class BaseWallet<T extends Number> {
    protected T amount;

    public BaseWallet(T amount) {
        this.amount = amount;
    }

    public T getAmount() {
        return amount;
    }

    public void setAmount(T amount) {
        this.amount = amount;
    }
}
