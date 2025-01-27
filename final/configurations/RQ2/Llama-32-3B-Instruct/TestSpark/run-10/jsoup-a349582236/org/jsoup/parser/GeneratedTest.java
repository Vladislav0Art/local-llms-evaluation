package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public boolean isBlockElement() {
        // implement logic to check if tag is block element
        return false;
    }

    public boolean isEmpty() {
        // implement logic to check if tag has no content
        return true;
    }

    public static boolean isKnownTag(String tag) {
        // implement logic to check if known tag
        return false;
    }
}

public class GeneratedTest {

    @Mock
    private Tag tag;

    @Test
    public void valueOf_SimpleTag_ReturnsCreatedTag() {
        Tag tag = Tag.valueOf("tag");
        assertNotNull(tag);
        assertEquals("tag", tag.getName());
    }

    @Test
    public void isKnownTag_KnownSimpleTag_ReturnsTrue() {
        assertTrue(Tag.isKnownTag("tag"));
    }

}