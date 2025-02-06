package org.jsoup.nodes;

public class GeneratedTestQuirksModeValidQuirksMode {

    @Test
    public void testQuirksModeValidQuirksMode() {
        QuirksMode quirksMode = "IE6";
        Document document = new Document("");
        document.quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

}