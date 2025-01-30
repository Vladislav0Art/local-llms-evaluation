package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNameRegularInstanceInitialisedWithNameValueTest() {
        Tag tag = Tag.valueOf("html");
        Assert.assertEquals("html", tag.getName());
    }

    @Test
    public void valueOfNullTagNameTest() {
        Tag.valueOf(null);
    }

    @Test
    public void valueOfEmptyTagNameWithSettingsTest() {
        Tag.valueOf("", new ParseSettings(true, true));
    }

    @Test
    public void valueOfNonExistentTagNameWithPreserveCaseSettingsTest() {
        Tag tag = Tag.valueOf("nonexistenttag", ParseSettings.preserveCase);
        Assert.assertEquals("nonexistenttag", tag.getName());
        Assert.assertFalse(tag.isBlock());
    }

    @Test
    public void isBlockForBlockTagPTest() {
        Assert.assertTrue(Tag.valueOf("p").isBlock());
    }

    @Test
    public void isBlockForInlineTagSpanTest() {
        Assert.assertFalse(Tag.valueOf("span").isBlock());
    }

    @Test
    public void formatAsBlockForRegularTagHtmlTest() {
        Assert.assertTrue(Tag.valueOf("html").formatAsBlock());
    }

    @Test
    public void isInlineForInlineTagFontTest() {
        Assert.assertTrue(Tag.valueOf("font").isInline());
    }

    @Test
    public void isInlineForNonInlineTagBodyTest() {
        Assert.assertFalse(Tag.valueOf("body").isInline());
    }

    @Test
    public void isEmptyForEmptyTagImgTest() {
        Assert.assertTrue(Tag.valueOf("img").isEmpty());
    }

    @Test
    public void isEmptyForNonEmptyTagHtmlTest() {
        Assert.assertFalse(Tag.valueOf("html").isEmpty());
    }

    @Test
    public void isSelfClosingForSelfClosingTagMetaTest() {
        Assert.assertTrue(Tag.valueOf("meta").isSelfClosing());
    }

    @Test
    public void isSelfClosingForNonSelfClosingTagBodyTest() {
        Assert.assertFalse(Tag.valueOf("body").isSelfClosing());
    }

    @Test
    public void isKnownTagForKnownTagHeadTest() {
        Assert.assertTrue(Tag.valueOf("head").isKnownTag());
    }

    @Test
    public void isKnownTagForUnknownTagStoryTest() {
        Assert.assertFalse(Tag.isKnownTag("story"));
    }

    @Test
    public void preserveWhitespaceForTagPreservingWhitespacePreTest() {
        Assert.assertTrue(Tag.valueOf("pre").preserveWhitespace());
    }

    @Test
    public void preserveWhitespaceForTagNotPreservingWhitespaceDivTest() {
        Assert.assertFalse(Tag.valueOf("div").preserveWhitespace());
    }

    @Test
    public void isFormListedForTagListedInFormSelectTest() {
        Assert.assertTrue(Tag.valueOf("select").isFormListed());
    }

    @Test
    public void isFormListedForTagNotListedInFormDdTest() {
        Assert.assertFalse(Tag.valueOf("dd").isFormListed());
    }

    @Test
    public void isFormSubmittableForTagSubmittableWithFormInputTest() {
        Assert.assertTrue(Tag.valueOf("input").isFormSubmittable());
    }

    @Test
    public void isFormSubmittableForTagNotSubmittableWithFormButtonTest() {
        Assert.assertFalse(Tag.valueOf("button").isFormSubmittable());
    }

}