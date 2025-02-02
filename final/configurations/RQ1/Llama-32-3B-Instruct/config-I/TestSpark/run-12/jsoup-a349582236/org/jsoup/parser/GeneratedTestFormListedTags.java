package org.jsoup.parser;

public class GeneratedTestFormListedTags {

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
    public void testFormListedTags() {
        Tag tag1 = new Tag("button");
        Tag tag2 = new Tag("input");

        assertTrue(tag1.formList);
        assertTrue(tag2.formList);

        Main.registerTag(tag1);
        Main.registerTag(tag2);

        assertEquals(0, TestTag.tags.size());
    }

}