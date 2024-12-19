package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagBlock {

    @Test
    public void testRegisterTagBlock() {
        // Arrange
        String tagName = "p";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act
        tagManager.register(tag);

        // Assert
        assert tag != null;
        assert !tag.isBlock;
    }

}