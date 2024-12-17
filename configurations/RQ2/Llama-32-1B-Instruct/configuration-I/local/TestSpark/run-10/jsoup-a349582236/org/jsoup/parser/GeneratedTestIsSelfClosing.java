package org.jsoup.parser;

public class GeneratedTestIsSelfClosing {

    @Test
    public void testIsSelfClosing() {
        Tag tag = new TagImpl("p", true);
        assertTrue(tag.isSelfClosing());

        String tagName = "div";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertFalse(valueOfTag.isSelfClosing());
    }

}