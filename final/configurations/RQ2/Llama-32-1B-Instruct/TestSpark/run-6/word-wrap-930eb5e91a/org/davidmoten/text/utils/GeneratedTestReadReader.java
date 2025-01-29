package org.davidmoten.text.utils;

public class GeneratedTestReadReader {

    @Test
    public void testReadReader() {
        // Test reading from reader
        String input = "Hello World";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error reading from console: " + e.getMessage());
        }
    }

}