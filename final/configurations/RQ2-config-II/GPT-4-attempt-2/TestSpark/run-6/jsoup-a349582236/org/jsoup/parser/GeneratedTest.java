package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
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
    public void valueOfWithSettingsTest() {
        ParseSettings ps = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("div", ps);
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("h1");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("h1");
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("span");
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
    public void staticIsKnownTagTest() {
        Assert.assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("button");
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("button");
        Assert.assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Assert.assertEquals(tag1, tag2);
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        int expectedHashCode = tag.getName().hashCode();
        Assert.assertEquals(expectedHashCode, tag.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.toString());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("div");
        Tag clonedTag = (Tag) tag.clone();
        Assert.assertEquals(tag, clonedTag);
    }

}