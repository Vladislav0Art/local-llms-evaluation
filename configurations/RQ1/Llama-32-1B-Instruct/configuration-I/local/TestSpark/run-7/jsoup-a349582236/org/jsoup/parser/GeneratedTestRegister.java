package org.jsoup.parser;

public class GeneratedTestRegister {

    @Test
    public void testRegister() {
        // Test register method
        Tag tag = new Tag("div");
        Tag tag2 = create("span");
        register(tag);
        register(tag2);
        validateTags();
        System.out.println(tags.size());
    }

    private static void validateTags() {
        // Check if all tags have a name property
        for (Tag tag : tags.values()) {
            if (!tag.getName() != null) {
                fail("Missing name property in " + tag.getTagName());
            }
        }
    }

}