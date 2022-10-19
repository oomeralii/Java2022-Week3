public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditmanager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
        set_customer(customer);
        set_creditmanager(creditManager);
    }
    public void Save(){
        System.out.println("Müşteri Kaydedildi : ");
    }
    public void Delete(){
        System.out.println("Müşteri Silindi : ");
    }

    public void GiveCredit(){
        get_creditmanager().calculate();
        System.out.println("Kredi verildi");
    }

    public Customer get_customer() {
        return _customer;
    }

    public void set_customer(Customer _customer) {
        this._customer = _customer;
    }

    public ICreditManager get_creditmanager() {
        return _creditmanager;
    }

    public void set_creditmanager(ICreditManager _creditmanager) {
        this._creditmanager = _creditmanager;
    }
}
