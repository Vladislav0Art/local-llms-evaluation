package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("div");
        String expectedName = "div";
        String actualName = tag.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("DIV");
        String expectedNormalName = "div";
        String actualNormalName = tag.normalName();
        Assert.assertEquals(expectedNormalName, actualNormalName);
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("div");
        String expectedName = "div";
        String actualName = tag.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.toLowerCase);
        String expectedNormalName = "div";
        String actualNormalName = tag.normalName();
        Assert.assertEquals(expectedNormalName, actualNormalName);
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("p");
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("span");
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("meta");
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("br");
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        String tagName = "p";
        boolean knownTag = Tag.isKnownTag(tagName);
        Assert.assertTrue(knownTag);
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag("button");
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = new Tag("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag = new Tag("div");
        Tag anotherTag = new Tag("div");
        Assert.assertTrue(tag.equals(anotherTag));
    }

    @Test
    public void toStringTest() {
        Tag tag = new Tag("Div");
        String expectedOutput = "Div";
        String actualOutput = tag.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}