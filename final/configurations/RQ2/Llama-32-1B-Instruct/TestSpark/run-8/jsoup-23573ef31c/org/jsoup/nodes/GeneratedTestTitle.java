package org.jsoup.nodes;

public class GeneratedTestTitle {

    @Test
    public void testTitle() throws Exception {
        String baseUri = "http://example.com";
        Document document = new DocumentDocument(baseUri);
        assertEquals("Test Title", document.title());
    }

}