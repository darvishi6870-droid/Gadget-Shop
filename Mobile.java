public class Mobile extends Gadget {
    private int credit;

    public Mobile(String model, double price, int weight, String size, int credit) {
        super(model, price, weight, size);
        this.credit = credit;
    }

    public int getCredit() { return credit; }

    public void addCredit(int amount) {
        if (amount > 0) credit += amount;
        else System.out.println("Error: Enter a positive amount of credit.");
    }

    public void makeCall(String phoneNumber, int duration) {
        if (duration <= 0) {
            System.out.println("Error: Duration must be positive.");
            return;
        }
        if (credit >= duration) {
            System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
            credit -= duration;
            System.out.println("Remaining credit: " + credit);
        } else {
            System.out.println("Error: Insufficient credit to make the call.");
        }
    }

    public void display() {
        super.display();
        System.out.println("Credit: " + credit);
    }

    public String toString() {
        return "Mobile -> " + super.toString() + " | credit=" + credit;
    }
}