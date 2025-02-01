package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("TestTagName");
        Assert.assertEquals("TestTagName", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("TestTagName");
        Assert.assertEquals("testtagname", tag.normalName());
    }

    @Test
    public void valueOfTagWithSettingsTest() {
        Tag tag = Tag.valueOf("Tag", ParseSettings.preserveCase);
        Assert.assertEquals("Tag", tag.getName());
    }

    @Test
    public void valueOfWithNullTagNameTest() {
        Tag.valueOf(null, ParseSettings.preserveCase);
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.isBlock());
        tag = new Tag("span");
        Assert.assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.formatAsBlock());
        tag = new Tag("span");
        Assert.assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("span");
        Assert.assertTrue(tag.isInline());
        tag = new Tag("div");
        Assert.assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("meta");
        Assert.assertTrue(tag.isEmpty());
        tag = new Tag("div");
        Assert.assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("meta");
        Assert.assertTrue(tag.isSelfClosing());
        tag = new Tag("div");
        Assert.assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.isKnownTag());
        tag = new Tag("nonExistingTag");
        Assert.assertFalse(tag.isKnownTag());
    }

    @Test
    public void valueOfTagWithoutSettingsTest() {
        Tag tag = Tag.valueOf("testTag");
        Assert.assertEquals("testtag", tag.normalName());
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.preserveWhitespace());
        tag = new Tag("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.isFormListed());
        tag = new Tag("button");
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.isFormSubmittable());
        tag = new Tag("button");
        Assert.assertTrue(tag.isFormSubmittable());
    }

}