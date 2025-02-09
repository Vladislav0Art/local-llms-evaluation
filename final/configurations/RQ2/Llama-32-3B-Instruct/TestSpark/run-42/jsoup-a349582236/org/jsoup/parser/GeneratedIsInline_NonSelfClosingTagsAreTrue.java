package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInline_NonSelfClosingTagsAreTrue {

    @Mock
    private ParseSettings parseSettings;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isInline_NonSelfClosingTagsAreTrue() {
        when(parseSettings.isSelfClosing()).thenReturn(false);
        assertTrue(Tag.valueOf("div").isInline());
    }

}