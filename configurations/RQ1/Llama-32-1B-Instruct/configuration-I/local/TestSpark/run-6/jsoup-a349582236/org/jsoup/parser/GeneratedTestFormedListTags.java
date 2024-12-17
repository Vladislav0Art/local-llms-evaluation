package org.jsoup.parser;

public class GeneratedTestFormedListTags {

    // Helper methods for tests
    private static String getTagName(String tagName) {
        return "Tag" + tagName.substring(0, 1).toUpperCase() + tagName.substring(1);
    }

    @Test
    public void testFormedListTags() {
        Tag tag = new Tag("ul");
        register(tag);

        // Test form listed tags
        tag.formList = true;

        assertEqual(0, tag.getTagName().length());

        Tag otherTag = getTagName("li");
        assertNotEquals(otherTag.getTagName(), tag.getTagName());
    }

}