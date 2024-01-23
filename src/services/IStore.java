public interface IStore {

    public double getPrice( Object item ) throws UnknownItemException;

    public boolean isAvailable( Object item, int qty )
	    throws UnknownItemException;

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

    private void treatOrder( Order order, Object item, int qty )
    throws UnknownItemException;
}