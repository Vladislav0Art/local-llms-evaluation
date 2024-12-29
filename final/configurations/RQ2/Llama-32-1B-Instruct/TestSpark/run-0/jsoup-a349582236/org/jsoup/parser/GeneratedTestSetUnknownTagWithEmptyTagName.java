package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestSetUnknownTagWithEmptyTagName {

    @Test
    public void testSetUnknownTagWithEmptyTagName() {
        Tag tag = new Tag("div");
        try {
            tag.setUnknownTag("");
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}