package org.jsoup.parser;

public class GeneratedIsSelfClosing_AcceptableSelfClosingTags_ReturnsTrue {

    @Test
    public void isSelfClosing_AcceptableSelfClosingTags_ReturnsTrue() {
        assertTrue(Tag.isSelfClosing("img"));
        assertTrue(Tag.isSelfClosing("<input type='image'>"));
        assertFalse(Tag.isSelfClosing("<div></div>"));
    }

}