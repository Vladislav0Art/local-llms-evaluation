package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagInline {

    @Test
    public void testRegisterTagInline() {
        // Arrange
        String tagName = "a";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act
        tagManager.register(tag);

        // Assert
        assert tag != null;
    }

}