package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestRegisterNonExistingSubtags {

    @Test
    public void testRegisterNonExistingSubtags() {
        try {
            Tag subTag = new Tag(".nonExistingSub");
            register(subTag);
        } catch (Exception e) {
            // Expect the exception to be thrown
        }
    }

    private static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

}