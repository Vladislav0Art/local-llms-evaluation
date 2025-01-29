package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTestWriteToFileContent {

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