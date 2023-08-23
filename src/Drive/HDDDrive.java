package Drive;//import Drive.Drive.AbstractDrive;

import File.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive extends AbstractDrive implements Drive {

    public HDDDrive(int size, int speed) {
        super(size, speed);
    }
    private List<File> files = new ArrayList<>();

    @Override
    public void listFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        Optional<File> foundFile = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();

        return foundFile.orElseThrow();
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
