package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        // Arrange
        String nameTag = "P";
        Tag tag = Tag.valueOf(nameTag);

        // Act
        String result = tag.normalName();

        // Assert
        assertThat(result).isEqualTo(nameTag.toLowerCase());
    }

}