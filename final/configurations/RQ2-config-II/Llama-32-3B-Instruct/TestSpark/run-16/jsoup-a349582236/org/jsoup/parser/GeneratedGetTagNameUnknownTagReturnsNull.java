package org.jsoup.parser;

public class GeneratedGetTagNameUnknownTagReturnsNull {

    @Test
    public void getTagNameUnknownTagReturnsNull() {
        Assert.assertNull(Tag.valueOf("unknown").getName());
    }

}