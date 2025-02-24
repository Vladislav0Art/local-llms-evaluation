package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Tag tag;

    @Test
    public void getNameTest() {
        when(tag.getName()).thenReturn("div");
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        when(tag.normalName()).thenReturn("div");
        Assert.assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfTest() {
        when(tag.valueOf("div")).thenReturn(tag);
        Assert.assertEquals(tag, tag.valueOf("div"));
    }

    @Test
    public void isBlockTest() {
        when(tag.isBlock()).thenReturn(true);
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        when(tag.formatAsBlock()).thenReturn(true);
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        when(tag.isInline()).thenReturn(true);
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        when(tag.isEmpty()).thenReturn(true);
        Assert.assertTrue(tag.isEmpty());
    }

}