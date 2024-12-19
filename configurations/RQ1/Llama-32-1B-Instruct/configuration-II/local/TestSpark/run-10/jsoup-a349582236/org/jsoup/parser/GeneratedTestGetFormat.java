package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetFormat {

    @Test
    public void testGetFormat() {
        // Create a block-level tag
        Tag tag = new Tag("div");

        // Get its format
        String format = formatAsInline(tag.tagName);

        // Check that the format is not null
        assertNotNull(format);

        // Get the original tag's format as an inline string
        String originalFormat = (String) tags.get(tag.tagName).formatAsInline();

        // Compare formats
        assertEquals(originalFormat, format);
    }

}