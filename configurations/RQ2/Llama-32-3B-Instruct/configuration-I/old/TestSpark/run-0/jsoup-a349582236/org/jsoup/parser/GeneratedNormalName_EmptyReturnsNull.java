package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedNormalName_EmptyReturnsNull {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void normalName_EmptyReturnsNull() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertEquals(null, tag.normalName());
    }

}