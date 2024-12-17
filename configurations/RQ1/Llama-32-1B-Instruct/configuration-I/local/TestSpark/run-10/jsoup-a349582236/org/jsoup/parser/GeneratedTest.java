package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTest {

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

    @Test
    public void testGetTagByName() {
        // Arrange
        String tagName = "p";

        // Act
        Tag tag = TagRegistry.getTagByName(tagName);

        // Assert
        Validate.notNull(tag);
    }

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

    @Test
    public void testRegisterFormatAsInlineTags() {
        // Arrange
        String tagName = "p";

        // Act
        Tag tag = new Tag(tagName);

        // Assert
        Validate.notNull(TagRegistry.get(tagName));
    }

    @Test
    public void testRegisterPreserveWhitespaceTags() {
        // Arrange
        String tagName1 = "";
        String tagName2 = "code";
        String tagName3 = "img";

        // Act
        Tag tag1 = new Tag(tagName1);
        Tag tag2 = new Tag(tagName2);
        Tag tag3 = new Tag(tagName3);

        // Assert
        Validate.notNull(TagRegistry.get(tagName1));
        Validate.notNull(TagRegistry.get(tagName2));
        Validate.notNull(TagRegistry.get(tagName3));
    }

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