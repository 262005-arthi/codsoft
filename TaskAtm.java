import java.util.Scanner;

class BankAccount{
    
    Scanner obj = new Scanner(System.in);
    public double balance;
    
    BankAccount(double balance){
        this.balance = balance;
    }
    
    void Deposit(){
        	System.out.println("Enter the amount to deposit");
        	int damount = obj.nextInt();
           	 balance =  balance + damount;
        	System.out.println("Your account balance is"+  balance);
    }
    
    void Withdraw(){
        	System.out.println("Enter the amount to withdraw");

        	int bamount = obj.nextInt();		
            if (balance < bamount) {
                System.out.println("Your account balance is not sufficient");
        	}
        	else {
                balance = balance - bamount;
                System.out.println("Your account balance is"+ balance);
      		}        
    }
    
    double Checkbalance(){
        return balance;
    }
}

class ATM extends BankAccount{
    ATM(double bankbalance){
        super(bankbalance);
    }
    void Menu(){
                    System.out.println("..........Welcome..........");
                    Scanner obj = new Scanner(System.in);
        			while(true) {
        				System.out.println("Enter the mode you want");
          				System.out.printf("1. Deposit  \n2. Withdraw \n3. BalanceChecking");
        				int mode = obj.nextInt();
        				switch(mode) {
        				    case 1:
                                Deposit();
            					break;

            				case 2:
                                Withdraw();
        				        break;

            				case 3:
            				    double b = Checkbalance();
        					    System.out.println("Your account balance is" + b);
        					    break;
        					
        					default:
        					    System.out.println("Invalid Number...");
        					    System.out.println("Please enter the Valid Number");
        				}
        		        System.out.println("If you want to go to main menu enter yes");
        		    	Scanner obj1 = new Scanner(System.in);
           		        String abc = obj1.nextLine();
        		        if (abc.equals("yes")) {
        		        	System.out.println("Going to main menu");
       		        }
        		        else {
                            System.out.println("Thank You for using the ATM...");
        		        	break;
        		        }
        			}            
}
}
public class TaskAtm{

	public static void main(String[] args) {
	    
	    ATM obj = new ATM(5000.00);
	    obj.Menu();
		
}
	}
