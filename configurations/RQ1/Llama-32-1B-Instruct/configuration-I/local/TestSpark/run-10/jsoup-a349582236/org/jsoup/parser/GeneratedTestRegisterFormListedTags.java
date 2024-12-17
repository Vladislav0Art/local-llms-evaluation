package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormListedTags {

    @Test
    public void testRegisterFormListedTags() {
        // Arrange
        String tagName = "button";
        Tag tag = new Tag(tagName);

        // Act
        Tag registryTag = TagRegistry.get(tagName);

        // Assert
        Validate.notNull(registryTag);
    }

}