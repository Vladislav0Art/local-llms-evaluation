package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTestReadFileContent {

    @Test
    public void testReadFileContent() throws Exception {
        String path = "test.txt";
        File file = new File(path);
        if (!file.exists()) {
            throw new RuntimeException("File does not exist: " + file);
        } else {
            try (Scanner scanner = new Scanner(file)) {
                System.out.println("File content: " + scanner.useDelimiter("\\Z").next());
                scanner.close();
            }
        }
    }

}