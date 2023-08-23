package File;

public abstract class AbstractVideoFile extends AbstractFile implements VideoFile {
    protected String title;
    protected double length;

    protected AbstractVideoFile(String name, int size, String title, double length) {
        super(name, size);

        this.title = title;
        this.length = length;
    }
    @Override
    public FileType getType() {
        return FileType.VIDEO;
    }


}
