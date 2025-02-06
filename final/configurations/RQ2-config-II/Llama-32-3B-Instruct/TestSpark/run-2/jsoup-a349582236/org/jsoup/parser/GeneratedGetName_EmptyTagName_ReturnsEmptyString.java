package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        // Arrange and Act
        String tagName = "";
        Tag tag = new Tag(tagName);

        // Assert
        assertEquals("", tag.getName());
    }

}