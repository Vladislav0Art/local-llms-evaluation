package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedTest {

    @Test
    public void getNameInitializedObjectTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("DIV");
        Assert.assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfTagNameSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.htmlDefault);
        Assert.assertTrue(tag instanceof Tag);
    }

    @Test
    public void valueOfTagNameTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertTrue(tag instanceof Tag);
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("span");
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("br");
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("meta");
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagObjectTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStringTest() {
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
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Assert.assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        int hashCode = tag.hashCode();
        Assert.assertTrue(hashCode != 0);
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        String stringRepresentation = tag.toString();
        Assert.assertTrue(stringRepresentation.contains("div"));
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = tag1.clone();
        Assert.assertTrue(tag1 != tag2 && tag1.equals(tag2));
    }

}