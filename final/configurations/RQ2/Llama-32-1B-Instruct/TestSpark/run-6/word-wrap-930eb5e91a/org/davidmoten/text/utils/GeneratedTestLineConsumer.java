package org.davidmoten.text.utils;

public class GeneratedTestLineConsumer {

    @Test
    public void testLineConsumer() {
        // Test reading lines from reader and writing to line builder
        StringBuilder2 wordBuilder = new StringBuilder2();
        for (String line : {"Hello", "World"}) {
            wordBuilder.append(line).append("\n");
        }
        System.out.println(wordBuilder);
    }

}

public class StringBuilder2 {

    public void append(String s) {
        // Implement appending to the builder
    }

}