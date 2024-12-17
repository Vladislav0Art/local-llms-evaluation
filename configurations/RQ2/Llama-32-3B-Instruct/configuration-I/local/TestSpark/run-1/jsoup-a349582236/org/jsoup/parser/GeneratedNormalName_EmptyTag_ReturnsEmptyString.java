package org.jsoup.parser;

public class GeneratedNormalName_EmptyTag_ReturnsEmptyString {

    private Tag tag;

    @Test
    public void normalName_EmptyTag_ReturnsEmptyString() {
        tag = new Tag();
        assertEquals("", tag.normalName());
    }

}