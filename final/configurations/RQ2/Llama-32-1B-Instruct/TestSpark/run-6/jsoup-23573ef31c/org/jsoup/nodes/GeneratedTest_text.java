package org.jsoup.nodes;

public class GeneratedTest_text {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_text() {
        Document document = new Document(BASE_URI);
        document.setText("Example Text");
        assertEquals(document.text("Example Text"), "Example Text");
    }

}