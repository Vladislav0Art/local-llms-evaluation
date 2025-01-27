package org.jsoup.parser;

public class GeneratedSetSelfClosing_SelfClosingTag_ReturnsTrue {

    @Test
    public void setSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag();
        boolean result = tag.setSelfClosing();
        assertTrue(result);
    }

}