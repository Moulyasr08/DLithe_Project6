import java.util.Scanner;
public class BUSTicketVendingMachine {
	    private static int ticketsSold = 0;
	    private static int amountCollected = 0;
	    private static int pin = 1234;
	    private static final int TICKET_PRICE = 50;
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.print("Enter your PIN: ");
	            int enteredPin = scanner.nextInt();
	            if (enteredPin == pin) {
	                System.out.println("1. Ticket Issue");
	                System.out.println("2. Balance Collected");
	                System.out.println("3. Number of Tickets Sold");
	                System.out.println("4. PIN Change");
	                System.out.print("Choose an option: ");
	                int choice = scanner.nextInt();
	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter the number of tickets to buy: ");
	                        int numberOfTickets = scanner.nextInt();
	                        if (numberOfTickets > 0) {
	                            int totalCost = numberOfTickets * TICKET_PRICE;
	                            if (numberOfTickets >= 10) {
	                                totalCost = (int) (totalCost * 0.9); 
	                                System.out.println("10% discount applied.");
	                            }
	                            ticketsSold += numberOfTickets;
	                            amountCollected += totalCost;
	                            System.out.println("Tickets issued successfully. Total cost: Rs." + totalCost);
	                        } else {
	                            System.out.println("Invalid number of tickets.");
	                        }
	                        break;

	                    case 2:
	                        System.out.println("Total balance collected: Rs." + amountCollected);
	                        break;

	                    case 3:
	                        System.out.println("Total number of tickets sold: " + ticketsSold);
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

	                System.out.print("Do you want to continue? (yes/no): ");
	                scanner.nextLine();
	                String continueChoice = scanner.nextLine();
	                if (!continueChoice.equalsIgnoreCase("yes")) {
	                    break;
	                }
	            } else {
	                System.out.println("Incorrect PIN. Try again.");
	            }
	        }
	        System.out.println("Thank you for using the Bus Ticket Vending Machine.");
	    }
	}




