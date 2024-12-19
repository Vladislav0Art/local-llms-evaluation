package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestRegister {

    @Test
    public void testRegister() {
        // Create two tags
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");

        // Register the second tag
        register(tag2);

        // Validate that the first tag is not registered and the second tag has been registered
        assertEquals(1, tags.size());
    }

}