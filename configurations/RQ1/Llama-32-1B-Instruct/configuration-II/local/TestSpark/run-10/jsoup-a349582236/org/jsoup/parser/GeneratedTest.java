package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

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

    @Test
    public void testGetTag() {
        // Create a tag with a valid name
        Tag tag = new Tag("tag");

        // Get the tag from the map
        Object tagObject = tags.get(tag.tagName);

        // Check that the tag object is not null
        assertEquals(tag, (Tag) tagObject);
    }

    @Test
    public void testIsBlock() {
        // Create a block-level tag
        Tag tag = new Tag("div");

        // Check if it's blocked
        assertTrue(tag.isBlocked());

        // Unblock the tag
        tag.setBlocked(false);

        // Check again
        assertFalse(tag.isBlocked());
    }

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

    @Test
    public void testIsBlocked() {
        // Create a block-level tag
        Tag tag = new Tag("div");

        // Set it to be blocked
        tag.setBlocked(true);

        // Check if it's still blocked
        assertTrue(tag.isBlocked());

        // Unblock the tag
        tag.setBlocked(false);

        // Check again
        assertFalse(tag.isBlocked());
    }

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