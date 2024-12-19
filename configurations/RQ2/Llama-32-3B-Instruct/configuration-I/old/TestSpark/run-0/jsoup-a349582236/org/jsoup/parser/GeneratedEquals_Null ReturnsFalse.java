package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedEquals_Null ReturnsFalse {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void equals_Null

    ReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.equals(null));
    }

}