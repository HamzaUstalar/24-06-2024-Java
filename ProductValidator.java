public class ProductValidator{

    // SORU = ProductValidator'ın constructoru olsun. (Constructorlar newleyince çalışır) Static olarak tanımlasaydık constructor çalışır mı?
    // Deneyelim
    public ProductValidator(){
        System.out.println("Yapici blok calisti.");
    }

    // CEVAP = Hayır static olursa new'lenmediği için yapıcı blok çalışmaz.
    // Bunun çözümü static olarak constructor çalıştırırız.
    static {
        System.out.println("Static constructor calisti...");
    }

    // && = ve || = veya
    // product.name.isEmpty() = isEmpty değer girilmedi demektir.

    // Burada static olarak değiştirdik. ProductManager'ın içinde ProductValidator'u tanımlamadan direkt kullanabiliriz.
    // Fakat static bellekten program silinesiye kadar silinmez o yüzden yer kaplama ihtimali problem yaratabilir.
    // Genelde biz static'i Araç olarak kullanılırız.
    
    // Static yaparsak class ismi ile başka bir classta çağırabiliriz.
    // static harici olursa direkt newlememiz gerekicektir.
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){ // name boş değil ise
            return true;
        }else{
            return false;
        }
    }
    public int birsey(){ // int olmasaydı constructor olucaktı. int ==> bir şey döndürmesini ifade eder. void olsaydı döndürmeden bir çıktı verir.
        return 10;
    }
}