package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testFile() {
        String path = "test.txt";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File exists: " + file);
        } else {
            System.out.println("File does not exist: " + file);
        }
    }

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

    @Test
    public void testFileIsReadable() {
        String path = "test.txt";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File does not exist: " + file);
        } else {
            System.out.println("File is readable");
        }
    }

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

    @Test
    public void testWriteToFileContent() throws Exception {
        String path = "test.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        } else {
            try (Scanner scanner = new Scanner(file)) {
                System.out.println("File content: " + scanner.useDelimiter("\\Z").next());
                scanner.close();
            }
        }

        String newContent = "New content";
        try (PrintWriter writer = new PrintWriter(new File(path))) {
            writer.print(newContent);
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

}