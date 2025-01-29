package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTest {

    public static Writer from(Reader reader, boolean close) {
        return new WordWrap().from(reader, close);
    }

    @Test
    public void testFromReader() throws IOException {
        String result = from(new InputStreamReader("Hello World", StandardCharsets.UTF_8));
        assertEquals("Hello World", result);
    }

    @Test
    public void testFromClasspathUtf8() throws IOException {
        Writer result = fromClasspath();
        assertEquals("Hello World", result.toString());
    }

    private static Writer fromClasspath() {
        return new WordWrap().from(System.in, System.out);
    }

    @Test
    public void testFromFile() throws IOException {
        String[] lines = {"Hello World"};
        String result = fromLines(lines);
        assertEquals("Hello World", result);
    }

    private static Writer fromLines(String... lines) {
        return new WordWrap().from(lines, System.out);
    }

    @Test
    public void testFromFileWithSpaceBetweenWords() throws IOException {
        String[] lines = {"Hello  World"};
        String result = fromLines(lines);
        assertEquals("Hello   World", result);
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

    @Test
    public void testFromFileWithTabsBetweenWords() throws IOException {
        String[] lines = {"Hello\tWorld"};
        Writer result = fromLines(lines);
        assertEquals("Hello\tWorld", result.toString());
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

    @Test
    public void testFromFileWithSpacesBetweenWords() throws IOException {
        String[] lines = {"Hello   World"};
        Writer result = fromLines(lines);
        assertEquals("Hello     World", result.toString());
    }

}