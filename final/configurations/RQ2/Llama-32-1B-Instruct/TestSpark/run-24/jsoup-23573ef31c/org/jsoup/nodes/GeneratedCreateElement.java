package org.jsoup.nodes;

public class GeneratedCreateElement {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void createElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        Element elem = doc.createElement("input");
        assertNotNull(elem);
    }

}