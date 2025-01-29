package org.jsoup.nodes;

public class GeneratedBodyElement {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void bodyElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("<body>", body.outerHtml());
    }

}