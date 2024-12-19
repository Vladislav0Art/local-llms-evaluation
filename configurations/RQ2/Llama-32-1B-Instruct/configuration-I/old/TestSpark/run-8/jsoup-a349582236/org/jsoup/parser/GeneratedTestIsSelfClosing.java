package org.jsoup.parser;

public class GeneratedTestIsSelfClosing {

    @Test
    public void testIsSelfClosing() {
        assertFalse(new TagImpl().isSelfClosing());
        assertTrue(SelfClosingTag.class.isAssignableFrom(TagImpl.class));
    }

}