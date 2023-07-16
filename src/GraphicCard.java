public class GraphicCard {
    private int memoryRam;
    private int memorySpeed;
    private int coreTiming;
    private String memoryInterface;

    public GraphicCard(int memoryRam, int memorySpeed, int coreTiming, String memoryInterface) {
        this.memoryRam = memoryRam;
        this.memorySpeed = memorySpeed;
        this.coreTiming = coreTiming;
        this.memoryInterface = memoryInterface;
    }

    public void renderGraphics() {
        System.out.println("Rendering graphics");
    }
    public int getMemoryRam() {
        return memoryRam;
    }

    public int getMemorySpeed() {
        return memorySpeed;
    }

    public int getCoreTiming() {
        return coreTiming;
    }

    public String getMemoryInterface() {
        return memoryInterface;
    }
}
