package org.davidmoten.text.utils;

public class GeneratedTestWriteStringWriterToFile {

    @Test
    public void testWriteStringWriterToFile() {
        // Test writing to string writer and saving to file
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

    public static void main(String[] args) {
        TestWordWrap test = new TestWordWrap();

        // Test from reader
        test.testFromReader();

        // Test read reader
        test.testReadReader();

        // Test write string writer
        test.testWriteStringWriter();

        // Test write string writer to file
        test.testWriteStringWriterToFile();
    }
}

class StringBuilder2 {
    public void append(String s) {
        System.out.print(s + "\n");
    }

    public String toString() {
        return "";
    }

}