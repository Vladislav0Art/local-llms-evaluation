package org.jsoup.nodes;

public class GeneratedTest_textSize {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_textSize() {
        Element element = new Document(BASE_URI).createElement(TAG);
        assertEquals(12, ((Text) element.getText()).getSize());
    }
}

}