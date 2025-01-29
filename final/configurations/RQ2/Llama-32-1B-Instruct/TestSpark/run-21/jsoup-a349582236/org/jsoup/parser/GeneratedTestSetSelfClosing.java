package org.jsoup.parser;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        Tag originalTag = org.jsoup.parser.Tag.valueOf("div").setSelfClosing();
        assertFalse(originalTag.isBlock());
        assertTrue(originalTag.isInline());
        org.jsoup.parser.Tag.newBuilder().setName("img").setSelfClosing().apply(originalTag);
        assertTrue(originalTag.isBlock());
    }

}