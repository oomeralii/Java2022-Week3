public class CustomerManager {

    BaseDatabaseManager databaseManager;//Bizim stratejimiz.Hangi veri tabanı sistenini verirsek onun getDatası çalışcak.
                                        //databaseManager Sql ve orecle da tutabilir.İkisinde annesi o..
    public void getCustomers(){//Müşterileri getir diye bir operasyon
        databaseManager.getData();
    }
}
