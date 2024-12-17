package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_GivenData_ReturnsTrueIfLooksLikeDeclaration {

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }

    @Nullable
    public Document outerHtmlHead(Appendable accum, int offset, Document.OutputSettings out) {
        // implementation
        return null;
    }

    public void outerHtmlTail(Appendable accum, int offset, Document.OutputSettings out) {
        // implementation
    }

    public Comment clone() {
        return new Comment(data);
    }

    @Nullable
    public XmlDeclaration asXmlDeclaration() throws IOException {
        // implementation
        return null;
    }
}

public class Document {
    public static class OutputSettings {
    }

    public void append(String str, Appendable accum) {
        // implementation
    }
}

public class XmlDeclaration extends Cloneable implements Serializable {
    private String data;

    public XmlDeclaration(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }

    public static class GeneratedTest extends org.junit.Test {

        @Test
        public void isXmlDeclaration_GivenData_ReturnsTrueIfLooksLikeDeclaration() {
            String data = "!DOCTYPE html";
            boolean result = new Comment(data).asXmlDeclaration();
            assertTrue(result);
        }

    }