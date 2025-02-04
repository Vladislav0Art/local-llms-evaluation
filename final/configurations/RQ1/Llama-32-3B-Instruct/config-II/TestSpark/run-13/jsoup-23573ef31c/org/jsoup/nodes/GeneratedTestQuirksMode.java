package org.jsoup.nodes;

public class GeneratedTestQuirksMode {

    @Test
    public void testQuirksMode() {
        Document document = new Document();
        document.quirksMode(QuirksMode.noQuirks);
        assertEquals(QuirksMode.noQuirks, document.quirksMode());
    }

}