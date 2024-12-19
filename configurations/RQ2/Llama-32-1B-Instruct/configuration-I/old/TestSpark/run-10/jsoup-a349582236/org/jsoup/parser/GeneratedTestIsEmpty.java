package org.jsoup.parser;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Tag tag = new TagImpl("div", false);
        assertFalse(tag.isEmpty());

        String tagName = "span";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertFalse(valueOfTag.isEmpty());
    }

}