package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestFormatAsInline {

    @Test
    public void testFormatAsInline() {
        // Create an inline tag
        Tag tag = new Tag("span");

        // Format it as inline
        String formattedTag = formatAsInline(tag.tagName);
        assertEquals(formattedTag, tag.formatAsInline());

        // Get the original tag
        Object originalTagObject = tags.get(tag.tagName);

        // Check that the original tag has been updated with the formatted string
        assertEquals(formattedTag, (String) originalTagObject);
    }

}