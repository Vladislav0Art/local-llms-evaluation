package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTag {

    @Test
    public void testRegisterTag() {
        // Arrange
        String tagName = "span";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act
        tagManager.register(tag);

        // Assert
        assert tag != null;
        assert !tag.isBlock;
    }

}