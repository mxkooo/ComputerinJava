package Drive;

import File.File;
import File.GIFImageFile;
import File.JPGImageFile;

public interface Drive  {
    void listFiles();
    File findFile(String name);
    void actualMemory();

    void addFile(GIFImageFile gif);

    void addFile(JPGImageFile jpg);
}
