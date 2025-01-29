package org.jsoup.parser;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        String tagName = "span";
        Tag tag = org.jsoup.parser.Tag.valueOf(tagName);
        String expected = "span";
        String actual = tag.normalName();
        assertNotEquals(expected, actual);
    }

}