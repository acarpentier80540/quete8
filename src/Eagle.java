public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub

    }

    @Override
    public int ascend(int meters) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void glide() {
        // TODO Auto-generated method stub

    }

    @Override
    public int descend(int meters) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub

    }
}
