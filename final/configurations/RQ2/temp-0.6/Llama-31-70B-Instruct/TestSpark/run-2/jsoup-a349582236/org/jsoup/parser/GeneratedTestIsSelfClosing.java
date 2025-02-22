package org.jsoup.parser;

public class GeneratedTestIsSelfClosing {

    @Test
    public void testIsSelfClosing() {
        assertTrue(Tag.valueOf("img").isSelfClosing());
        assertFalse(Tag.valueOf("p").isSelfClosing());
    }

}