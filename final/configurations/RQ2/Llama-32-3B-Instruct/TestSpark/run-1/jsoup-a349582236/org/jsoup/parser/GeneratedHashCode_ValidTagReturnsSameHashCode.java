package org.jsoup.parser;

public class GeneratedHashCode_ValidTagReturnsSameHashCode {

    @Test
    public void hashCode_ValidTagReturnsSameHashCode() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag1 = Tag.valueOf(tagName, settings);
        Tag tag2 = Tag.valueOf(tagName, settings);

        // Act
        int hash1 = System.identityHashCode(tag1);
        int hash2 = System.identityHashCode(tag2);

        // Assert
        assertEquals(hash1, hash2);
    }

}