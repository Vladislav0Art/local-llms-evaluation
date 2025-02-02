package org.jsoup.nodes;

public class GeneratedTestNullableXmlDeclaration {

    @Test
    public void testNullableXmlDeclaration() {
        @Nullable
        XmlDeclaration result = null;
        assertNotNull(result); // added annotation to test for nullable
        assertNull(null); // added null check
    }
}

public class Document {
    public static class OutputSettings {
        private boolean doctype;
        private boolean standalone;

        public OutputSettings(boolean doctype, boolean standalone) {
            this.doctype = doctype;
            this.standalone = standalone;
        }

        @Override
        public String toString() {
            return "doctype=" + doctype + ", standalone=" + standalone;
        }
    }
}

public class XmlDeclaration {
    private String type;

    public XmlDeclaration() {
    }

    public XmlDeclaration(String type) {
        this.type = type;
    }

    public @Nullable XmlDeclaration asXmlDeclaration() {
        return null; // added annotation to test for nullable
    }
}

public class Comment {
    private String publicId;

    public Comment(String publicId) {
        this.publicId = publicId;
    }

    public Comment(String publicId, String content) {
        this(publicId);
    }

    public Comment() {
    }

    public void outerHtmlHead(Document.OutputSettings out, int depth, Document.OutputSettings out2) {
        // implementation
    }

}