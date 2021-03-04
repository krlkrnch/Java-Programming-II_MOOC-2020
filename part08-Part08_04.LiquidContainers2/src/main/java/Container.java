
public class Container {

    private int liquid;
    private String name;

    public Container() {

        this.liquid = 0;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        this.liquid = this.liquid + amount;

        if (this.liquid > 100) {
            this.liquid = 100;
        }

    }

    public int contains() {
        return this.liquid;

    }

    public void remove(int amount) {
        if (amount < 0) {
            amount = 0;
        }

        this.liquid = this.liquid - amount;

        if (this.liquid < 0) {
            this.liquid = 0;
        }

    }

    public String toString() {

        return this.liquid + "/100";
    }

}
