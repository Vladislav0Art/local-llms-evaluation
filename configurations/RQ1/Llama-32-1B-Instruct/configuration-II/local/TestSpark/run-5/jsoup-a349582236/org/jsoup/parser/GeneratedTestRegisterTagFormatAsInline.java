package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagFormatAsInline {

    @Test
    public void testRegisterTagFormatAsInline() {
        // Arrange
        String tagName = "div";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
    }

}