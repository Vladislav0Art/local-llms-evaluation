package org.jsoup.parser;

public class GeneratedNormalName_WhitespacePresentInTagName_RestoresTagsOriginalName {

    @Test
    public void normalName_WhitespacePresentInTagName_RestoresTagsOriginalName() {
        // Arrange
        String tagName = "   div   ";
        ParseSettings settings = new ParseSettings();

        // Act
        String normalName = Tag.valueOf(tagName, settings).normalName();
        assertEquals("div", normalName);
    }

}