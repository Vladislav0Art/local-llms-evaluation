package org.jsoup.parser;

public class GeneratedTest {

    private String name;
    private boolean isBlock = false;

    public static Tag of(String tagName) {
        return new Tag(tagName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setSelfClosing(boolean selfClosing) {
        this.isBlock = selfClosing;
        return true;
    }
}

public class TestTag {

    @Test
    public void valueOf_NoSettings_ReturnsDefaultTag() {
        ParseSettings settings = null;
        Tag tag = Tag.valueOf("tag");
        assertNotNull(tag);
    }

}