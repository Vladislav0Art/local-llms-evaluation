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
public class GeneratedIsEmpty_EmptyTagsIsEmpty {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isEmpty_EmptyTagsIsEmpty() {
        // [isEmpty][EmptyTag]Test
        String name = "";
        when(settings.getNames()).thenReturn(new HashMap<>());
        Tag tag = new Tag(name, settings);
        assertTrue(tag.isEmpty());
    }

}