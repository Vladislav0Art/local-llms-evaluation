package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetTagContent {

    @Test
    public void testGetTagContent() {
        // Create a block-level tag with no content
        Tag tag = new Tag("div");
        tag.setContent("");
        assertEquals(0, tag.getContent().length());

        // Create a block-level tag with some content
        tag = new Tag("div");
        tag.setContent("<p>Hello World!</p>");
        assertEquals(4, tag.getContent().length());
    }

}