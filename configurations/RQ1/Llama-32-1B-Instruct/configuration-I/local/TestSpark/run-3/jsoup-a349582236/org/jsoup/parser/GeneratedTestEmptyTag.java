package org.jsoup.parser;

public class GeneratedTestEmptyTag {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testEmptyTag() {
        // Test that the empty flag is correctly set for empty tags
        register(new Tag("meta"));
        register(new Tag("link"));

        assert !tags.get("meta").empty;
        assert !tags.get("link").empty;

        Tag tag = new Tag("meta");
        tag.empty = true;
        assertTrue(tags.containsKey(tag.tagName));
    }

}