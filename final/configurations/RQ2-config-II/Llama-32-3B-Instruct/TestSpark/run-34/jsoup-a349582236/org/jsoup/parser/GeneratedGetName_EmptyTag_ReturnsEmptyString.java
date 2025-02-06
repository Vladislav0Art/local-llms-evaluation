package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyTag_ReturnsEmptyString {

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        // Arrange and Act
        String tagName = "";
        String expectedName = "";

        // Assert
        assertEquals(expectedName, new Tag(tagName).getName());
    }

}