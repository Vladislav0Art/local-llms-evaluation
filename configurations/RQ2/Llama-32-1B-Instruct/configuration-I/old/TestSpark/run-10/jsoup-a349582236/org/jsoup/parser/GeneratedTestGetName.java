package org.jsoup.parser;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        Tag tag = new TagImpl("div", true);
        assertEquals("div", tag.getName());

        String tagName = "span";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertEquals(tagName, valueOfTag.getName());
    }

}