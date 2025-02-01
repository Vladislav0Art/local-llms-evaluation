package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        // Arrange
        String knownTag = "p";

        // Act
        boolean result = Tag.isKnownTag(knownTag);

        // Assert
        assertThat(result).isTrue();
    }

}