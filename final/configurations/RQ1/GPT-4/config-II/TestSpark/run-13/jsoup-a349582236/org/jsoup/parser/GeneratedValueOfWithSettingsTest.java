package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        // Arrange
        String nameTag = "P";
        ParseSettings parseSettings = ParseSettings.htmlDefault;

        // Act
        Tag result = Tag.valueOf(nameTag, parseSettings);

        // Assert
        assertThat(result.getName()).isEqualTo(nameTag.toLowerCase());
    }

}