package algorithms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchForFilesInAFolder {
    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        searchFiles(new File("/Users/darasmirnova/Desktop/java"),fileList);
        for (File file: fileList) {
            System.out.println(file);
        }
    }

    private static void searchFiles(File rootFile, List<File> filesList) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, filesList);
                    } else {
                        if (file.getName().toLowerCase().endsWith("java")) {
                            filesList.add(file);
                        }
                    }
                }
            }
        }
    }
}
