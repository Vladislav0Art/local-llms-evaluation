package org.jsoup.parser;

public class GeneratedTestRegisterTag {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testRegisterTag() {
        // Test that the tag name and its corresponding Tag object are registered correctly
        register(new Tag("span"));
        register(new Tag("img"));

        assert !tags.containsKey("span");
        assert !tags.containsKey("img");

        Tag tag = new Tag("span");
        assertTrue(tags.containsKey(tag.tagName));
    }

}