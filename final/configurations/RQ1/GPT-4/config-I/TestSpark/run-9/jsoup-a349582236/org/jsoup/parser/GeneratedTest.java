package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("DIV");
        Assert.assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfNullNameTest() {
        Tag.valueOf(null, ParseSettings.preserveCase);
    }

    @Test
    public void valueOfEmptyNameTest() {
        Tag.valueOf("", ParseSettings.preserveCase);
    }

    @Test
    public void valueOfPreserveCaseTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.preserveCase);
        Assert.assertEquals("DIV", tag.getName());
    }

    @Test
    public void valueOfLowercaseTagsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("title");
        Assert.assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("a");
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img");
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("img");
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStaticMethodTest() {
        Assert.assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Assert.assertTrue(tag.equals(tag2));
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.toString());
    }

}