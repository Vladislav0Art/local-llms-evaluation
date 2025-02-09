package org.jsoup.parser;

public class GeneratedTest {

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
    public void testConstructor() {
        Tag tag = new Tag("tag");
        assertEquals("tag", tag.getTagValue());
    }

    @Test
    public void testSetTagValue() {
        Tag tag = new Tag("tag");
        tag.setTagValue("new-tag");
        assertEquals("new-tag", tag.getTagValue());
    }

    @Test
    public void testSetSelfClosing() {
        Tag tag = new Tag("tag");
        tag.setSelfClosing(true);
        assertTrue(tag.getSelfClosing());
    }

}