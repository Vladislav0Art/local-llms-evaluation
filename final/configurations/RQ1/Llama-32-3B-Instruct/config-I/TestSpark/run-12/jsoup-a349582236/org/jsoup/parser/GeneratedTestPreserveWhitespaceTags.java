package org.jsoup.parser;

public class GeneratedTestPreserveWhitespaceTags {

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
    public void testPreserveWhitespaceTags() {
        Tag tag1 = new Tag("pre");
        Tag tag2 = new Tag("plaintext");

        assertTrue(tag1.preserveWhitespace);
        assertTrue(tag2.preserveWhitespace);

        Main.registerTag(tag1);
        Main.registerTag(tag2);

        assertEquals(0, TestTag.tags.size());
    }

}