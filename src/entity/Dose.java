package entity;

public class Dose {

    private final int size;

    private int inventory;

    private final String unit;

    public Dose(int doseSize, int inventory, String unit) {
        this.size = doseSize;
        this.inventory = inventory;
        this.unit = unit;
    }


    public int getDose(){return size;}
    public String getUnit(){return unit;}
    public int getDosesRemaining(){return inventory / size;}
    public void takeDose(){this.inventory -= this.size;}
}
