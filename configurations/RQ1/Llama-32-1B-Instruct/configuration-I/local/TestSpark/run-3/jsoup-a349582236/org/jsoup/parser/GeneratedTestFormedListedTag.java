package org.jsoup.parser;

public class GeneratedTestFormedListedTag {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testFormedListedTag() {
        // Test that the formList flag is correctly set for listed tags
        register(new Tag("button"));
        register(new Tag("select"));

        assert !tags.get("button").formList;
        assert !tags.get("select").formList;

        Tag tag = new Tag("button");
        tag.formList = true;
        assertTrue(tags.containsKey(tag.tagName));
    }

}