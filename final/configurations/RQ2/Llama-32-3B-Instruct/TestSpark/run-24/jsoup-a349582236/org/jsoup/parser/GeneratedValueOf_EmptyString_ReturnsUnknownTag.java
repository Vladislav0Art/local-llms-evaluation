package org.jsoup.parser;

public class GeneratedValueOf_EmptyString_ReturnsUnknownTag {

    @Test
    public void valueOf_EmptyString_ReturnsUnknownTag() {
        String result = Tag.valueOf("", new ParseSettings());
        assertTrue(Tag.isKnownTag(result.getName()));
    }

}