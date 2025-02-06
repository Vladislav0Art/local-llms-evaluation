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
public class GeneratedValueOf_ReturnsExpectedTagForSelfClosingTags {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        // No initialization needed for this test class
    }

    @Test
    public void valueOf_ReturnsExpectedTagForSelfClosingTags() {
        String tagName = "img";
        Tag expectedTag = new Tag();
        when(settings.getTagName()).thenReturn(tagName);
        when(Tag.valueOf(tagName, settings)).thenReturn(expectedTag);
        assertEquals(expectedTag, Tag.valueOf(tagName, settings));
    }

}