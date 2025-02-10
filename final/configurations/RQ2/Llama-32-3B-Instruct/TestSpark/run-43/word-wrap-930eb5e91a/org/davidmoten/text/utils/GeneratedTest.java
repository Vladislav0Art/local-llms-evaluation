package org.davidmoten.text.utils;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        assertTrue(WordWrap.from(reader).isPresent());
    }

    @Test
    public void fromClasspathUtf8ResourceTest() {
        String resource = "test.resource";
        assertTrue(WordWrap.fromClasspathUtf8(resource).isPresent());
    }

    @Test
    public void fromClasspathUtf8ResourceWithCharsetTest() {
        String resource = "test.resource";
        assertTrue(WordWrap.fromClasspathUtf8(resource, StandardCharsets.UTF_8).isPresent());
    }

    @Test
    public void fromCharSequenceTest() {
        String text = "This is a test.";
        assertTrue(WordWrap.from(text).isPresent());
    }

    @Test
    public void fromUtf8InputStreamTest() throws IOException {
        byte[] data = {0x68, 0x65, 0x6c, 0x6c, 0x6f};
        InputStream in = new ByteArrayInputStream(data);
        assertTrue(WordWrap.from(in).isPresent());
    }

    @Test
    public void fromFileInputStreamTest() throws IOException {
        byte[] data = {0x68, 0x65, 0x6c, 0x6c, 0x6f};
        InputStream in = new FileInputStream(new ByteArrayInputStream(data));
        assertTrue(WordWrap.from(in).isPresent());
    }

    @Test
    public void fromStringWriterTest() {
        Writer writer = new StringWriter();
        writer.write("Hello World!");
        assertEquals("Hello World!", WordWrap.toString(writer));
    }

    @Test
    public void fromStringReaderTest() throws IOException {
        String text = "This is a test.";
        Reader reader = new StringReader(text);
        assertTrue(WordWrap.from(reader).isPresent());
    }
}

public class PublicMethods {
    public static Optional<String> from(InputStream input) {
        // implementation
    }

    public static Optional<String> from(File file) {
        // implementation
    }

    public static Optional<String> from(String text) {
        // implementation
    }

    public static Optional<String> from(Reader reader) {
        // implementation
    }

    public static String toString(Writer writer) {
        // implementation
    }
}

public class PublicClasses {
    public class WordWrap {
        public static Optional<String> from(InputStream input) {
            return Optional.of("Hello World!");
        }

        public static Optional<String> from(File file) {
            return Optional.empty();
        }

        public static Optional<String> from(String text) {
            return Optional.of(text);
        }

        public static Optional<String> from(Reader reader) {
            return Optional.of("From Reader");
        }
    }

    public class StringWrite {
        public static String toString(Writer writer) {
            StringBuilder sb = new StringBuilder();
            writer.append(sb.toString());
            return sb.toString();
        }
    }

}