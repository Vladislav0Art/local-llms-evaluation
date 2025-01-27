package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public boolean isKnownTag(String tag) {
        return true; // for testing purposes only
    }
}

public class TestSpark {

    @Test
    public void valueOf_EmptyString_ReturnsEmptyTag() {
        Tag tag = Tag.valueOf("", null);
        assertNotNull(tag);
        assertEquals("", tag.getName());
    }

}