package org.jsoup.parser;

public class GeneratedTestFormatAsInlineTags {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testFormatAsInlineTags() {
        // Test that the formatAsBlock flag is correctly set for inline tags in formatAsInlineTag method
        register(new Tag("span"));
        register(new Tag("input"));

        assert !tags.get("span").formatAsBlock;
        assert !tags.get("input").formatAsBlock;

        Tag tag = new Tag("span");
        tag.formatAsBlock = true;
        assertTrue(tags.containsKey(tag.tagName));
    }

}