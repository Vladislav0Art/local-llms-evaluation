package org.jsoup.parser;

public class GeneratedTestFormSubmitTags {

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
    public void testFormSubmitTags() {
        Tag tag1 = new Tag("input");
        Tag tag2 = new Tag("keygen");

        assertTrue(tag1.formSubmit);
        assertTrue(tag2.formSubmit);

        Main.registerTag(tag1);
        Main.registerTag(tag2);

        assertEquals(0, TestTag.tags.size());
    }

}