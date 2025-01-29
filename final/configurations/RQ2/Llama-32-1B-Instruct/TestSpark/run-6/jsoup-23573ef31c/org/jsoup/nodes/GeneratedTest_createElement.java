package org.jsoup.nodes;

public class GeneratedTest_createElement {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_createElement() {
        String tagName = "example";
        Document document = new Document(BASE_URI);
        Element element = document.createElement(tagName);
        assertEquals(element, document.createElement(tagName));
    }

}