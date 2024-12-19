package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetTag {

    @Test
    public void testGetTag() {
        // Create a tag with a valid name
        Tag tag = new Tag("tag");

        // Get the tag from the map
        Object tagObject = tags.get(tag.tagName);

        // Check that the tag object is not null
        assertEquals(tag, (Tag) tagObject);
    }

}