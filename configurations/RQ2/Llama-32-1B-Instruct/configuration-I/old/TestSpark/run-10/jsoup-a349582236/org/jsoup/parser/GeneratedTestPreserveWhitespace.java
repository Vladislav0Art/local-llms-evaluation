package org.jsoup.parser;

public class GeneratedTestPreserveWhitespace {

    @Test
    public void testPreserveWhitespace() {
        Tag tag = new TagImpl("p", true);
        assertEquals(true, tag.preserveWhitespace());

        String tagName = "span";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertEquals(false, valueOfTag.preserveWhitespace());
    }

}