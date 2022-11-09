public class Penguin extends Bird implements Swim {

    private boolean swimming;
    private int depths;

    public Penguin(String name) {
        super(name);
        this.swimming = false;
        this.depths = 0;
    }

    @Override
    public String sing() {
        return "Quack!";
    }

    public int getDepths() {
        return depths;
    }

    public boolean isSwimming() {
        return swimming;
    }

    /**
     * dives, must be on ground
     */
    @Override
    public void dive() {
        if (!this.swimming && this.depths == 0) {
            this.swimming = true;
            System.out.printf("%s dives into the water.%n", this.getName());
        }
    }

    @Override
    public int swimDown(int meters) {
        return 0;
    }

    @Override
    public int swimUp(int meters) {
        return 0;
    }

    @Override
    public void getOut() {

    }
}