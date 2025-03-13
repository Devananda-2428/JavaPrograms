import java.util.Scanner;

class BankAccount{
    String accountno;
    String accountholder;
    double balance;

    BankAccount (String accountno, String accountholder, double balance)
    {
        this.accountno=accountno;
        this.accountholder=accountholder;
        this.balance=balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Amount"+" "+amount+" "+"deposited successfully.");
    }

    void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("Amount"+" "+amount+" "+"withdrawn.");
        }
        else{
            System.out.println("Insufficient Balance.");
        }
    }

    void display(){
        System.out.println("Account number:"+ accountno);
        System.out.println("Account Name:"+ accountholder);
        System.out.println("Current Amount:"+ balance);
    }

    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);

        BankAccount account=new BankAccount("ASSBNK123","Anu",5000);

        int n;
        do{
        System.out.println("Choose your Option--> 1.Deposit  2.Withdrawal  3.Details 4.exit");
        n= obj.nextInt();

        double amount;
        switch(n){
            case 1: System.out.println("Enter the Deposit Amount:");
                    amount=obj.nextDouble();
                    account.deposit(amount);
                    break;
            case 2: System.out.println("Enter the withdrawal amount:");
                    amount=obj.nextDouble();
                    account.withdraw(amount);
                    break;
            case 3: account.display();
                    break;
            case 4:System.out.println("Exited..");
                    break;

            default: System.out.println("Invalid Option.");
                    break;

        }
    } while(n!=4);
    obj.close(); 
}       
    
}
