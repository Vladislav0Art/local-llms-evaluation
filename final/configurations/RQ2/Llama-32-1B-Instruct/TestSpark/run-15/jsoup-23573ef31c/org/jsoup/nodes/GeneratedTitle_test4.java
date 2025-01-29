package org.jsoup.nodes;

public class GeneratedTitle_test4 {

    private Document document;

    @Before
    public void setup() {
        Document.createShell("http://example.com");
        document = new Document("http://example.com");
    }

    @Test
    public void title_test4() {
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}