public class Main {
    public static void main(String[] args) {
        GIFImageFile gif = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg = new JPGImageFile("nazwa1.jpg", 200,80 );
        MP3MusicFile mp3 = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);

        Drive drive = new HDDDrive(128, 3000);
        drive.addFile(gif);
        drive.addFile(jpg);
        drive.addFile(mp3);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

    }
}