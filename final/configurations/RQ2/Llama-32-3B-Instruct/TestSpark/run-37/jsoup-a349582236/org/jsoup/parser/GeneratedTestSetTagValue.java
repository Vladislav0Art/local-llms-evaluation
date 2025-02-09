package org.jsoup.parser;

public class GeneratedTestSetTagValue {

    private String tagValue;
    private boolean selfClosing;

    public Tag(String tagValue) {
        this.tagValue = tagValue;
        this.selfClosing = false;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    public String getTagValue() {
        return tagValue;
    }
}

public class TestTag {

    @Test
    public void testSetTagValue() {
        Tag tag = new Tag("tag");
        tag.setTagValue("new-tag");
        assertEquals("new-tag", tag.getTagValue());
    }

}