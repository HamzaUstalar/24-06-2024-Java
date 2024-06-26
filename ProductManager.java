public class ProductManager {
    // ürünü veri tabanına ekleme nesnesi.
    public void add(Product product){

        // ProductValidator validator = new ProductValidator(); // Burada farklı bir classı tanımlayıp aşşağıdaki kodda o classın methodunu kullanabildik.

         
        if(ProductValidator.isValid(product)){ // validator dediğimiz isValid ise 
            System.out.println("Eklendi.");
        }else{
            System.out.println("Urun Bilgileri Gecersizdir.");
        }
        
        ProductValidator.isValid(product); // Burası çalışır çünkü isValid statictir.
        // ProductValidator.birsey(); ===> Burası çalışmaz çünkü birsey static değildir.
        
    }
}
