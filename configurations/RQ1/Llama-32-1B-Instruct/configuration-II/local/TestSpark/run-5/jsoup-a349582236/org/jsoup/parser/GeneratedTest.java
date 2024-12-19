package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testRegisterTag() {
        // Arrange
        String tagName = "span";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act
        tagManager.register(tag);

        // Assert
        assert tag != null;
        assert !tag.isBlock;
    }

    @Test
    public void testRegisterTagBlock() {
        // Arrange
        String tagName = "p";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act
        tagManager.register(tag);

        // Assert
        assert tag != null;
        assert !tag.isBlock;
    }

    @Test
    public void testRegisterTagInline() {
        // Arrange
        String tagName = "a";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act
        tagManager.register(tag);

        // Assert
        assert tag != null;
    }

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

    @Test
    public void testRegisterTagFormatAsInline() {
        // Arrange
        String tagName = "div";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
    }

    @Test
    public void testRegisterTagPreserveWhitespace() {
        // Arrange
        String tagName = "pre";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
    }

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

    @Test
    public void testRegisterTagListed() {
        // Arrange
        String tagName = "ul";
        Tag tag = new Tag(tagName);
        TagManager tagManager = new TagManager();

        // Act and Assert
        tagManager.register(tag);

        // Assert
        assert tag != null;
        tag.formatAsBlock = true;
    }

}