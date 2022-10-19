public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isvalid(product)){
            System.out.println("Eklendi");
        } else{
            System.out.println("Ürün bilgileri geçersizdir");
        }
        //ProductValidator productValidator = new ProductValidator();
        //productValidator.bisey();
    }
}
