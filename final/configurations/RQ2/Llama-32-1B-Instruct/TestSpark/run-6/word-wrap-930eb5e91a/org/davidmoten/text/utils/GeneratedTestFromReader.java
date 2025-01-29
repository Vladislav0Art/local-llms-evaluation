package org.davidmoten.text.utils;

public class GeneratedTestFromReader {

    @Test
    public void testFromReader() {
        // Test reading from reader and writing to writer
        String[] lines = {"Hello World", "Another line"};
        StringBuilder2 wordBuilder = new StringBuilder2();
        for (String s : lines) {
            wordBuilder.append(s).append("\n");
        }
        File file = new File("output.txt");
        try (FileWriter out = new FileWriter(file)) {
            out.write(wordBuilder.toString());
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }

}