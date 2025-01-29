package org.jsoup.nodes;

public class GeneratedTitle_test1 {

    private Document document;

    @Before
    public void setup() {
        Document.createShell("http://example.com");
        document = new Document("http://example.com");
    }

    @Test
    public void title_test1() {
        assertEquals("Example", document.title());
        document.title("Example");
    }

}