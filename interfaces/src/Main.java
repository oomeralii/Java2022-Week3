public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal = new OracleCustomerDal();
        //CustomerManager customerManager = new CustomerManager();
        //customerManager.customerDal = new OracleCustomerDal();
        //customerManager.add();
        //customerManager.customerDal = new MySqlCustomerDal();
        //customerManager.add();

        //CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //customerManager.add();
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}