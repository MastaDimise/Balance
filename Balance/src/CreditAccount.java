class CreditAccount extends Account {
    private final long creditLimit;

    public CreditAccount(long balance, long creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean booleanAdd(long amount) {
        if (amount < 0 || balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean booleanPay(long amount) {
        if (amount < 0 || balance - amount < -creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }
}