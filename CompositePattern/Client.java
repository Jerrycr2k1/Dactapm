package CompositePattern;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        File file1 = new FileLeaf("file 1", 10);
        File file2 = new FileLeaf("file 2", 5);
        File file3 = new FileLeaf("file 3", 12);

        List<File> files = Arrays.asList(file1, file2, file3);
        File folder = new Folder(files);
        folder.showProperty();
        System.out.println("Total Size: " + folder.totalSize());
    }
}
