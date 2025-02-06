package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIsEmpty_EmptyTagName_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        // Arrange and Act
        String tagName = "";
        Tag tag = new Tag(tagName);

        // Assert
        assertTrue(tag.isEmpty());
    }

}