package org.jsoup.nodes;

import org.jsoup.nodes.Document;

public class GeneratedTestGetTotalFormsCount {

    public Document document() throws Exception {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void testGetTotalFormsCount() {
        WebPageParser webPage = new WebPageParser(document());
        int expectedCount = 1;
        assertEquals(expectedCount, webPage.getTotalFormsCount());
    }

}