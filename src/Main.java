import ComputerParts.Processor;
import Drive.Drive;
import Drive.HDDDrive;
import File.*;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gif = new GIFImageFile("nazwa1.gif", 1);
        JPGImageFile jpg = new JPGImageFile("nazwa1.jpg", 2,80 );
        MP3MusicFile mp3 = new MP3MusicFile("plik.mp3", 99, "Marilyn Manson", "Broken Needle", 100);
        MP4VideoFile mp4 = new MP4VideoFile("plik.mp3", 8, "Shrek", 2.5, 100);
        Processor ryzen = new Processor(3.6, 16, "AM4");

        Drive drive = new HDDDrive(512, 3000);


        drive.actualMemory();
        drive.addFile(gif);
        drive.addFile(jpg);
//        drive.addFile(mp3);
//        System.out.println("----------");
        drive.actualMemory();


        drive.actualMemory();
        drive.addFile(mp3);
        drive.addFile(mp4);
        drive.actualMemory();
        drive.listFiles();

    }
}
