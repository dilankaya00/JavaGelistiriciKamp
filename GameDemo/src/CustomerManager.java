
public class CustomerManager implements CustomerManagerDao {
	CustomerCheckService  customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	@Override
	public void add(Customer customer) {
		System.out.println("Customer added: "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer deleted: "+customer.getFirstName());
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated: "+customer.getFirstName());
		
		
	}

}
