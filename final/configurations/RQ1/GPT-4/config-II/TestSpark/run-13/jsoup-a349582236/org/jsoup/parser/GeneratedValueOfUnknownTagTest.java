package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedValueOfUnknownTagTest {

    @Test
    public void valueOfUnknownTagTest() {
        // Arrange
        String unknownTag = "unknown";

        // Act
        Tag result = Tag.valueOf(unknownTag);

        // Assert
        assertThat(result.isKnownTag()).isFalse();
        assertThat(result.getName()).isEqualTo(unknownTag);
    }

}