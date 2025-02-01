package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        // Arrange
        String formListedTag = "input";
        Tag tag = Tag.valueOf(formListedTag);

        // Act
        boolean result = tag.isFormListed();

        // Assert
        assertThat(result).isTrue();
    }

}