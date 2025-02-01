package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedValueOfKnownTagTest {

    @Test
    public void valueOfKnownTagTest() {
        // Arrange
        String knownTag = "p";

        // Act
        Tag result = Tag.valueOf(knownTag);

        // Assert
        assertThat(result.isKnownTag()).isTrue();
        assertThat(result.getName()).isEqualTo(knownTag);
    }

}