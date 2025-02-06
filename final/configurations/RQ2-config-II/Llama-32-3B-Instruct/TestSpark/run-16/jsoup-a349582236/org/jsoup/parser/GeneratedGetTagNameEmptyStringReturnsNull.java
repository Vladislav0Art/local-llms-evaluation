package org.jsoup.parser;

public class GeneratedGetTagNameEmptyStringReturnsNull {

    @Test
    public void getTagNameEmptyStringReturnsNull() {
        Assert.assertNull(Tag.valueOf("").getName());
    }

}