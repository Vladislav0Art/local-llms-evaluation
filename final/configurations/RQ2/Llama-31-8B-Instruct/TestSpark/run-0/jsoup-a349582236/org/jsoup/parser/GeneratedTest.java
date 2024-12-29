package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getName_ReturnsTagNameTest() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void getName_ReturnsEmptyStringTest() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

    @Test
    public void normalName_ReturnsTagNameTest() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void normalName_ReturnsEmptyStringTest() {
        Tag tag = new Tag();
        assertEquals("", tag.normalName());
    }

    @Test
    public void valueOf_TagNameAndSettings_ReturnsTagTest() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("div", settings);
        assertEquals("div", tag.getName());
    }

    @Test
    public void valueOf_TagName_ReturnsTagTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void isBlock_ReturnsTrueTest() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlock_ReturnsFalseTest() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlock_ReturnsTrueTest() {
        Tag tag = new Tag("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlock_ReturnsFalseTest() {
        Tag tag = new Tag("span");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInline_ReturnsTrueTest() {
        Tag tag = new Tag("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void isInline_ReturnsFalseTest() {
        Tag tag = new Tag("p");
        assertFalse(tag.isInline());
    }

}