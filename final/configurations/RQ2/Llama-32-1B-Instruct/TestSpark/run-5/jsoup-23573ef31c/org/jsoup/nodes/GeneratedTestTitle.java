package org.jsoup.nodes;

public class GeneratedTestTitle {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testTitle() {
        assertEquals("", document.title());
        document.title("Hello World");
        assertEquals("Hello World", document.title());
    }

}