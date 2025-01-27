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
public class GeneratedFormatAsBlock_SimpleTagFormatAsBlock_ReturnsFalse {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void formatAsBlock_SimpleTagFormatAsBlock_ReturnsFalse() {
        // Arrange
        when(parseSettings.formatTagsAsBlock()).thenReturn(false);

        // Act and Assert
        boolean formatAsBlock = Tag.formatAsBlock();
        assertFalse(formatAsBlock, "Simple tag formats as block");
    }

}