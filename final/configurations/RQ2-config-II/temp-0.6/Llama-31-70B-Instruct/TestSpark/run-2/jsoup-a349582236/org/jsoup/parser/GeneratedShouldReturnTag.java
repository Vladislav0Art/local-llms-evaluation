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

public class GeneratedShouldReturnTag {

    private static final Tag TAG = mock(Tag.class);
    private static final ParseSettings SETTINGS = mock(ParseSettings.class);

    @Test
    public void shouldReturnTag() {
        when(SETTINGS.normalizeTag("tag")).thenReturn("tag");
        final Tag tag = Tag.valueOf("tag", SETTINGS);
        assertNotNull(tag);
    }

}