package org.jsoup.nodes;

public class GeneratedTest_getTagName {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_getTagName() {
        Element element = new Document(BASE_URI).createElement(TAG);
        assertEquals("example", element.getTagName());
    }

}