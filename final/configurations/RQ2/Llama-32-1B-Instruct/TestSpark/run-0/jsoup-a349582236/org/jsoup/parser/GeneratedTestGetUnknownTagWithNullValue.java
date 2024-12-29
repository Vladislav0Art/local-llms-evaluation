package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetUnknownTagWithNullValue {

    @Test
    public void testGetUnknownTagWithNullValue() {
        Tag tag = new Tag("div");
        try {
            assertEquals(NullPointerException.class, tag.getUnknownTag());
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}