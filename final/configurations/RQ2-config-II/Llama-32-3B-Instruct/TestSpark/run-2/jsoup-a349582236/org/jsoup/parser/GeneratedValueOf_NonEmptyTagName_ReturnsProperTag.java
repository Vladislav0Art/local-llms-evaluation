package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedValueOf_NonEmptyTagName_ReturnsProperTag {

    @Test
    public void valueOf_NonEmptyTagName_ReturnsProperTag() {
        // Arrange
        ParseSettings settings = new ParseSettings();

        // Act and Assert
        assertEquals(new Tag("test"), Tag.valueOf("test", settings));
    }

}