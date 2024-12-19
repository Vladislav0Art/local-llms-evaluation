package org.jsoup.parser;

public class GeneratedTestInlineTags {

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
    public void testInlineTags() {
        Tag[] inlineTags = new Tag[]{"a", "span", "p"};
        for (String tag : inlineTags) {
            Tag tagObject = new Tag(tag);
            assertFalse(tagObject.isBlock);
            assertFalse(tagObject.formatAsBlock);
        }
    }

}