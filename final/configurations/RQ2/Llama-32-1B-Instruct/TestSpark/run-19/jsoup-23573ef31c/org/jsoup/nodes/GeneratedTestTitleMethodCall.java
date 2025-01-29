package org.jsoup.nodes;

public class GeneratedTestTitleMethodCall {

    @Test
    public void testTitleMethodCall() {
        Document document = new Document("https://example.com");
        document.title("newTitle");
        assertEquals("newTitle", document.title());
    }

}