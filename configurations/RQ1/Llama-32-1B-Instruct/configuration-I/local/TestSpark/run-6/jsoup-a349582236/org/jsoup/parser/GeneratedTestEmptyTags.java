package org.jsoup.parser;

public class GeneratedTestEmptyTags {

    // Helper methods for tests
    private static String getTagName(String tagName) {
        return "Tag" + tagName.substring(0, 1).toUpperCase() + tagName.substring(1);
    }

    @Test
    public void testEmptyTags() {
        Tag tag = new Tag("meta");
        register(tag);

        // Test empty tags
        tag.empty = true;

        assertEqual(0, tag.getTagName().length());
        assertNull(tag.getTagName());
    }

}