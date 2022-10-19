public class Main {
        public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();
    /*


        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.TaxNumber = "7545";
        company.CompanyName = "Arçelik";
        company.setId(100);

        CustomerManager customerManager1 =  new CustomerManager(new Person());

        Person person = new Person();
        person.FirstName = "Demiroğ";
        person.Nationalıdentity = "5454524132";
*/
    }
}