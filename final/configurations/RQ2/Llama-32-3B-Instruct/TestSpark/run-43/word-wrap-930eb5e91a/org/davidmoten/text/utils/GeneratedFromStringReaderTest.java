package org.davidmoten.text.utils;

public class GeneratedFromStringReaderTest {

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