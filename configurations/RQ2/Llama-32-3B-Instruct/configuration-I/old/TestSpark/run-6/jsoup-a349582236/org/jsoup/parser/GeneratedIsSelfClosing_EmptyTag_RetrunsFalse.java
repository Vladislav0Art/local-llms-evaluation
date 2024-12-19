package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSelfClosing_EmptyTag_RetrunsFalse {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void isSelfClosing_EmptyTag_RetrunsFalse() {
        tag.setSelfClosing(false);
        boolean result = tag.isSelfClosing();
        org.junit.Assert.assertFalse(result);
    }

}