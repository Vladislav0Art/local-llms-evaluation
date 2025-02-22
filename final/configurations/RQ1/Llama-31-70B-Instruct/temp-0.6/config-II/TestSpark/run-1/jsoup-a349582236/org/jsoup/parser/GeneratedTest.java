package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void testConstructor() {
        String tagName = "testTagName";
        Tag actualTag = new Tag(tagName);
        Assert.assertEquals(tagName, actualTag.tagName);
        Assert.assertEquals(Normalizer.lowerCase(tagName), actualTag.normalName);
    }

    @Test
    public void testIsBlock() {
        Tag tag = new Tag("testTagName");
        tag.isBlock = false;
        Assert.assertFalse(tag.isBlock());
    }

    @Test
    public void testNormalName() {
        Tag tag = new Tag("testTagName");
        Assert.assertEquals("testtagname", tag.normalName());
    }

    @Test
    public void testIsEmpty() {
        Tag tag = new Tag("testTagName");
        tag.empty = true;
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        Tag tag = new Tag("testTagName");
        Assert.assertFalse(tag.isSelfClosing());
    }

}