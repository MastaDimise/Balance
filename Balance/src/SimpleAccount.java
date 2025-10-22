class SimpleAccount extends Account{
    public SimpleAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean booleanAdd(long amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean booleanPay(long amount) {
        if (amount < 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
