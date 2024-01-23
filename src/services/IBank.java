public interface IBank {
    public void transfert(String from, String to, double amount) throws InsufficientBalanceException, UnknownAccountException;
}