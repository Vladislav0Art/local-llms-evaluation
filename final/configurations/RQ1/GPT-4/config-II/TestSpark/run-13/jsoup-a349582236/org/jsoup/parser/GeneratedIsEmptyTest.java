package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        // Arrange
        String emptyTag = "img";
        Tag tag = Tag.valueOf(emptyTag);

        // Act
        boolean result = tag.isEmpty();

        // Assert
        assertThat(result).isTrue();
    }

}