package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterEmptyTags {

    @Test
    public void testRegisterEmptyTags() {
        // Arrange
        String tagName1 = "";
        String tagName2 = "img";
        String tagName3 = "code";

        // Act
        Tag tag1 = new Tag(tagName1);
        Tag tag2 = new Tag(tagName2);
        Tag tag3 = new Tag(tagName3);

        // Assert
        Validate.notNull(TagRegistry.get(tagName1));
        Validate.notNull(TagRegistry.get(tagName2));
        Validate.notNull(TagRegistry.get(tagName3));
    }

}