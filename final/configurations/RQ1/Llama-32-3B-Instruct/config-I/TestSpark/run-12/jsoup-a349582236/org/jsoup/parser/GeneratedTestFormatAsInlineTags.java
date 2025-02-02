package org.jsoup.parser;

public class GeneratedTestFormatAsInlineTags {

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
    public void testFormatAsInlineTags() {
        Tag tag1 = new Tag("p");
        Tag tag2 = new Tag("h1");

        assertFalse(tag1.formatAsBlock);
        assertFalse(tag2.formatAsBlock);

        Main.registerTag(tag1);
        Main.registerTag(tag2);

        assertEquals(0, TestTag.tags.size());
    }

}