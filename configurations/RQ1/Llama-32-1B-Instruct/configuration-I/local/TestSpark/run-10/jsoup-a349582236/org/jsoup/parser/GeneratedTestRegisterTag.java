package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTag {

    @Test
    public void testRegisterTag() {
        // Arrange
        String tagName = "p";
        Tag tag = new Tag(tagName);

        // Act
        Tag registryTag = TagRegistry.get(tagName);

        // Assert
        Validate.notNull(registryTag);
    }

}