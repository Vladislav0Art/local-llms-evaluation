package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedIsBlock_EmptyReturnsFalse {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isBlock_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.isBlock());
    }

}