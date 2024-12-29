package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedValueOf {

    @Test
    public void valueOf() {
        String tagName = "div";
        ParseSettings settings = mock(ParseSettings.class);
        when(settings.normalizeTagNames()).thenReturn(true);

        Tag expectedTag = mock(Tag.class);
        when(expectedTag.getName()).thenReturn("div");

        Tag actualTag = Tag.valueOf(tagName, settings);
        assertThat(actualTag, is(expectedTag));
    }

}