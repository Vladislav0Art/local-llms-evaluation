package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Tag tag;

    @Test
    public void testValueOf() {
        String tagName = "a";
        ParseSettings settings = ParseSettings.preserveCase;
        when(tag.valueOf(tagName, settings)).thenReturn(tag);
        when(tag.tagName).thenReturn(tagName);

        Tag actual = tag.valueOf(tagName, settings);
        String actualTag = actual.tagName;
        String expectedTag = tagName;

        assertEquals(expectedTag, actualTag);
    }

    @Test
    public void testValueOfWithoutSettings() {
        String tagName = "a";
        when(tag.valueOf(tagName)).thenReturn(tag);
        when(tag.tagName).thenReturn(tagName);

        Tag actual = tag.valueOf(tagName);
        String actualTag = actual.tagName;
        String expectedTag = tagName;

        assertEquals(expectedTag, actualTag);
    }

}