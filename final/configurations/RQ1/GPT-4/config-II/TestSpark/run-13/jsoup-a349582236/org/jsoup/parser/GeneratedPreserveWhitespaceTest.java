package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        // Arrange
        String whitespaceTag = "pre";
        Tag tag = Tag.valueOf(whitespaceTag);

        // Act
        boolean result = tag.preserveWhitespace();

        // Assert
        assertThat(result).isTrue();
    }

}