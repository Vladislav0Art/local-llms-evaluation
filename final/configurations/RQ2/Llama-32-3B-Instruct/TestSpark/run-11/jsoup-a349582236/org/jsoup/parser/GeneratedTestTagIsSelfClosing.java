package org.jsoup.parser;

public class GeneratedTestTagIsSelfClosing {

    private String tagName;
    private String attributeName;
    private String value;

    public Tag(String tagName, String attributeName, String value) {
        this.tagName = tagName;
        this.attributeName = attributeName;
        this.value = value;
    }

    public String getTagName() {
        return tagName;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getValue() {
        return value;
    }

    public boolean formatAsBlock() {
        return true;
    }

    public boolean isInline() {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean setSelfClosing() {
        return true;
    }
}

public class TagTest {

    @Test
    public void testTagIsSelfClosing() {
        Tag tag = new Tag("img", null, "");
        assertTrue(tag.setSelfClosing());
    }

}