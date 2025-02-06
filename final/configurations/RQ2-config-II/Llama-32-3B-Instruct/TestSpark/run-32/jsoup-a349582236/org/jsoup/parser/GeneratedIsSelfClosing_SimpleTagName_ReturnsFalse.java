package org.jsoup.parser;

public class GeneratedIsSelfClosing_SimpleTagName_ReturnsFalse {

    @Test
    public void isSelfClosing_SimpleTagName_ReturnsFalse() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isSelfClosing());
    }

}