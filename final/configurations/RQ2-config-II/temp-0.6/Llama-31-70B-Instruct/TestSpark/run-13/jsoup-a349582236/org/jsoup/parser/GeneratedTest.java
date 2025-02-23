package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private String tagName = "div";
    private String normalName = Normalizer.lowerCase(tagName);
    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag(tagName);
        tag.tagName = tagName;
        tag.normalName = normalName;
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals(tagName, tag.getName());
    }

    @Test
    public void normalNameTest() {
        Assert.assertEquals(normalName, tag.normalName());
    }

    @Test
    public void getNameTest_Null() {
        tag.tagName = null;
        Assert.assertNull(tag.getName());
    }

    @Test
    public void normalNameTest_Null() {
        tag.tagName = null;
        Assert.assertNull(tag.normalName());
    }

    @Test
    public void isBlockTest() {
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockTest_False() {
        tag.isBlock = false;
        Assert.assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlockTest_False() {
        tag.formatAsBlock = false;
        Assert.assertFalse(tag.formatAsBlock());
    }

}