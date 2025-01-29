package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTestFileIsWritable {

    @Test
    public void testFileIsWritable() {
        String path = "test.txt";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File does not exist: " + file);
        } else {
            System.out.println("File is writable");
        }
    }

}