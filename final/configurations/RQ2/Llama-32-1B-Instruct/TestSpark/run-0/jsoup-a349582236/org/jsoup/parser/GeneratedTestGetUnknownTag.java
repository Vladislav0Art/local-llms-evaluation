package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetUnknownTag {

    @Test
    public void testGetUnknownTag() {
        Tag tag = new Tag("div", new ParseSettings());
        try {
            assertEquals("unknownTagName", tag.getUnknownTag());
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}