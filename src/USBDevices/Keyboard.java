package USBDevices;

public class Keyboard implements USBDevice {

    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Klawiatura podłączona");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Klawiatura odłączona");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
