package Builder;

public class BankClient {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount.BankAccountBuilder("Jerry", "0123456789")
                .withEmail("contact@gmail.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
