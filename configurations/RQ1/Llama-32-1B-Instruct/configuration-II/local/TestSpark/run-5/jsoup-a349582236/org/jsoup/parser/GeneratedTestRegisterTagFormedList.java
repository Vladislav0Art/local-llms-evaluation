package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagFormedList {

    @Test
    public void testRegisterTagFormedList() {
        // Arrange
        String tagName = "button";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
        tag.formList = true;
    }

}