public class Account {
    String name;
    int accNo;
    double amount=0;

    public Account(){
        name="Rakesh";
        accNo=487854421;
    }
    public Account(String name,int accNo){
        this.name=name;
        this.accNo=accNo;
    }

    public Double deposit(double deposit){
        amount = amount +deposit;
        System.out.println("Amount is Successfully Created in your Account");
        return amount;
    }
    public Double withdraw(double withdraw){
        amount = amount - withdraw;
        System.out.println("Amount Successfully debited from your account");
        return amount;
    }
    public void balance(){
        System.out.println("Account Name: "+name);
        System.out.println("Account Number"+accNo);
        System.out.println("Account Balance"+amount);
    }

    public static void main(String[] args) {
        Account ac =new Account();
        ac.balance();
        ac.deposit(5000);
        ac.balance();
        ac.withdraw(1000);
        ac.balance();
    }
}
