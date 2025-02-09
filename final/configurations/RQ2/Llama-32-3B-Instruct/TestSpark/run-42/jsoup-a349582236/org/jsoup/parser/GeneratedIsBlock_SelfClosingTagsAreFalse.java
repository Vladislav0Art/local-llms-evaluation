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
public class GeneratedIsBlock_SelfClosingTagsAreFalse {

    @Mock
    private ParseSettings parseSettings;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isBlock_SelfClosingTagsAreFalse() {
        when(parseSettings.isSelfClosing()).thenReturn(true);
        assertFalse(Tag.valueOf("img").isBlock());
    }

}