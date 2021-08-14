package hwgeneric;

public class Program {

    public static void main(String[] args) {
        GoldWallet goldWallet=new GoldWallet(56.8);
        PlatinumWallet platinumWallet = new PlatinumWallet(-12.3);
        TransactionUtil.executeTransaction(goldWallet, platinumWallet, 15.0);
    }

}