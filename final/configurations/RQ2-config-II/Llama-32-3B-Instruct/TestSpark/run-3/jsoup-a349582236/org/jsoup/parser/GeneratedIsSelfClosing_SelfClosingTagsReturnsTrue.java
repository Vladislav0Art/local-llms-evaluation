package org.jsoup.parser;

public class GeneratedIsSelfClosing_SelfClosingTagsReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTagsReturnsTrue() {
        Tag selfClosingTag = Tag.valueOf("<img src='image.jpg'>");
        assertTrue(selfClosingTag.isSelfClosing());
    }

}