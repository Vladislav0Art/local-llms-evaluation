package org.jsoup.parser;

public class GeneratedTestFormSubmitTag {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testFormSubmitTag() {
        // Test that the formSubmit flag is correctly set for submit tags
        register(new Tag("input"));
        register(new Tag("textarea"));

        assert !tags.get("input").formSubmit;
        assert !tags.get("textarea").formSubmit;

        Tag tag = new Tag("input");
        tag.formSubmit = true;
        assertTrue(tags.containsKey(tag.tagName));
    }

}