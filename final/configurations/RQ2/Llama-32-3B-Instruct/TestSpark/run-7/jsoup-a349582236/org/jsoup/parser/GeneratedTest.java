package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void getNameDefault() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

    @Test
    public void getNameSet() {
        Tag tag = new Tag();
        tag.setName("test");
        assertEquals("test", tag.getName());
    }

    @Test
    public void normalNameNoNormalization() {
        Tag tag = new Tag();
        tag.setName("test");
        String result = tag.normalName();
        assertNotNull(result);
        assertFalse(result.equals(tag.getName()));
    }

    @Test
    public void normalNameWithNormalization() {
        Tag tag = new Tag();
        tag.setName("test");
        tag.normalName(); // Normalize the string
        String result = tag.normalName();
        assertNotNull(result);
        assertEquals("test", result);
    }

    @Test
    public void valueOfUnknownTag() {
        assertFalse(Tag.valueOf("unknown").isKnownTag());
    }

    @Test
    public void valueOfKnownTag() {
        assertTrue(Tag.valueOf("div").isKnownTag());
    }

    @Test
    public void isBlockDefault() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlock() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
        tag.setSelfClosing();
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineDefault() {
        Tag tag = new Tag();
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyDefault() {
        Tag tag = new Tag();
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingDefault() {
        Tag tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagNoMocking() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void isFormListedUnknownTag() {
        assertFalse(Tag.isFormListed("unknown"));
    }

    @Test
    public void isFormSubmittableUnknownTag() {
        assertFalse(Tag.isFormSubmittable("unknown"));
    }

    @Test
    public void setSelfClosingNoMocking() {
        Tag tag = new Tag();
        assertTrue(tag.setSelfClosing());
    }

    @Test
    public void cloneDefault() {
        Tag original = new Tag();
        Tag copy = (Tag) original.clone();
        assertNotEquals(original, copy);
    }

}