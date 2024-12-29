package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestSetUnknownTagWithNullValue {

    @Test
    public void testSetUnknownTagWithNullValue() {
        Tag tag = new Tag("div");
        try {
            tag.setUnknownTag(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}