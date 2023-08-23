package Drive;//import Drive.Drive.AbstractDrive;

import File.*;

import java.util.*;

public class SSDDrive extends AbstractDrive implements Drive {

    public SSDDrive(int size, int speed) {
        super(size, speed);
    }

    private List<File> files = new ArrayList<>();

    @Override
    public void listFiles() {
        Collection<File> fileCollection = files.get();

        for (File file : fileCollection){
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        return files.get(Integer.parseInt(name));
    }

    @Override
    public void actualMemory() {
        System.out.println("Aktualnie zostało: " + size + "GB pamięci");
    }

    @Override
    public void addFile(JPGImageFile jpg) {
        if (files.size() <= size) {
            files.add(jpg);
            size -= jpg.getSize();
        }else {
            System.out.println("Za mało miejsca na dysku");
        }
    }

    @Override
    public void addFile(GIFImageFile gif) {
        if (files.size() <= size) {
            files.add(gif);
            size -= gif.getSize();
        }else {
            System.out.println("Za mało miejsca na dysku");
        }
    }


}
