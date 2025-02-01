package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("tag_name");
        Assert.assertEquals("tag_name", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("Tag_Name");
        Assert.assertEquals("tag_name", tag.normalName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("p");
        Assert.assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("p");
        Assert.assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("a");
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("img");
        Assert.assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("img");
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag("p");
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void staticIsKnownTagTest() {
        Assert.assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag("input");
        Assert.assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = new Tag("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void valueOfWithSettingsTest() {
        Validate.notNull("span");
        Tag tag = Tag.valueOf("span", ParseSettings.preserveCase);
        // testing the settings preserve case
        Assert.assertNotEquals(tag.normalName(), tag.getName());
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        Validate.notNull("span");
        Tag tag = Tag.valueOf("SPAN");
        // testing the settings do not preserve case
        Assert.assertEquals(tag.normalName(), tag.getName());
    }

    @Test
    public void valueOfTagIsNullTest() {
        try {
            Tag tag = Tag.valueOf(null, ParseSettings.preserveCase);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("tagName must not be null.", e.getMessage());
        }
    }

    @Test
    public void cloneTest() {
        Tag originalTag = new Tag("p");
        Tag clonedTag = originalTag.clone();
        Assert.assertEquals(originalTag, clonedTag);
    }

    @Test
    public void equalsTest() {
        Tag tag1 = new Tag("p");
        Tag tag2 = new Tag("p");

        Assert.assertEquals(tag1, tag2);
    }

    @Test
    public void notEqualsTest() {
        Tag tag1 = new Tag("p");
        Tag tag2 = new Tag("a");

        Assert.assertNotEquals(tag1, tag2);
    }

    @Test
    public void toStringTest() {
        Tag tag = new Tag("p");
        Assert.assertEquals("p", tag.toString());
    }

    @Test
    public void hashCodeTest() {
        Tag tag = new Tag("html");
        int hashCode = tag.hashCode();
        Assert.assertEquals(hashCode, tag.hashCode());
    }

}