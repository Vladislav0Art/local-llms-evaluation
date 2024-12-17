package org.jsoup.parser;

public class GeneratedTestBlockTags {

    // Helper methods for tests
    private static String getTagName(String tagName) {
        return "Tag" + tagName.substring(0, 1).toUpperCase() + tagName.substring(1);
    }

    @Test
    public void testBlockTags() {
        Tag tag = new Tag("div");
        register(tag);

        // Test block tags
        tag.formatAsBlock = true;
        tag.isBlock = false;

        assertNotEquals("", tag.getTagName());
        assertNotEquals(null, tag.getTagName());

        Tag otherTag = getTagName("table");
        assertNotEquals(otherTag.getTagName(), tag.getTagName());
    }

}