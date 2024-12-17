package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormatAsInlineTags {

    @Test
    public void testRegisterFormatAsInlineTags() {
        // Arrange
        String tagName = "p";

        // Act
        Tag tag = new Tag(tagName);

        // Assert
        Validate.notNull(TagRegistry.get(tagName));
    }

}