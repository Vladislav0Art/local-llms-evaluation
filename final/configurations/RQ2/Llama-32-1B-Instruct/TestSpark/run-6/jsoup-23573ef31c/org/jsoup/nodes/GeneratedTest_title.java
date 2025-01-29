package org.jsoup.nodes;

public class GeneratedTest_title {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_title() {
        Document document = new Document(BASE_URI);
        document.setTitle("Example Title");
        assertEquals("Example Title", document.title());
    }

}