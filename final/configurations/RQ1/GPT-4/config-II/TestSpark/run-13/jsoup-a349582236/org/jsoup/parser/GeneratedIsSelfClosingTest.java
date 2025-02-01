package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsSelfClosingTest {

    @Test
    public void isSelfClosingTest() {
        // Arrange
        String selfClosingTag = "br";
        Tag tag = Tag.valueOf(selfClosingTag);

        // Act
        boolean result = tag.isSelfClosing();

        // Assert
        assertThat(result).isTrue();
    }

}