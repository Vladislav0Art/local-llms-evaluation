package org.jsoup.parser;

public class GeneratedTestFormatAsInlineTags {

    // Helper methods for tests
    private static String getTagName(String tagName) {
        return "Tag" + tagName.substring(0, 1).toUpperCase() + tagName.substring(1);
    }

    @Test
    public void testFormatAsInlineTags() {
        Tag tag = new Tag("p");
        register(tag);

        // Test format as inline tags
        tag.formatAsBlock = false;
        tag.isBlock = true;

        assertNotEquals("", tag.getTagName());
        assertNotEquals(null, tag.getTagName());

        Tag otherTag = getTagName("pre");
        assertNotEquals(otherTag.getTagName(), tag.getTagName());
    }

}