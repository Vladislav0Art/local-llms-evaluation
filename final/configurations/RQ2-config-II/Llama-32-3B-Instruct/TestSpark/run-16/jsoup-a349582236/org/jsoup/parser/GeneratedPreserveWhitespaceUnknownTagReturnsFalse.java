package org.jsoup.parser;

public class GeneratedPreserveWhitespaceUnknownTagReturnsFalse {

    @Test
    public void preserveWhitespaceUnknownTagReturnsFalse() {
        Tag tag = Tag.valueOf("input");
        Assert.assertFalse(tag.preserveWhitespace());
    }

}