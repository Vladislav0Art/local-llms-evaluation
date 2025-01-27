package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("");

        // Act and Assert
        String name = Tag.valueOf("", parseSettings);
        assertEquals("", name, "" + Tag.name);
    }

    @Test
    public void normalName_SimpleTagName_ReturnsNormalName() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("div");

        // Act and Assert
        String normalName = Tag.normalName();
        assertEquals("div", normalName, "Simple tagName");
    }

    @Test
    public void isBlock_MultipleTagsReturnTrue() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("p");

        // Act and Assert
        boolean isBlock = Tag.isBlock();
        assertTrue(isBlock, "Multiple tags are block");
    }

    @Test
    public void formatAsBlock_SimpleTagFormatAsBlock_ReturnsFalse() {
        // Arrange
        when(parseSettings.formatTagsAsBlock()).thenReturn(false);

        // Act and Assert
        boolean formatAsBlock = Tag.formatAsBlock();
        assertFalse(formatAsBlock, "Simple tag formats as block");
    }

    @Test
    public void isInline_SimpleTagIsInline_ReturnsTrue() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("span");

        // Act and Assert
        boolean isInline = Tag.isInline();
        assertTrue(isInline, "Simple tag is inline");
    }

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("");

        // Act and Assert
        boolean isEmpty = Tag.isEmpty();
        assertTrue(isEmpty, "Empty tagName is empty");
    }

    @Test
    public void isSelfClosing_SelfClosingTagIsFalse_ThrowsException() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("img");

        // Act and Assert
        try {
            boolean selfClosing = Tag.isSelfClosing();
            fail("Expected exception not thrown");
        } catch (AssertionError e) {
            assertEquals(false, selfClosing, "Self-closing tag is false");
        }
    }

    @Test
    public void setSelfClosing_SelfClosingTagSetSelfClosing_ReturnsTrue() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("img");

        // Act and Assert
        boolean selfClosing = Tag.setSelfClosing();
        assertTrue(selfClosing, "setSelfClosing method returns true");
    }

    @Test
    public void clone_CloneTagReturnsNewInstance() {
        // Arrange
        Tag tag = new Tag();

        // Act and Assert
        Tag clonedTag = tag.clone();
        assertNotSame(tag, clonedTag);
    }

    @Test
    public void equals_EqualTagsEqual_ThrowsException() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("p");

        // Act and Assert
        try {
            Tag.tag.equals(Tag.tag);
            fail("Expected exception not thrown");
        } catch (AssertionError e) {
            assert (tag.equals(Tag.tag),"tag.equals(tag)");
        }
    }

    @Test
    public void equals_NonEqualTagsNotEqual_ThrowsException() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("p");

        // Act and Assert
        try {
            Tag.tag.equals(new Tag());
            fail("Expected exception not thrown");
        } catch (AssertionError e) {
            assert (!Tag.tag.equals(new Tag()),"tag.equals(tag)");
        }
    }

    @Test
    public void equals_SelfClosingTagsEqual_ReturnsTrue() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("img");

        // Act and Assert
        boolean equal = Tag.isSelfClosing();
        assertTrue(equal, "self-closing tags are equal");
    }

}