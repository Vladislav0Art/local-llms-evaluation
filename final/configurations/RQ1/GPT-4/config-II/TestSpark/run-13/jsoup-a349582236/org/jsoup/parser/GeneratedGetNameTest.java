package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        // Arrange
        String nameTag = "p";
        Tag tag = Tag.valueOf(nameTag);

        // Act
        String result = tag.getName();

        // Assert
        assertThat(result).isEqualTo(nameTag);
    }

}