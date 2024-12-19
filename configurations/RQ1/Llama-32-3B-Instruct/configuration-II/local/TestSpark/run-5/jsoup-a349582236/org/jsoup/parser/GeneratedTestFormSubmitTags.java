package org.jsoup.parser;

public class GeneratedTestFormSubmitTags {

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
    public void testFormSubmitTags() {
        Tag[] formSubmitTags = new Tag[]{"input", "select"};
        for (String tag : formSubmitTags) {
            Tag tagObject = tags.get(tag);
            assertNotNull(tagObject);
            assertTrue(tagObject.formSubmit);
        }
    }
}

public class Element {
    public String tagName;
    public Tag tag;

    public Element(String tagName, Tag tag) {
        this.tagName = tagName;
        this.tag = tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

}