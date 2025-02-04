package org.jsoup.nodes;

public class GeneratedTestQuirksMode {

    @Test
    public void testQuirksMode() {
        Document document = new Document();
        Assert.assertEquals(QuirksMode.noQuirks, document.quirksMode());
        document.quirksMode(QuirksMode.noQuirks);
        Assert.assertEquals(QuirksMode.noQuirks, document.quirksMode());
        document.quirksMode(QuirksMode.quirks);
        Assert.assertEquals(QuirksMode.quirks, document.quirksMode());
    }

}