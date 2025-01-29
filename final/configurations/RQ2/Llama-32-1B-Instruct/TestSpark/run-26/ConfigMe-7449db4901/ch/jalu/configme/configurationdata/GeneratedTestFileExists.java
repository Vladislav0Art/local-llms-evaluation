package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTestFileExists {

    @Test
    public void testFileExists() {
        String path = "test.txt";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }

}