package org.jsoup.nodes;

public class GeneratedTestLocation_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testLocation_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        assertEquals("http://example.com", document.location());
    }

}