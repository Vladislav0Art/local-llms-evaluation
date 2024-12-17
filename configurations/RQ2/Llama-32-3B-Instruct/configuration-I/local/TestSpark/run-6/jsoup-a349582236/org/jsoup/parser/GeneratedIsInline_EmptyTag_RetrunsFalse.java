package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInline_EmptyTag_RetrunsFalse {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void isInline_EmptyTag_RetrunsFalse() {
        tag.setSelfClosing(false);
        boolean result = tag.isInline();
        org.junit.Assert.assertFalse(result);
    }

}