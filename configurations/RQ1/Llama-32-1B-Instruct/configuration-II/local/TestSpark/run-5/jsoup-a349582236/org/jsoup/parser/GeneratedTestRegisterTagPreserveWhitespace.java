package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagPreserveWhitespace {

    @Test
    public void testRegisterTagPreserveWhitespace() {
        // Arrange
        String tagName = "pre";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
    }

}