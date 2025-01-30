package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class GeneratedTest {

    @Test
    public void getNameAndNormalNameTest() throws Exception {
        Tag tag = Tag.valueOf("SomeTagWithSettings", ParseSettings.htmlDefault);
        Assert.assertEquals("sometagwithsettings", tag.normalName());
    }

    @Test
    public void valueOfWithSettingsEmptyTagNameTest() throws Exception {
        Tag.valueOf("", ParseSettings.htmlDefault);
    }

    @Test
    public void isBlockAndFormatAsBlockTest() throws Exception {
        Tag tag = Tag.valueOf("pre", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isBlock());
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("a", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("img", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() throws NoSuchFieldException, IllegalAccessException {
        Tag tag = Tag.valueOf("br", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("button", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("button", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isFormSubmittable());
    }

}