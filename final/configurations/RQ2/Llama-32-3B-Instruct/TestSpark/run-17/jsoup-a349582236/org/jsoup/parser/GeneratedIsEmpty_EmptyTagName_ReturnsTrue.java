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
public class GeneratedIsEmpty_EmptyTagName_ReturnsTrue {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("");

        // Act and Assert
        boolean isEmpty = Tag.isEmpty();
        assertTrue(isEmpty, "Empty tagName is empty");
    }

}