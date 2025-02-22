package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testIsBlock() {
        assertTrue(Tag.valueOf("div").isBlock());
        assertTrue(Tag.valueOf("p").isBlock());
        assertFalse(Tag.valueOf("span").isBlock());
    }

    @Test
    public void testIsInline() {
        assertFalse(Tag.valueOf("div").isInline());
        assertFalse(Tag.valueOf("p").isInline());
        assertTrue(Tag.valueOf("span").isInline());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(Tag.valueOf("img").isEmpty());
        assertFalse(Tag.valueOf("p").isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        assertTrue(Tag.valueOf("img").isSelfClosing());
        assertFalse(Tag.valueOf("p").isSelfClosing());
    }

    @Test
    public void testIsKnownTag() {
        assertTrue(Tag.isKnownTag("p"));
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("unknown-tag"));
    }

    @Test
    public void testPreserveWhitespace() {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
        assertFalse(Tag.valueOf("span").preserveWhitespace());
    }

    @Test
    public void testIsFormListed() {
        assertTrue(Tag.valueOf("input").isFormListed());
        assertFalse(Tag.valueOf("div").isFormListed());
    }

    @Test
    public void testIsFormSubmittable() {
        assertTrue(Tag.valueOf("input").isFormSubmittable());
        assertFalse(Tag.valueOf("div").isFormSubmittable());
    }

}