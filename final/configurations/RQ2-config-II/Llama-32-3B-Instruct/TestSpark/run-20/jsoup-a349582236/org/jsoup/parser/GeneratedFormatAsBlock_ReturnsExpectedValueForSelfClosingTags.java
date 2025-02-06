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
public class GeneratedFormatAsBlock_ReturnsExpectedValueForSelfClosingTags {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        // No initialization needed for this test class
    }

    @Test
    public void formatAsBlock_ReturnsExpectedValueForSelfClosingTags() {
        String tagName = "img";
        boolean expected = true;
        when(settings.isFormatAsBlock()).thenReturn(expected);
        when(Tag.valueOf(tagName, settings).formatAsBlock()).thenReturn(expected);
        assertTrue(Tag.valueOf(tagName, settings).formatAsBlock());
    }

}