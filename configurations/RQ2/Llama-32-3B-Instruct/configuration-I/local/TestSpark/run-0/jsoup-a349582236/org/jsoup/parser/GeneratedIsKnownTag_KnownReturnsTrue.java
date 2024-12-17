package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedIsKnownTag_KnownReturnsTrue {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isKnownTag_KnownReturnsTrue() {
        setup();
        Tag result = Tag.valueOf("p", parseSettings);
        assertTrue(result.isKnownTag());
    }

}