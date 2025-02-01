package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        // Arrange
        String blockTag = "div";
        Tag tag = Tag.valueOf(blockTag);

        // Act
        boolean result = tag.formatAsBlock();

        // Assert
        assertThat(result).isTrue();
    }

}