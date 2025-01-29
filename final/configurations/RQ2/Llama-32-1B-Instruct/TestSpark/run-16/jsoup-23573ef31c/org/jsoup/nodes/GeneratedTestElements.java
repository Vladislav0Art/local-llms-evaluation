package org.jsoup.nodes;

public class GeneratedTestElements {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testElements() {
        Elements elements = document.body().elements();
        assertEquals(0, elements.size());
    }

}