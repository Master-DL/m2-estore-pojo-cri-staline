package services;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;

public interface IBank {
    public void transfert(String from, String to, double amount) throws InsufficientBalanceException, UnknownAccountException;
}