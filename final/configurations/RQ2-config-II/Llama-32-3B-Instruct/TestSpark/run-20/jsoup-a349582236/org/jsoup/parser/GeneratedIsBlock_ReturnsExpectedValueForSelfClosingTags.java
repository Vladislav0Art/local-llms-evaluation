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
public class GeneratedIsBlock_ReturnsExpectedValueForSelfClosingTags {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        // No initialization needed for this test class
    }

    @Test
    public void isBlock_ReturnsExpectedValueForSelfClosingTags() {
        String tagName = "img";
        boolean expected = false;
        when(settings.isFormatAsBlock()).thenReturn(expected);
        Tag tag = Tag.valueOf(tagName, settings);
        assertFalse(tag.isBlock());
    }

}