package org.jsoup.nodes;

public class GeneratedTestCharset {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testCharset() {
        Charset charset = document.charset(Charset.forName("UTF-8"));
        assertEquals("UTF-8", charset.name());
    }

}