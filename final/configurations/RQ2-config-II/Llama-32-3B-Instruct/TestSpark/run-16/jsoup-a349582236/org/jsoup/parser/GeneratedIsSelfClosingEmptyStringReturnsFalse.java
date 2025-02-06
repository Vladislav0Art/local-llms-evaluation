package org.jsoup.parser;

public class GeneratedIsSelfClosingEmptyStringReturnsFalse {

    @Test
    public void isSelfClosingEmptyStringReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("").isSelfClosing());
    }

}