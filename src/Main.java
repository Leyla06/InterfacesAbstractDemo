import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstname("Leyla");
        customer.setLastname("Xelilova");
        customer.setDateOfBirth("06.09.2005");
        customer.setNationalityId("AA1354567");
        customerManager.Save(customer);
    }
}