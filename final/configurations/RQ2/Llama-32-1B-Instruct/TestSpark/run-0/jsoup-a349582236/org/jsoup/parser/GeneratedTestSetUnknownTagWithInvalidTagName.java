package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestSetUnknownTagWithInvalidTagName {

    @Test
    public void testSetUnknownTagWithInvalidTagName() {
        Tag tag = new Tag("div");
        try {
            tag.setUnknownTag("invalidTagName");
            assertEquals(NullPointerException.class, tag.getUnknownTag());
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}