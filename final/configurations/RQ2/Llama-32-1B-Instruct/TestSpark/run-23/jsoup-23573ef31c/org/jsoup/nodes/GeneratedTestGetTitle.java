package org.jsoup.nodes;

import org.jsoup.nodes.Document;

public class GeneratedTestGetTitle {

    public Document document() throws Exception {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void testGetTitle() {
        WebPageParser webPage = new WebPageParser(document());
        assertEquals("Example HTML Test", webPage.getDocumentTitle());
    }

}