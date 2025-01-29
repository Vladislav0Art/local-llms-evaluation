package org.jsoup.nodes;

public class GeneratedTestBodyElement {

    @Test
    public void testBodyElement() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Element body = document.body();
        assertNotNull(body);
        assertEquals("body", body.nodeName());
    }

}