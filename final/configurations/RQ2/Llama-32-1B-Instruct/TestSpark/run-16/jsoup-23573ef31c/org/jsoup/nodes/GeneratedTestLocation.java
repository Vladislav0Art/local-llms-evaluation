package org.jsoup.nodes;

public class GeneratedTestLocation {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testLocation() {
        String location = document.location();
        assertEquals("https://example.com", location);
    }

}