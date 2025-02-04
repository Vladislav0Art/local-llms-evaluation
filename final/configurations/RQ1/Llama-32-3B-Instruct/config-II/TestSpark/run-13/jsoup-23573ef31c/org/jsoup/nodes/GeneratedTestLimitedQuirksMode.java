package org.jsoup.nodes;

public class GeneratedTestLimitedQuirksMode {

    @Test
    public void testLimitedQuirksMode() {
        Document document = new Document();
        document.quirksMode(QuirksMode.limitedQuirks);
        assertEquals(QuirksMode.limitedQuirks, document.quirksMode());
    }
}

}