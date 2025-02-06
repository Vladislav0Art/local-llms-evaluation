package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_IsInvalidTagName_ReturnsNormalizedTagName {

    @Mock
    private ParseSettings settings;

    public Tag valueOf(String tagName) {
        return new Tag(tagName);
    }

    @Test
    public void normalName_IsInvalidTagName_ReturnsNormalizedTagName() {
        when(valueOf("img")).thenReturn(new Tag());
        assertEquals("Img", normalNameIsInvalidTagName());
    }

    private String normalNameIsValidTagName() {
        return valueOf("img").normalName();
    }

    private String normalNameIsInvalidTagName() {
        return Normalizer.normalize(valueOf("img").getName());
    }

}