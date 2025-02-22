package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        Tag tag = mock(Tag.class);
        String normalName = "div";
        when(tag.normalName()).thenReturn(normalName);
        Assert.assertEquals(normalName, tag.normalName());
    }

}