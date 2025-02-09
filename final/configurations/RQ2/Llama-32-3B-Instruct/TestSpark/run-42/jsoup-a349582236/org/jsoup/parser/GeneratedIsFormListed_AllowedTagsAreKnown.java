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
public class GeneratedIsFormListed_AllowedTagsAreKnown {

    @Mock
    private ParseSettings parseSettings;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isFormListed_AllowedTagsAreKnown() {
        when(parseSettings.getAllowedTags()).thenReturn(new String[]{"form", "input"});
        assertTrue(Tag.valueOf("form").isFormListed());
    }

}