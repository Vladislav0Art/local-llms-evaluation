package org.jsoup.parser;

public class GeneratedIsSelfClosingUnknownTagReturnsTrue {

    @Test
    public void isSelfClosingUnknownTagReturnsTrue() {
        Assert.assertTrue(Tag.valueOf("img").isSelfClosing());
    }

}