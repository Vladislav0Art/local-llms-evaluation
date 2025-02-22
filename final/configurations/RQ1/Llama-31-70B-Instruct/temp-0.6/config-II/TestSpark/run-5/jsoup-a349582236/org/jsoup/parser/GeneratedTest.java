package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testValueOfWhenValidTagName() {
        Tag tag = Tag.valueOf("p");
        Assert.assertEquals("p", tag.getName());
        Assert.assertFalse(tag.isBlock());
        Assert.assertTrue(tag.formatAsBlock());
        Assert.assertFalse(tag.isEmpty());
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertFalse(tag.preserveWhitespace());
        Assert.assertFalse(tag.isFormListed());
        Assert.assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void testValueOfWhenInvalidTagName() {
        Tag tag = Tag.valueOf("invalid");
        Assert.assertEquals("invalid", tag.getName());
        Assert.assertFalse(tag.isBlock());
        Assert.assertTrue(tag.formatAsBlock());
        Assert.assertFalse(tag.isEmpty());
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertFalse(tag.preserveWhitespace());
        Assert.assertFalse(tag.isFormListed());
        Assert.assertFalse(tag.isFormSubmittable());
    }

}