package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagListed {

    @Test
    public void testRegisterTagListed() {
        // Arrange
        String tagName = "ul";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
        tag.formatAsBlock = true;
    }

}