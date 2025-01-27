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
public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("");

        // Act and Assert
        String name = Tag.valueOf("", parseSettings);
        assertEquals("", name, "" + Tag.name);
    }

}