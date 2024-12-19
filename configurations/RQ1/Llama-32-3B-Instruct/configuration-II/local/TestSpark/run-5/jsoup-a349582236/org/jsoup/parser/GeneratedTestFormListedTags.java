package org.jsoup.parser;

public class GeneratedTestFormListedTags {

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
    public void testFormListedTags() {
        Tag[] formListedTags = new Tag[]{"button", "input", "select"};
        for (String tag : formListedTags) {
            Tag tagObject = tags.get(tag);
            assertNotNull(tagObject);
            assertTrue(tagObject.formList);
        }
    }

}