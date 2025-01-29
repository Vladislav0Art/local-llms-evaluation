package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestUpdateMetaCharsetElement {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testUpdateMetaCharsetElement() {
        Document document2 = new Document(document.getLocation().replace("http://example.com", "https://test.com"));
        document.updateMetaCharsetElement(true);
        assertNotEquals(false, document2.updateMetaCharsetElement());
        List<String> tags = document2.head.getAllTagNames();
        assertEquals(1, tags.size());
    }

    public class FormElement {

        @Nullable
        public static DocumentType expectForm(String cssQuery) {
            // implementation...
            return null;
        }
    }

    public class OutputSettings {

        private static final String OUTPUT_SETTINGS_STRING = "output-settings-string";

        @Nullable
        public static OutputSettings outputSettings() {
            return new OutputSettings();
        }

        public static Document outputSettings(OutputSettings outputSettings) {
            // implementation...
            return null;
        }
    }

    public class QuirksMode {

        @Nullable
        public static QuirksMode quirksMode() {
            // implementation...
            return null;
        }

        public static QuirksMode quirksMode(QuirksMode quirksMode) {
            // implementation...
            return null;
        }
    }

}