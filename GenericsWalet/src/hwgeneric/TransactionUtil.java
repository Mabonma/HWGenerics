package hwgeneric;

public class TransactionUtil {
    public static void executeTransaction(BaseWallet<Double> from, BaseWallet<Double> to, Double amount) {
        if (from.getAmount() < amount) {
            throw new NoMoneyException("No enough money in from wallet");
        }

        from.setAmount(from.getAmount() - amount);
        to.setAmount(to.getAmount() + amount);
    }
}
