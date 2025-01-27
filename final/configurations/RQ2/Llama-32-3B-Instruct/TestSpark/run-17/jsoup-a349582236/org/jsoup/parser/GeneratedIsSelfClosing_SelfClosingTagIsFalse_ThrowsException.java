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
public class GeneratedIsSelfClosing_SelfClosingTagIsFalse_ThrowsException {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void isSelfClosing_SelfClosingTagIsFalse_ThrowsException() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("img");

        // Act and Assert
        try {
            boolean selfClosing = Tag.isSelfClosing();
            fail("Expected exception not thrown");
        } catch (AssertionError e) {
            assertEquals(false, selfClosing, "Self-closing tag is false");
        }
    }

}