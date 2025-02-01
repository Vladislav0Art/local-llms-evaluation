package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        // Arrange
        String inlineTag = "span";
        Tag tag = Tag.valueOf(inlineTag);

        // Act
        boolean result = tag.isInline();

        // Assert
        assertThat(result).isTrue();
    }

}