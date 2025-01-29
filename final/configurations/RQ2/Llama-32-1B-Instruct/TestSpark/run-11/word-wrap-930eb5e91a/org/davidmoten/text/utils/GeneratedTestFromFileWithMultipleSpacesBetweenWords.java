package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestFromFileWithMultipleSpacesBetweenWords {

    public static Writer from(Reader reader, boolean close) {
        return new WordWrap().from(reader, close);
    }

    @Test
    public void testFromFileWithMultipleSpacesBetweenWords() throws IOException {
        String[] lines = {" Hello  World"};
        String result = fromLines(lines);
        assertEquals("Hello     World", result);
    }

    private static class WordWrap {

        private final Writer writer;

        public WordWrap() {
            this.writer = new java.io.BufferedWriter(new OutputStreamWriter(System.out));
        }

        @FunctionalInterface
        private interface FromFunction<T extends Reader> {
            T from(T reader) throws IOException;
        }

        public Writer from(FromFunction<T> function, boolean close) throws IOException {
            writer.write(function.apply(new InputStreamReader(String.valueOf(close ? System.in : System.out))));
            return writer;
        }
    }

}