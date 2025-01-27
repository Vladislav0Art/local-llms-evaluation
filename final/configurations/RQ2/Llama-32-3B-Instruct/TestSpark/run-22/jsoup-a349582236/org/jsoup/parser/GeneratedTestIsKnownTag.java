package org.jsoup.parser;

public class GeneratedTestIsKnownTag {

    private String tagName;

    public Tag() {
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public boolean isKnownTag(String tag) {
        return true; // for testing purposes only
    }

    public String getTagName() {
        return tagName;
    }
}

public class TestSpark {

    @Test
    public void testIsKnownTag() {
        Tag tag = new Tag();
        assertTrue(tag.isKnownTag("img"));
        assertFalse(tag.isKnownTag(""));
    }

}