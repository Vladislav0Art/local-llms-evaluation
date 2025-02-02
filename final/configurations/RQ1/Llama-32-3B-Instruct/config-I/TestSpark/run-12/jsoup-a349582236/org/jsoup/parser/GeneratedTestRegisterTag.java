package org.jsoup.parser;

public class GeneratedTestRegisterTag {

    public String tagName;
    public boolean isBlock = false;
    public boolean formatAsBlock = false;
    public boolean empty = false;
    public boolean preserveWhitespace = false;
    public boolean formList = false;
    public boolean formSubmit = false;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public static Map<String, Tag> tags = new HashMap<>();
}

public class TestTag {

    @Test
    public void testRegisterTag() {
        Tag tag = new Tag("test");

        Main.registerTag(tag);

        assertTrue(TestTag.tags.containsKey(tag.tagName));
    }
}

public class Main {
    public static void registerTag(Tag tag) {
        tags.put(tag.tagName, tag);
    }

}