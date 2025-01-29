package org.jsoup.nodes;

public class GeneratedTestTextContent {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testTextContent() {
        String text = "<p>This is an example paragraph</p>";
        document.text(text);
        assertEquals(text, document.text(""));
    }

}