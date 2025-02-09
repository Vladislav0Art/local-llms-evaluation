package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_EmptyTagName ReturnsEmptyString {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void getName_EmptyTagName

    ReturnsEmptyString() {
        when(parseSettings.getName()).thenReturn("");
        assertEquals("", Tag.valueOf("").getName());
    }

}