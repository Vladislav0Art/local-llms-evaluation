package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedTest {

    @Test
    public void getName[
    NullInput]

    Test() {
        Tag tag = Tag.valueOf(null);
        Assert.assertEquals("", tag.getName());
    }

    @Test
    public void normalName[
    DefaultTag]

    Test() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOf[
    ValidInput]

    Test() {
        Tag tag = Tag.valueOf("p", ParseSettings.htmlDefault());
        Assert.assertEquals("p", tag.getName());
    }

    @Test
    public void isBlock[
    BlockTag]

    Test() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlock[
    InlineTag]

    Test() {
        Tag tag = Tag.valueOf("span");
        Assert.assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInline[
    InlineTag]

    Test() {
        Tag tag = Tag.valueOf("span");
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty[
    AlmostEqualTag]

    Test() {
        Tag tag = Tag.valueOf("img");
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosing[
    NormalTag]

    Test() {
        Tag tag = Tag.valueOf("div");
        Assert.assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag[
    KnownTag]

    Test() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTag[
    UnknownTag]

    Test() {
        Assert.assertFalse(Tag.isKnownTag("unknownTag"));
    }

    @Test
    public void preserveWhitespace[
    PreservedWhitespaceTag]

    Test() {
        Tag tag = Tag.valueOf("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListed[
    FormListedTag]

    Test() {
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittable[
    FormSubmittableTag]

    Test() {
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosing[
    SelfClosingTag]

    Test() {
        Tag tag = Tag.valueOf("img");
        Assert.assertTrue(tag.setSelfClosing().isSelfClosing());
    }

    @Test
    public void equals[
    EqualTags]

    Test() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        Assert.assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCode[
    EqualTags]

    Test() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        Assert.assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void toString[
    ValidTag]

    Test() {
        Tag tag = Tag.valueOf("p");
        Assert.assertEquals("<p>", tag.toString());
    }

    @Test
    public void clone[
    ValidTag]

    Test() {
        Tag tag = Tag.valueOf("p");
        Tag clonedTag = tag.clone();
        Assert.assertNotSame(tag, clonedTag);
        Assert.assertEquals(tag, clonedTag);
    }

}