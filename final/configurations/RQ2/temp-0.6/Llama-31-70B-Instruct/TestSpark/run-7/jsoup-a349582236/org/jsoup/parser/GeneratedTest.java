package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("p");
        Assert.assertEquals("p", tag.getName());
    }

    @Test
    public void getNameTest_Invalid() {
        Tag tag = new Tag("");
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("p");
        Assert.assertEquals("p", tag.normalName());
    }

    @Test
    public void normalNameTest_Invalid() {
        Tag tag = new Tag("");
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("p", new ParseSettings());
        Assert.assertEquals("p", tag.getName());
    }

    @Test
    public void valueOfTest_Invalid() {
        Tag tag = Tag.valueOf("", new ParseSettings());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p", new ParseSettings());
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p", new ParseSettings());
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("p", new ParseSettings());
        Assert.assertFalse(tag.isInline());
    }

}