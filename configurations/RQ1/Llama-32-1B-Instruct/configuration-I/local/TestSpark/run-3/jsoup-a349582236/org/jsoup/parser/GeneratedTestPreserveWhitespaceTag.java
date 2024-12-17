package org.jsoup.parser;

public class GeneratedTestPreserveWhitespaceTag {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testPreserveWhitespaceTag() {
        // Test that the preserveWhitespace flag is correctly set for non-block tags
        register(new Tag("span"));
        register(new Tag("text"));

        assert !tags.get("span").preserveWhitespace;
        assert !tags.get("text").preserveWhitespace;

        Tag tag = new Tag("span");
        tag.preserveWhitespace = true;
        assertTrue(tags.containsKey(tag.tagName));
    }

}