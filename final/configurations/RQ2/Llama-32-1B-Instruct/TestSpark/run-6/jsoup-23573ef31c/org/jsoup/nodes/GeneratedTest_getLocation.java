package org.jsoup.nodes;

public class GeneratedTest_getLocation {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_getLocation() {
        Document document = new Document(BASE_URI);
        assertEquals("http://example.com", document.location());
    }

}