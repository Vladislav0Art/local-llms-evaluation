package org.jsoup.nodes;

public class GeneratedTestLimitedQuirksMode {

    @Test
    public void testLimitedQuirksMode() {
        QuirksMode quirksMode = new QuirksMode();
        LimitedQuirks limitedQuirks = new LimitedQuirks();
        Object quirksmode = quirksMode.quirksmode(limitedQuirks);
        assertEquals(LimitedQuirks.class, quirksmode);
    }

}