package org.jsoup.nodes;

public class GeneratedTest_clone {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_clone() {
        Document document = new Document(BASE_URI);
        Object clone = document.clone();
        assertEquals(document, (Document) clone);
    }

}