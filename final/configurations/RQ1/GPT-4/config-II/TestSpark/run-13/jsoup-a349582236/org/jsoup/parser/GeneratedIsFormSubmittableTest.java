package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsFormSubmittableTest {

    @Test
    public void isFormSubmittableTest() {
        // Arrange
        String formSubmittableTag = "input";
        Tag tag = Tag.valueOf(formSubmittableTag);

        // Act
        boolean result = tag.isFormSubmittable();

        // Assert
        assertThat(result).isTrue();
    }

}