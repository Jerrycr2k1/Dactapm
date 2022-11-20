package FacadePattern;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("contact@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("ahihi@gmail.com", "0988.999.999");
    }
}
