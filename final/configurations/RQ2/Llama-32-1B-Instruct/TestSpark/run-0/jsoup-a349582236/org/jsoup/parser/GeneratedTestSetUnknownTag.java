package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestSetUnknownTag {

    @Test
    public void testSetUnknownTag() {
        Tag tag = new Tag("div");
        try {
            tag.setUnknownTag("newTagName");
            assertEquals("unknownTagName", tag.getUnknownTag());
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}