
public class Booking
{

    private Room room;
    private Guest guest;
    private Food food;
    private int days;
    private String startDate;
    private String endDate;

    public Booking(Room room, Guest guest, int days, String startDate, String endDate)
    {
        this.room = room;
        this.guest = guest;
        this.days = days;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getFormattedBooking()
    {
        return room.getRoomNumber()+","+guest.getName()+","+days+","+startDate+","+endDate;
    }

    public String getReceipt()
    {
        String recipt = "-------------------------------------\n";
        recipt += "\t\t\tRECEIPT\n";
        recipt += "-------------------------------------\n";
        recipt += String.format("Room number: %8s%n", room.getRoomNumber());
        recipt += String.format("Number of days: %8s%n", days);
        recipt += String.format("Start date: %20s%n", startDate);
        recipt += String.format("Slut date:  %20s%n", endDate);
        recipt += String.format("Total amount for room and food: %1s%n", String.format("%.2f", (days*room.getPrice())));//+food.getFoodPrice())));
        recipt += "-------------------------------------" + "\n";
        return recipt;
    }

    public Food getFood()
    {
        return food;
    }

    public void setFood(Food food)
    {
        this.food = food;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public int getDays()
    {
        return days;
    }

    public void setDays(int days)
    {
        this.days = days;
    }

    public Guest getGuest()
    {
        return guest;
    }

    public void setGuest(Guest guest)
    {
        this.guest = guest;
    }

    @Override
    public String toString()
    {
        return "Room number " + room.getRoomNumber() + " is booked by "+guest.getName()+
                " from " + startDate + " to " + endDate;
    }

}