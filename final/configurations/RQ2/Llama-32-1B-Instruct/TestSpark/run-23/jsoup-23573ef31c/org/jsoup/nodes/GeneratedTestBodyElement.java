package org.jsoup.nodes;

public class GeneratedTestBodyElement {

    @Test
    public void testBodyElement() {
        Element body = document.body();
        assertNotNull(body);
        assertEquals("<html><body></body></html>", body.outerHtml());
    }

}