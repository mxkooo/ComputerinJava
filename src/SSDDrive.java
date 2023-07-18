//import AbstractDrive;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive extends AbstractDrive implements Drive {

    public SSDDrive(int size, int speed) {
        super(size, speed);
    }

    private Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
        if (files.size() <= size) {
            files.put(file.getName(), file);
            size += files.size();
        }else {
            System.out.println("Za mało miejsca na dysku");
        }
    }

    @Override
    public void listFiles() {
        Collection<File> fileCollection = files.values();

        for (File file : fileCollection){
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        return files.get(name);
    }



}
