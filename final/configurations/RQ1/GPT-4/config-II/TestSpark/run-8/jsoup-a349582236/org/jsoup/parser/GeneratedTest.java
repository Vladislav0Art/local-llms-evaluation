package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("P");
        Assert.assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfPreservCaseNullTagTest() {
        try {
            Tag.valueOf(null);
            Assert.fail("Should have thrown an Exception");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
    }

    @Test
    public void valueOfPreservCaseEmptyTagTest() {
        try {
            Tag.valueOf("");
            Assert.fail("Should have thrown an Exception");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
    }

    @Test
    public void valueOfKnownTagTest() {
        Tag tag = Tag.valueOf("html");
        Assert.assertEquals("html", tag.getName());
    }

    @Test
    public void valueOfUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        Assert.assertEquals("unknown", tag.getName());
    }

    @Test
    public void valueOfPreserveCaseKnownTagTest() {
        Tag tag = Tag.valueOf("HTML", ParseSettings.preserveCase);
        Assert.assertEquals("HTML", tag.getName());
    }

    @Test
    public void valueOfPreserveCaseUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown", ParseSettings.preserveCase);
        Assert.assertEquals("unknown", tag.getName());
    }

    @Test
    public void isBlockBlockTagTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockInlineTagTest() {
        Tag tag = Tag.valueOf("a");
        Assert.assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertTrue(tag.formatAsBlock());
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
        Tag tag = Tag.valueOf("html");
        Assert.assertTrue(tag.isKnownTag());
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

}