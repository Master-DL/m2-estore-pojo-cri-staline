package services;
import data.Cart;
import data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface IStore {

    public Cart addItemToCart(
	            Cart cart,
	            Client client,
	            Object item,
	            int qty )
	    throws UnknownItemException, InvalidCartException;

    public Order pay( Cart cart, String address, String bankAccountRef )
	    throws
	    InvalidCartException, UnknownItemException,
	    InsufficientBalanceException, UnknownAccountException;

    public Order oneShotOrder(
            Client client,
            Object item,
            int qty,
            String address,
            String bankAccountRef
    ) throws UnknownItemException, InsufficientBalanceException, UnknownAccountException;

}