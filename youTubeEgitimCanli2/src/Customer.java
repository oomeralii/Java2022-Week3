public class Customer {
    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı");
    }

    private int id;
    private String city;

    public int getid() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        city = city;
    }
}
