package CustomerAndAccount;

public class CustomerAccountMain {
    public static void main(String[] args) {
        // test CustomerAndAccount.Customer class
        Customer c1 = new Customer(15, "Tan Ah Neck",'m' );
        System.out.println(c1); // CustomerAndAccount.Customer's toString()

        // test Getters
        System.out.println("id is:" + c1.getId());
        System.out.println("name is:"+ c1.getName());
        System.out.println("gender is:"+c1.getGender());

        // test CustomerAndAccount.Account class
        Account a1 = new Account(24, c1, 100.52);
        System.out.println(a1); // CustomerAndAccount.Account's toString()

        System.out.println("id is:"+ a1.getId());
        System.out.println("customer is:"+a1.getCustomer());
        System.out.println("balance is:"+ a1.getBalance());
        a1.setBalance(200.50);
        System.out.println("balance is:"+ a1.getBalance());
        System.out.println("CustomerAndAccount.Customer name is:"+a1.getCustomerName());

        System.out.println(a1.deposit(50.25));
        System.out.println(a1.withdraw(25.25));;
    }
}
