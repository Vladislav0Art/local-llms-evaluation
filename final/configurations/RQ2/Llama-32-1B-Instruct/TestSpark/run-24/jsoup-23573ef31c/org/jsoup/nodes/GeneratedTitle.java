package org.jsoup.nodes;

public class GeneratedTitle {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void title() throws Exception {
        Document doc = createDocument(BASE_URI);
        String title = "Example Title";
        doc.title(title);
        assertEquals(title, doc.title());
    }

}