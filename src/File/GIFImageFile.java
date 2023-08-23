package File;

public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(String name, int size) {
        super(name, size);
    }



    public void showAnimation() {
        System.out.println("Wyświetlanie gifa");
    }
}
