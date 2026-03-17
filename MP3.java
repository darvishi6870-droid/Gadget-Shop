public class MP3 extends Gadget {
    private int memory;

    public MP3(String model, double price, int weight, String size, int memory) {
        super(model, price, weight, size);
        this.memory = memory;
    }

    public int getMemory() { return memory; }

    public void downloadMusic(int downloadSize) {
        if (downloadSize <= 0) {
            System.out.println("Error: Download size must be positive.");
            return;
        }
        if (memory >= downloadSize) {
            memory -= downloadSize;
            System.out.println("Downloaded " + downloadSize);
            System.out.println("Remaining memory: " + memory);
        } else {
            System.out.println("Error: Not enough available memory.");
        }
    }

    public void deleteMusic(int sizeToDelete) {
        if (sizeToDelete <= 0) {
            System.out.println("Error: Delete size must be positive.");
            return;
        }
        memory += sizeToDelete;
        System.out.println("Deleted " + sizeToDelete);
        System.out.println("Available memory: " + memory);
    }

    public void display() {
        super.display();
        System.out.println("Memory: " + memory);
    }

    public String toString() {
        return "MP3 -> " + super.toString() + " | memory=" + memory;
    }
}