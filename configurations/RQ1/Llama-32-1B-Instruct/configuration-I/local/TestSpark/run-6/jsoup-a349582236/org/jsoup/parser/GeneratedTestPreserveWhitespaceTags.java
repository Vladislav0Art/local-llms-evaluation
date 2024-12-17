package org.jsoup.parser;

public class GeneratedTestPreserveWhitespaceTags {

    // Helper methods for tests
    private static String getTagName(String tagName) {
        return "Tag" + tagName.substring(0, 1).toUpperCase() + tagName.substring(1);
    }

    @Test
    public void testPreserveWhitespaceTags() {
        Tag tag = new Tag("div");
        register(tag);

        // Test preserve whitespace tags
        tag.preserveWhitespace = true;

        assertEqual(0, tag.getTagName().length());

        Tag otherTag = getTagName("p");
        assertNotEquals(otherTag.getTagName(), tag.getTagName());
    }

}