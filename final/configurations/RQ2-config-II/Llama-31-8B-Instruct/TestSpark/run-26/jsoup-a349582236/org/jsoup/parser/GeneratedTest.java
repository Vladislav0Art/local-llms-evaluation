package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getName_ReturnsTagName_ReturnsTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void getName_ReturnsNull_ThrowsNullPointerException() {
        Tag tag = null;
        try {
            tag.getName();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void normalName_ReturnsNormalizedName_ReturnsNormalizedName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void normalName_ReturnsNull_ThrowsNullPointerException() {
        Tag tag = null;
        try {
            tag.normalName();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void valueOf_TagNameAndSettings_ReturnsTag() {
        Tag tag = Tag.valueOf("div", new ParseSettings());
        assertNotNull(tag);
    }

    @Test
    public void valueOf_TagName_ReturnsTag() {
        Tag tag = Tag.valueOf("div");
        assertNotNull(tag);
    }

    @Test
    public void isBlock_ReturnsTrue_ReturnsTrue() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlock_ReturnsFalse_ReturnsFalse() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlock_ReturnsTrue_ReturnsTrue() {
        Tag tag = new Tag("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlock_ReturnsFalse_ReturnsFalse() {
        Tag tag = new Tag("span");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInline_ReturnsTrue_ReturnsTrue() {
        Tag tag = new Tag("span");
        assertTrue(tag.isInline());
    }

}