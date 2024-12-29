package org.jsoup.parser;

public class GeneratedToStringIsValidTagNameReturnsSameString {

    private static final String TAGS = "img,div,span";

    @Test
    public void toStringIsValidTagNameReturnsSameString() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        String expected = tagName;

        // Act
        String result = tag.toString();

        // Assert
        assertEquals(expected, result);
    }
}

public class Tag {

    private final String name;
    private final boolean isBlock;

    public Tag(String name, boolean isBlock) {
        this.name = name;
        this.isBlock = isBlock;
    }

    public boolean isBlock() {
        return isBlock;
    }

    @Override
    public Object clone() {
        return new Tag(name, isBlock);
    }

    @Override
    public String toString() {
        return name;
    }

}