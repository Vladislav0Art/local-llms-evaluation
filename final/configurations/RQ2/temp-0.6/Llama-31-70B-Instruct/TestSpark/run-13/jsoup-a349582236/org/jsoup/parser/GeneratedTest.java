package org.jsoup.parser;

import static org.jsoup.parser.Tag.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void valueOfTagTest() {
        // Arrange
        String tagName = "p";
        ParseSettings settings = ParseSettings.preserveCase;
        Tag tag = new Tag(tagName);
        tags.put(tagName, tag);

        // Act
        Tag actual = valueOf(tagName, settings);

        // Assert
        assertEquals(tag, actual);
    }

    @Test
    public void valueOfTagUpperCaseTest() {
        // Arrange
        String tagName = "P";
        ParseSettings settings = ParseSettings.preserveCase;
        Tag tag = new Tag(tagName);
        tags.put(tagName, tag);

        // Act
        Tag actual = valueOf(tagName, settings);

        // Assert
        assertEquals(tag, actual);
    }

}