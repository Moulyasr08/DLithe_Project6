import java.util.Scanner;	
public class ATMMachine {
    private static int balance = 10000;
	    private static int cashInMachine = 50000;
	    private static int pin = 1234;
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.print("Enter your PIN: ");
	            int enteredPin = scanner.nextInt();
	            if (enteredPin == pin) {
	                System.out.println("1. Balance Enquiry");
	                System.out.println("2. Deposit");
	                System.out.println("3. Withdraw");
	                System.out.println("4. PIN Change");
	                System.out.print("Choose an option: ");
	                int choice = scanner.nextInt();
	                switch (choice) {
	                    case 1:
	                        System.out.println("Your current balance is: Rs." + balance);
	                        break;
	                    case 2:
	                        System.out.print("Enter amount to deposit: ");
	                        int depositAmount = scanner.nextInt();
	                        if (depositAmount > 0) {
	                            balance += depositAmount;
	                            System.out.println("Deposit successful. Updated balance is: Rs." + balance);
	                        } else {
	                            System.out.println("Invalid deposit amount.");
	                        }
	                        break;
	                    case 3:
	                        System.out.print("Enter amount to withdraw: ");
	                        int withdrawAmount = scanner.nextInt();
	                        if (withdrawAmount > balance) {
	                            System.out.println("Insufficient balance.");
	                        } else if (withdrawAmount > cashInMachine) {
	                            System.out.println("Insufficient cash in the machine.");
	                        } else {
	                            balance = balance-withdrawAmount;
	                            cashInMachine = balance-withdrawAmount;
	                            System.out.println("Withdrawal successful. Updated balance is: Rs." + balance);
	                        }
	                        break;
	                    case 4:
	                        System.out.print("Enter old PIN: ");
	                        int oldPin = scanner.nextInt();
	                        if (oldPin == pin) {
	                            System.out.print("Enter new PIN: ");
	                            int newPin1 = scanner.nextInt();
	                            System.out.print("Confirm new PIN: ");
	                            int newPin2 = scanner.nextInt();
	                            if (newPin1 == newPin2) {
	                                pin = newPin1;
	                                System.out.println("PIN change successful.");
	                            } else {
	                                System.out.println("PINs do not match. Try again.");
	                            }
	                        } else {
	                            System.out.println("Incorrect old PIN.");
	                        }
	                        break;

	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	                System.out.print("Do you want to continue?: ");
	                scanner.nextLine();
	                String continueChoice = scanner.nextLine();
	                if (!continueChoice.equalsIgnoreCase("yes")) {
	                    break;
	                }
	            } else {
	                System.out.println("Incorrect PIN. Try again.");
	            }
	        }
	        scanner.close();
	        System.out.println("Thank you for using the ATM.");
	    }
	}



