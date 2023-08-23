package File;

public class MP4VideoFile extends AbstractVideoFile {
    public int quality;

    public MP4VideoFile(String name, int size, String title, double length, int quality) {
        super(name, size, title, length);
        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println("Oglądanie filmu");
    }

    public int getQuality() {
        return quality;
    }
}
