package org.jsoup.nodes;

public class GeneratedTitleSet_test {

    @Test
    public void titleSet_test() {
        Document document = new Document("http://example.com");
        document.title("Hello World");
        assertEquals("Hello World", document.title());
    }

}