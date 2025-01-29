package org.jsoup.nodes;

public class GeneratedTestBodyElement {

    @Test
    public void testBodyElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        Element body = document.body();
        assertNotNull(body);
        assertEquals("html", body.nodeName());
    }

}