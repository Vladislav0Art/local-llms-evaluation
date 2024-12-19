package org.jsoup.parser;

public class GeneratedTestIsInlineTag {

    @Test
    public void testIsInlineTag() {
        assertFalse(new TagImpl().isInline());
        assertTrue(InlineTag.class.isAssignableFrom(TagImpl.class));
    }

}