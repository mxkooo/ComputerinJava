package Drive;

import File.File;
import File.GIFImageFile;
import File.JPGImageFile;
import File.MP3MusicFile;
import File.MP4VideoFile;

public interface Drive  {
    void listFiles();
    File findFile(String name);
    void actualMemory();

    void addFile(GIFImageFile gif);

    void addFile(JPGImageFile jpg);
    void addFile(MP3MusicFile mp3);
    void addFile(MP4VideoFile mp4);
}
