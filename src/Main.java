import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MerniceServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1,"Þeyma Nur","Fýrat","30655588899",1998);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		customerManager.Save(customer);
	}

}
