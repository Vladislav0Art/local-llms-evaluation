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
public class GeneratedValueOf_EmptyTagName_ReturnsUnknownTag {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void valueOf_EmptyTagName_ReturnsUnknownTag() {
        // [valueOf][EmptyTagName]Test
        String tagName = "";
        when(settings.getNames()).thenReturn(new HashMap<>());
        Tag tag = Tag.valueOf(tagName);
        assertTrue(Tag.isKnownTag(tagName));
    }

}