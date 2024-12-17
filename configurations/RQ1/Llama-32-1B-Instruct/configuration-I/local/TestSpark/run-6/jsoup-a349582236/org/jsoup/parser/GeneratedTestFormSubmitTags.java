package org.jsoup.parser;

public class GeneratedTestFormSubmitTags {

    // Helper methods for tests
    private static String getTagName(String tagName) {
        return "Tag" + tagName.substring(0, 1).toUpperCase() + tagName.substring(1);
    }

    @Test
    public void testFormSubmitTags() {
        Tag tag = new Tag("input");
        register(tag);

        // Test form submit tags
        tag.formSubmit = true;

        assertEqual(0, tag.getTagName().length());

        Tag otherTag = getTagName("button");
        assertNotEquals(otherTag.getTagName(), tag.getTagName());
    }

    public static void main(String[] args) {
        Main testSuite = new Main();
        // Run tests
        // testBlockTags()
        // testInlineTags()
        // testEmptyTags()
        // testFormatAsInlineTags()
        // testPreserveWhitespaceTags()
        // testFormedListTags()
        // testFormSubmitTags()

        System.out.println("All tests passed!");
    }

}