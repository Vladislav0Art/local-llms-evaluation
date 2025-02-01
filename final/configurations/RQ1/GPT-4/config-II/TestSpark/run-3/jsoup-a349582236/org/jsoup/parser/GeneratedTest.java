package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("TagTestName");
        assertThat(tag.getName(), is("TagTestName"));
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("TagTestName");
        assertThat(tag.normalName(), is("tagtestname"));
    }

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("TagTestName", ParseSettings.preserveCase);
        assertThat(tag.getName(), is("TagTestName"));
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = Tag.valueOf("TagTestName");
        assertThat(tag.getName(), is("TagTestName"));
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("a");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag("input");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = new Tag("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = new Tag("TagTestName");
        Tag tag2 = new Tag("TagTestName");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void notEqualsTest() {
        Tag tag1 = new Tag("TagTestName");
        Tag tag2 = new Tag("DifferentTagTestName");
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void cloneTest() {
        Tag tag1 = new Tag("TagTestName");
        Tag tag2 = tag1.clone();
        assertThat(tag1, is(tag2));
    }

    @Test
    public void setSelfClosingTest() {
        Tag tag = new Tag("TagTestName");
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void toStringTest() {
        Tag tag = new Tag("TagTestName");
        String expected = "TagTestName";
        String actual = tag.toString();
        assertThat(actual, is(expected));
    }

}