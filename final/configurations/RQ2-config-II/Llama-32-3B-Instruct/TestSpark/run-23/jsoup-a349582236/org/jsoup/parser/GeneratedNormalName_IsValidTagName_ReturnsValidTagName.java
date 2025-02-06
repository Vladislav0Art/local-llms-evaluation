package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_IsValidTagName_ReturnsValidTagName {

    @Mock
    private ParseSettings settings;

    public Tag valueOf(String tagName) {
        return new Tag(tagName);
    }

    @Test
    public void normalName_IsValidTagName_ReturnsValidTagName() {
        when(valueOf("img")).thenReturn(new Tag());
        assertEquals("IMG", normalNameIsValidTagName());
    }

}