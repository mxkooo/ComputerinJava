package ComputerParts;

public class Processor {
    private double ghz;
    private int cache;
    private String socketType;

    public Processor(double ghz, int cache, String socketType) {
        this.ghz = ghz;
        this.cache = cache;
        this.socketType = socketType;
    }



    public double getGhz() {
        return ghz;
    }

    public int getCache() {
        return cache;
    }

    public String getSocketType() {
        return socketType;
    }
}
