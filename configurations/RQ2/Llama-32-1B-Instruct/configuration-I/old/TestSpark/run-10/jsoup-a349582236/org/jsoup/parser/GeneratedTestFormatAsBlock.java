package org.jsoup.parser;

public class GeneratedTestFormatAsBlock {

    @Test
    public void testFormatAsBlock() {
        Tag tag = new TagImpl("p", false);
        assertFalse(tag.formatAsBlock());

        String tagName = "span";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertFalse(valueOfTag.formatAsBlock());
    }

}