package org.jsoup.parser;

public class GeneratedTestFormatAsInlineTag {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testFormatAsInlineTag() {
        // Test that the formatAsBlock flag is correctly set for inline tags
        register(new Tag("span"));
        register(new Tag("input"));

        assert !tags.get("span").formatAsBlock;
        assert !tags.get("input").formatAsBlock;

        Tag tag = new Tag("span");
        tag.formatAsBlock = true;
        assertTrue(tags.containsKey(tag.tagName));
    }

}