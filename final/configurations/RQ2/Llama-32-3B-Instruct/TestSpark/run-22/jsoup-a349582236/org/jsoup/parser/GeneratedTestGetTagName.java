package org.jsoup.parser;

public class GeneratedTestGetTagName {

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
    public void testGetTagName() {
        Tag imgTag = new Tag();
        imgTag.setTagName("img");
        assertEquals("img", imgTag.getTagName());
    }

}