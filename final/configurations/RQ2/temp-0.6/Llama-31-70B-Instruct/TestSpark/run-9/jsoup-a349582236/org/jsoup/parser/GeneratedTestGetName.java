package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        Tag tag = mock(Tag.class);
        String tagName = "div";
        when(tag.getName()).thenReturn(tagName);
        Assert.assertEquals(tagName, tag.getName());
    }

}