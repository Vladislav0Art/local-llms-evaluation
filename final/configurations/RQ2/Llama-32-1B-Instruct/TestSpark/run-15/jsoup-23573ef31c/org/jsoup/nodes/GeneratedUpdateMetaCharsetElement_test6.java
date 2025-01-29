package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElement_test6 {

    private Document document;

    @Before
    public void setup() {
        Document.createShell("http://example.com");
        document = new Document("http://example.com");
    }

    @Test
    public void updateMetaCharsetElement_test6() {
        document.updateMetaCharsetElement(true);
        assertEquals(true, document.updateMetaCharsetElement());
        document.updateMetaCharsetElement(false);
        assertEquals(false, document.updateMetaCharsetElement());
    }
}

class DocumentExpectation extends AbstractDocumentExpectation {

    private final Document document;

    public DocumentExpectation(Document document) {
        this.document = document;
    }

    @Override
    public Object expect() {
        return document.location();
    }

}