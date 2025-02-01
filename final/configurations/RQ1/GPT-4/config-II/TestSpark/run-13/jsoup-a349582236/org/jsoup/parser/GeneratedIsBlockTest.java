package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        // Arrange
        String blockTag = "div";
        Tag tag = Tag.valueOf(blockTag);

        // Act
        boolean result = tag.isBlock();

        // Assert
        assertThat(result).isTrue();
    }

}