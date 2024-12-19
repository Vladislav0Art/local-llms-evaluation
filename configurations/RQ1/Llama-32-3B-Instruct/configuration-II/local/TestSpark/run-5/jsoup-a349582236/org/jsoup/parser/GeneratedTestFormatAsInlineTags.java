package org.jsoup.parser;

public class GeneratedTestFormatAsInlineTags {

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
    public void testFormatAsInlineTags() {
        Tag[] formatAsInlineTags = new Tag[]{"a", "span", "p"};
        for (String tag : formatAsInlineTags) {
            Tag tagObject = tags.get(tag);
            assertNotNull(tagObject);
            assertFalse(tagObject.formatAsBlock);
        }
    }

}