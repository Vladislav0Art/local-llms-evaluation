package org.jsoup.nodes;

import org.jsoup.nodes.Document;

public class GeneratedTestGetPathToForm {

    public Document document() throws Exception {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void testGetPathToForm() {
        WebPageParser webPage = new WebPageParser(document());
        String expectedPath = "/form/example.html";
        assertEquals(expectedPath, webPage.getPathToForm());
    }

}