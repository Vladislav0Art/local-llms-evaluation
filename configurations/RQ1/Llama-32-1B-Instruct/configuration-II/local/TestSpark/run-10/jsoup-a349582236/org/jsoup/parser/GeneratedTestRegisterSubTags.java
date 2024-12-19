package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestRegisterSubTags {

    @Test
    public void testRegisterSubTags() {
        // Create a subtag
        Tag subTag = new Tag(".sub");

        // Register the subtag
        register(subTag);

        // Validate that it's registered and has its own content
        assertEquals(1, tags.size());
        assertEquals("sub", tags.get(subTag.tagName).getContent()[0]);
    }

}