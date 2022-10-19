public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();//Base ile orecle-sql-MySql dönüşümlerini yapmak.
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}