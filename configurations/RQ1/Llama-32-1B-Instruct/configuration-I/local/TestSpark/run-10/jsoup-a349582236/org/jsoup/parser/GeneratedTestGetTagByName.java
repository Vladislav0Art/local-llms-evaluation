package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetTagByName {

    @Test
    public void testGetTagByName() {
        // Arrange
        String tagName = "p";

        // Act
        Tag tag = TagRegistry.getTagByName(tagName);

        // Assert
        Validate.notNull(tag);
    }

}