package org.jsoup.parser;

public class GeneratedTestInlineTags {

    // Helper methods for tests
    private static String getTagName(String tagName) {
        return "Tag" + tagName.substring(0, 1).toUpperCase() + tagName.substring(1);
    }

    @Test
    public void testInlineTags() {
        Tag tag = new Tag("span");
        register(tag);

        // Test inline tags
        tag.formatAsBlock = false;
        tag.isBlock = true;

        assertNotEquals("", tag.getTagName());
        assertNotEquals(null, tag.getTagName());

        Tag otherTag = getTagName("img");
        assertNotEquals(otherTag.getTagName(), tag.getTagName());
    }

}