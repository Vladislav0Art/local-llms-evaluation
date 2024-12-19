package org.jsoup.parser;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Tag tag = new TagImpl("p", false);
        assertTrue(tag.isBlock());

        String tagName = "span";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertTrue(valueOfTag.isBlock());

        Tag setSelfClosing = tag.setSelfClosing();
        Tag selfClosingTag = new TagImpl("div", true);
        assertTrue(setSelfClosing.equals(selfClosingTag));
    }

}