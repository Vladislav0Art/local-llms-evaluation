package org.jsoup.parser;

public class GeneratedIsSelfClosing_SelfClosingTag_ReturnsTrue {

    private Tag tag;

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

}