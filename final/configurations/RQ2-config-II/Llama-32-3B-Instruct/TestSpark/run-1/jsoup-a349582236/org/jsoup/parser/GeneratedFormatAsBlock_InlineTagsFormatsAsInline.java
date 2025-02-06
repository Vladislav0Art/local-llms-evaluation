package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFormatAsBlock_InlineTagsFormatsAsInline {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void formatAsBlock_InlineTagsFormatsAsInline() {
        // [formatAsBlock][InlineTag]Test
        boolean selfClosing = false;
        when(settings.getNames()).thenReturn(new HashMap<>());
        Tag tag = new Tag("", settings);
        assertFalse(tag.formatAsBlock());
    }

}