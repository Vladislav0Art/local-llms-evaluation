package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIsEmpty_NonEmptyTagName_ReturnsFalse {

    @Test
    public void isEmpty_NonEmptyTagName_ReturnsFalse() {
        // Arrange and Act
        String tagName = "test";
        Tag tag = new Tag(tagName);

        // Assert
        assertFalse(tag.isEmpty());
    }

}