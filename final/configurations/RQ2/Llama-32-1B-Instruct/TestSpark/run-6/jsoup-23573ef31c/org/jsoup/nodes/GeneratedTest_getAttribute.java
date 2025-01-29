package org.jsoup.nodes;

public class GeneratedTest_getAttribute {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_getAttribute() {
        Document document = new Document(BASE_URI);
        element = document.createElement(TAG);
        assertEquals("", element.getAttribute("href"));
    }

}