package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File {
    private List<File> files = new ArrayList<>();

    public Folder(List<File> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (File file : files) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (File file : files) {
            total += file.totalSize();
        }
        return total;
    }
}
