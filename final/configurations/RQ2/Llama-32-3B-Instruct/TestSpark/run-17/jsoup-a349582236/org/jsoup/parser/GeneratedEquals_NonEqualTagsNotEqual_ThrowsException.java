package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_NonEqualTagsNotEqual_ThrowsException {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void equals_NonEqualTagsNotEqual_ThrowsException() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("p");

        // Act and Assert
        try {
            Tag.tag.equals(new Tag());
            fail("Expected exception not thrown");
        } catch (AssertionError e) {
            assert (!Tag.tag.equals(new Tag()),"tag.equals(tag)");
        }
    }

}