package net.revelc.code.formatter.css;

public class GeneratedTestCssFormatter {

    @Test
    public void testCssFormatter() {
        // Given
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        LineEnding ending = LineEnding.LF;

        // When
        // Then
        assertEquals("expected output", "actual output");
    }

    public class ConfigurationSource {
        private String value;

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum LineEnding {
        CRLF("\r\n"),
        LF("\n");

        private final String representation;

        LineEnding(String representation) {
            this.representation = representation;
        }

        public String getRepresentation() {
            return representation;
        }
    }

    public class HashMap<K, V> extends java.util.HashMap<K, V> {
        public HashMap() {
        }
    }

}