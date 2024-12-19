package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagFormSubmit {

    @Test
    public void testRegisterTagFormSubmit() {
        // Arrange
        String tagName = "input";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
        tag.formSubmit = true;
    }

}