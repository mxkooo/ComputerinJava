package USBDevices;

public class MemoryStick implements USBDevice {
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Podłączono pendrive");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("Wyjmij pendrive'a");
            return false;
        }else {
            System.out.println("Pendrive odłączony");
            return true;
        }
    }

    public void eject(){
        System.out.println("Odłączanie pendrive'a");
        ejected = true;
    }

    @Override
    public String getName() {
        return null;
    }
}
