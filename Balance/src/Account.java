abstract class Account {
    protected long balance;

    public Account(long balance){
        this.balance = balance;
    }

    abstract boolean booleanAdd(long amount);

    abstract boolean booleanPay(long amount);

    boolean transfer(Account account, long amount){
        if (this.booleanPay(amount)) {
            if (account.booleanAdd(amount)) {
                return true;
            } else {
                this.booleanAdd(amount);
                return false;
            }
        }
        return false;
    }

    public long getBalance(){
        return balance;
    }
}
