package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testGetName() {
        Tag tag = mock(Tag.class);
        String tagName = "div";
        when(tag.getName()).thenReturn(tagName);
        Assert.assertEquals(tagName, tag.getName());
    }

    @Test
    public void testNormalName() {
        Tag tag = mock(Tag.class);
        String normalName = "div";
        when(tag.normalName()).thenReturn(normalName);
        Assert.assertEquals(normalName, tag.normalName());
    }

    @Test
    public void testIsBlock() {
        Tag tag = mock(Tag.class);
        when(tag.isBlock()).thenReturn(true);
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        Tag tag = mock(Tag.class);
        when(tag.formatAsBlock()).thenReturn(true);
        Assert.assertTrue(tag.formatAsBlock());
    }

}