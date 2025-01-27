package org.jsoup.parser;

public class GeneratedTest {

    private String name;
    private boolean isBlock;
    private boolean isSelfClosing;

    public static Tag of(String name) {
        return new Tag(name);
    }

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public boolean isSelfClosing() {
        return isSelfClosing;
    }

    public void setSelfClosing(boolean selfClosing) {
        isSelfClosing = selfClosing;
    }

    public String normalName() {
        // logic for normalizing the tag name
        return "";
    }

    public boolean isInline() {
        return !isBlock;
    }
}

public class ParseSettings {
    private boolean inline;
    // other settings...

    public static ParseSettings of(ParseSettings parseSettings) {
        return new ParseSettings(parseSettings);
    }

    public ParseSettings(boolean inline) {
        this.inline = inline;
    }

    public boolean getInline() {
        return inline;
    }
}

public class TestTag {

    @Test
    public void valueOf_SimpleString_ReturnsCreatedTag() {
        Tag tag = Tag.valueOf("test");
        assertNotNull(tag);
    }

}