package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestSetUnknownTagNull {

    @Test
    public void testSetUnknownTagNull() {
        Tag tag = new Tag("div");
        try {
            tag.setUnknownTag(null);
            assertEquals(NullPointerException.class, tag.getUnknownTag());
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}