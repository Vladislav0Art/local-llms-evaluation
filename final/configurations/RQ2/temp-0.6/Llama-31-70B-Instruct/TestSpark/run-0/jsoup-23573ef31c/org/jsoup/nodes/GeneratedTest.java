package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;

    @Test
    public void createDocumentTest() {
        document = new Document("http://www.example.com");
        assertNotNull(document);
    }

    @Test
    public void createShellTest() {
        document = Document.createShell("http://www.example.com");
        assertNotNull(document);
    }

    @Test
    public void locationTest() {
        document = new Document("http://www.example.com");
        assertEquals("http://www.example.com", document.location());
    }

    @Test
    public void connectionTest() {
        document = new Document("http://www.example.com");
        assertNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        document = new Document("http://www.example.com");
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        document = new Document("http://www.example.com");
        assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        document = new Document("http://www.example.com");
        assertNotNull(document.body());
    }

}