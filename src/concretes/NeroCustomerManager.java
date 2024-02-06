package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;
    public NeroCustomerManager(CustomerCheckService customerCheckService){
        super();
        this.customerCheckService = customerCheckService;
    }
    @Override
    public void Save(Customer customer) {
        if (this.customerCheckService.CheckIfRealPerson(customer))
            super.Save(customer);
        else {
            System.out.println("Customer isn't real person");
        }
    }
}
