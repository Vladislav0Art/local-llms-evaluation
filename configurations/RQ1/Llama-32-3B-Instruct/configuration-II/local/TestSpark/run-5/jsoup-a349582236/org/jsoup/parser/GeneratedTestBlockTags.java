package org.jsoup.parser;

public class GeneratedTestBlockTags {

    public String tagName;
    public boolean isBlock;
    public boolean formatAsBlock;
    public boolean preserveWhitespace;
    public boolean formList;
    public boolean formSubmit;

    public Tag(String tagName) {
        this.tagName = tagName;
        this.isBlock = false;
        this.formatAsBlock = false;
        this.preserveWhitespace = false;
        this.formList = false;
        this.formSubmit = false;
    }
}

public class TestTag {

    @Test
    public void testBlockTags() {
        Tag[] blockTags = new Tag[]{"p", "h1", "h2"};
        for (String tag : blockTags) {
            Tag tagObject = new Tag(tag);
            assertTrue(tagObject.isBlock);
        }
    }

}