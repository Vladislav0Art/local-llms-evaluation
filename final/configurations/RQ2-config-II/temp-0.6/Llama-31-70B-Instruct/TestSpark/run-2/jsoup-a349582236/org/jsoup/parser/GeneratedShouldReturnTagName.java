package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedShouldReturnTagName {

    private static final Tag TAG = mock(Tag.class);
    private static final ParseSettings SETTINGS = mock(ParseSettings.class);

    @Test
    public void shouldReturnTagName() {
        when(TAG.tagName).thenReturn("tag");
        final String tagName = TAG.getName();
        assertEquals("tag", tagName);
    }

}