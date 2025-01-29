package org.jsoup.nodes;

public class GeneratedTestElementCreation {

    @Test
    public void testElementCreation() throws Exception {
        String baseUri = "http://example.com";
        Document document = new DocumentDocument(baseUri);
        assertNotNull(document.createElement("div"));
    }
}

public class DocumentDocument extends Document {
    public DocumentDocument(String baseUri) {
        super(baseUri);
    }

}