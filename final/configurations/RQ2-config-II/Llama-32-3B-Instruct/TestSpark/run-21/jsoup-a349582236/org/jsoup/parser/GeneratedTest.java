package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getNameReturnsTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.valueOf(tagName).getName()).thenReturn(tagName);

        // Act
        String result = Tag.valueOf(tagName).getName();

        // Assert
        assertThat(result, is(tagName));
    }

    @Test
    public void normalNameReturnsNormalizedTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.valueOf(tagName)).thenReturn(new Tag(tagName));

        // Act
        String result = Tag.valueOf(tagName).normalName();

        // Assert
        assertThat(result, is("test"));
    }

    @Test
    public void valueOfReturnsTagForKnownTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.valueOf(tagName)).thenReturn(new Tag(tagName));
        when(Tag.isKnownTag(tagName)).thenReturn(true);

        // Act
        Tag result = Tag.valueOf(tagName);

        // Assert
        assertThat(result, is(new Tag(tagName)));
    }

    @Test
    public void valueOfReturnsNullForUnknownTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.isKnownTag(tagName)).thenReturn(false);

        // Act
        Tag result = Tag.valueOf(tagName);

        // Assert
        assertThat(result, is(null));
    }

    @Test
    public void isBlockReturnsFalseForInlineTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag("test"));
        when(Tag.isInline()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").isBlock();

        // Assert
        assertThat(result, is(false));
    }

    @Test
    public void isBlockReturnsTrueForBlockTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag("test"));
        when(Tag.isBlock()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").isBlock();

        // Assert
        assertThat(result, is(true));
    }

    @Test
    public void formatAsBlockReturnsTrueForBlockTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag("test"));
        when(Tag.isBlock()).thenReturn(true);
        when(Tag.formatAsBlock()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").formatAsBlock();

        // Assert
        assertThat(result, is(true));
    }

    @Test
    public void formatAsBlockReturnsFalseForInlineTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag("test"));
        when(Tag.isInline()).thenReturn(true);
        when(Tag.formatAsBlock()).thenReturn(false);

        // Act
        boolean result = Tag.valueOf("test").formatAsBlock();

        // Assert
        assertThat(result, is(false));
    }

    @Test
    public void isEmptyReturnsFalseForNonEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag("test"));
        when(Tag.isEmpty()).thenReturn(false);

        // Act
        boolean result = Tag.valueOf("test").isEmpty();

        // Assert
        assertThat(result, is(false));
    }

    @Test
    public void isEmptyReturnsTrueForEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag(""));
        when(Tag.isEmpty()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").isEmpty();

        // Assert
        assertThat(result, is(true));
    }

    @Test
    public void setSelfClosingReturnsTrueForEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag(""));
        when(Tag.setSelfClosing()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").setSelfClosing();

        // Assert
        assertThat(result, is(true));
    }

    @Test
    public void setSelfClosingReturnsFalseForNonEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag(""));
        when(Tag.setSelfClosing()).thenReturn(false);

        // Act
        boolean result = Tag.valueOf("test").setSelfClosing();

        // Assert
        assertThat(result, is(false));
    }

    @Test
    public void cloneReturnsNewTag() {
        // Arrange
        Tag tag = new Tag("test");
        when(Tag.clone()).thenReturn(tag);

        // Act
        Tag result = Tag.clone();

        // Assert
        assertThat(result, is(tag));
    }

}