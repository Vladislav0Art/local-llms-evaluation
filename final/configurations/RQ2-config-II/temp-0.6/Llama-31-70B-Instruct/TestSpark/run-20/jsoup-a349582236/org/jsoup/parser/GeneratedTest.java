package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag();
        assertEquals(tag.getName(), "");
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag();
        assertEquals(tag.normalName(), "");
    }

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = new Tag();
        assertNull(tag.valueOf("tag", null));
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = new Tag();
        assertNull(tag.valueOf("tag"));
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag();
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag();
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag();
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isKnownTagWithStringTest() {
        Tag tag = new Tag();
        assertFalse(tag.isKnownTag(""));
    }

}