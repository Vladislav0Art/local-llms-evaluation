package org.jsoup.parser;

public class GeneratedValueOf_NonEmptyString_ReturnsSameTag {

    @Test
    public void valueOf_NonEmptyString_ReturnsSameTag() {
        String name = "div";
        Tag tag = Tag.valueOf(name, new ParseSettings());
        assertEquals(tag.getName(), name);
    }

}