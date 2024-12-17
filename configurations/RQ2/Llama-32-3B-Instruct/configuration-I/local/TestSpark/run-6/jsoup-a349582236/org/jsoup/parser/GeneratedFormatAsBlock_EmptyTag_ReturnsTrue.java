package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFormatAsBlock_EmptyTag_ReturnsTrue {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void formatAsBlock_EmptyTag_ReturnsTrue() {
        tag.setSelfClosing(true);
        boolean result = tag.formatAsBlock();
        org.junit.Assert.assertTrue(result);
    }

}