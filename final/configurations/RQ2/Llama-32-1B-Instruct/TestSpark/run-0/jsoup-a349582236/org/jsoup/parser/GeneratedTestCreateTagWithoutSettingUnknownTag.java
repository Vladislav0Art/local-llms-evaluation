package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagWithoutSettingUnknownTag {

    @Test
    public void testCreateTagWithoutSettingUnknownTag() {
        Tag tag = new Tag("div");
        try {
            assertEquals("", tag.getUnknownTag());
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Output: Incompatible types: unexpected return value
        }
    }

}