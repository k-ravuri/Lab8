/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     *  the account info.
     */
    public enum BankAccountType {
        /**
         * checking.
         */
        CHECKINGS,
        /**
         * savings.
         */
        SAVINGS,
        /**
         * student.
         */
        STUDENT,
        /**
         * work place.
         */
        WORKPLACE
    }

    /**
     * the accountNumber.
     */
    private int accountNumber;
    /**
     * the accountType.
     */
    private BankAccountType accountType;
    /**
     * the accountBalance.
     */
    private double accountBalance;
    /**
     * the ownerName.
     */
    private String ownerName;
    /**
     * the interestRate.
     */
    private double interestRate;
    /**
     * the interestEarned.
     */
    private double interestEarned;

    /**
     * this is random.
     */
    private final int random = 10000;
    /**
     * this is random.
     */
    private final double randomd = 1.5;
    /**
     * this is random.
     */
    private final double randomd2 = 105.5;
    /**
     * @param name is given
     * @param accountCategory is given
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        interestRate = randomd;
        interestEarned = randomd2;
        accountBalance = random;
    }

    /**
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * @return accountType
     */
    public BankAccountType getBankAccountType() {
        return accountType;
    }
    /**
     * @return getaccountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * @return getownerName
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * @return getinterestRate
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * @return getinterestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * @param p account number
     */
    public void setAccountNumber(final int p) {
         accountNumber = p;
    }
    /**
     * @param v s the BankAccountType.
     */
    public void setBankAccountType(final BankAccountType v) {
        accountType = v;
    }
    /**
     * @param i is amount
     */
    public void setaccountBalance(final double i) {
        accountBalance = i;
    }
    /**
     * @param n is the name.
     */
    public void setownerName(final String n) {
        ownerName = n;
    }
    /**
     * @param n is he interest rate.
     */
    public void setinterestRate(final double n) {
        interestRate = n;
    }
    /**
     * @param n is the interest earned.
     */
    public void setinterestEarned(final double n) {
        interestEarned = n;
    }
}
