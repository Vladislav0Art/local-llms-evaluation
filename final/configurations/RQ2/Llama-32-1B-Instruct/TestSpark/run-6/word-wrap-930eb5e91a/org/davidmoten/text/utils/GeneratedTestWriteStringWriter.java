package org.davidmoten.text.utils;

public class GeneratedTestWriteStringWriter {

    @Test
    public void testWriteStringWriter() {
        // Test writing to string writer
        String[] lines = {"Hello World", "Another line"};
        StringBuilder2 wordBuilder = new StringBuilder2();
        for (String s : lines) {
            wordBuilder.append(s).append("\n");
        }
        try (FileWriter out = new FileWriter("output.txt")) {
            out.write(wordBuilder.toString());
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }

}