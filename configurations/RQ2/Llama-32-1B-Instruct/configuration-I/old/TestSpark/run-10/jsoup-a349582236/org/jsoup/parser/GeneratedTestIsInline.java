package org.jsoup.parser;

public class GeneratedTestIsInline {

    @Test
    public void testIsInline() {
        Tag tag = new TagImpl("span", true);
        assertTrue(tag.isInline());

        String tagName = "p";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertTrue(valueOfTag.isInline());
    }

}