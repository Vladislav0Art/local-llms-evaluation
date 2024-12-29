package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetUnknownTagWithEmptyString {

    @Test
    public void testGetUnknownTagWithEmptyString() {
        Tag tag = new Tag("div");
        try {
            assertEquals("", tag.getUnknownTag());
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}