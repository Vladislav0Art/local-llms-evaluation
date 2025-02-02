package org.jsoup.parser;

public class GeneratedTestEmptyTags {

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
    public void testEmptyTags() {
        Tag tag1 = new Tag("meta");
        Tag tag2 = new Tag("link");

        assertTrue(tag1.empty);
        assertTrue(tag2.empty);

        Main.registerTag(tag1);
        Main.registerTag(tag2);

        assertEquals(0, TestTag.tags.size());
    }

}