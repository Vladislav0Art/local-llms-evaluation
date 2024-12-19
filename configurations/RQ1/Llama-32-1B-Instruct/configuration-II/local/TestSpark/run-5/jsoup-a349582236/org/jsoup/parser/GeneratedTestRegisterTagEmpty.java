package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagEmpty {

    @Test
    public void testRegisterTagEmpty() {
        // Arrange
        String tagName = "meta";
        TagManager tagManager = new TagManager();

        // Act and Assert
        Tag tag = tags.get(tagName);
        Validate.notNull(tag);

        // Assert
        assert tag.empty;
    }

}