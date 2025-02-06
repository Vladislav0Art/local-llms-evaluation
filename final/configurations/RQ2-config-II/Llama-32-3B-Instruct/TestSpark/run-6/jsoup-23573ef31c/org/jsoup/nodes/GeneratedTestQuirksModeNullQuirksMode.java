package org.jsoup.nodes;

public class GeneratedTestQuirksModeNullQuirksMode {

    @Test
    public void testQuirksModeNullQuirksMode() {
        QuirksMode quirksMode = null;
        Document document = new Document("");
        try {
            document.quirksMode(quirksMode);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}