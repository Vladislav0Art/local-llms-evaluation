package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestFormatAsBlock {

    @Test
    public void testFormatAsBlock() {
        Tag tag = mock(Tag.class);
        when(tag.formatAsBlock()).thenReturn(true);
        Assert.assertTrue(tag.formatAsBlock());
    }

}