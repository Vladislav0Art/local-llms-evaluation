package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestSetUnknownTagWithEmptyString {

    @Test
    public void testSetUnknownTagWithEmptyString() {
        Tag tag = new Tag("div");
        try {
            tag.setUnknownTag("");
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}