import java.util.Scanner;

public class Hotel
{
    FileIO fileIO = new FileIO();

    public void HotelManagement()
    {
        fileIO.readData();
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("Welcome to the booking system");
            System.out.println("-------------------------------");
            System.out.println("1. Register guest");
            System.out.println("2. See all registered guests");
            System.out.println("3. Show all rooms");
            System.out.println("4. Show available rooms");
            System.out.println("5. Book a room");
            System.out.println("6. View all bookings");
            System.out.println("7. See menu card");
            //System.out.println("x. Order food in the room");
            System.out.println("8. Check out of room");
            System.out.println("9. Cancel reservation");
            System.out.println("10. Save and Exit \n");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    fileIO.registerGuest();
                    break;
                case 2:
                    fileIO.showAllRegisteredGuests();
                    break;
                case 3:
                    fileIO.showAllRooms();
                    break;
                case 4:
                    fileIO.showAvailableRooms();
                    break;
                case 5:
                    fileIO.bookRoom();
                    break;
                case 6:
                    fileIO.showAllBookings();
                    //fileIO.orderFood();
                    break;
                case 7:
                    fileIO.showFoodMenu();
                    break;
                case 8:
                    fileIO.checkout();
                    break;
                case 9:
                    fileIO.cancelBooking();
                    break;
                case 10:
                    fileIO.saveData();
                    System.out.println("----------------------------------");
                    System.out.println("Thank you for using our booking system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
