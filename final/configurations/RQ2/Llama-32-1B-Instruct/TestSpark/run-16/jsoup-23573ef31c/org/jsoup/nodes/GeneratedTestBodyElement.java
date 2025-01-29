package org.jsoup.nodes;

public class GeneratedTestBodyElement {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testBodyElement() {
        Element body = document.body();
        assertNotNull(body);
    }

}