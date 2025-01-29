package org.jsoup.nodes;

public class GeneratedTestParser {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testParser() {
        Parser parser = document.parser();
        assertEquals(document, parser);
    }

}