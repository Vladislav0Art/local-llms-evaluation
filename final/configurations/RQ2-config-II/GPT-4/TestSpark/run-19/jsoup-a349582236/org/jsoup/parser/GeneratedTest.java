package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedTest {

    @Test
    public void getNameValidInputTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("DIV");
        Assert.assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfWithParseSettingsTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.htmlDefault);
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void isBlockTrueTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockFalseTest() {
        Tag tag = Tag.valueOf("span");
        Assert.assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTrueTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTrueTest() {
        Tag tag = Tag.valueOf("b");
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTrueTest() {
        Tag tag = Tag.valueOf("img");
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        Tag tag = Tag.valueOf("span");
        Assert.assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTrueTest() {
        Tag tag = Tag.valueOf("hr");
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isSelfClosingFalseTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTrueTest() {
        Assert.assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void isKnownTagFalseTest() {
        Assert.assertFalse(Tag.isKnownTag("unknownTag"));
    }

    @Test
    public void preserveWhitespaceTrueTest() {
        Tag tag = Tag.valueOf("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTrueTest() {
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTrueTest() {
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("div").setSelfClosing();
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTrueTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Assert.assertEquals(tag1, tag2);
    }

    @Test
    public void equalsFalseTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("span");
        Assert.assertNotEquals(tag1, tag2);
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("div");
        Tag cloneTag = tag.clone();
        Assert.assertEquals(tag, cloneTag);
    }

}