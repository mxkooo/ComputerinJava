import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive extends AbstractDrive implements Drive {

    public HDDDrive(int size, int speed) {
        super(size, speed);
    }
    private List<File> files = new ArrayList<>();


    @Override
    public void addFile(File file) {
        files.add(file);
    }

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
    public int checkFileSize() {
        if (files.size() <= size) {
            System.out.println("Zgrywanie pliku na dysk");
        }else {
            System.out.println("Za mało miejsca na dysku");
        }
        return size;
    }

}
