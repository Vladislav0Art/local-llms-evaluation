package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormSubmitTags {

    @Test
    public void testRegisterFormSubmitTags() {
        // Arrange
        String tagName = "input";
        Tag tag = new Tag(tagName);

        // Act
        Tag registryTag = TagRegistry.get(tagName);

        // Assert
        Validate.notNull(registryTag);
    }

}