package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getNameTest() throws Exception {
        Tag tag = new Tag("P");
        assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameTest() throws Exception {
        Tag tag = new Tag("P");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfWithSettingsTest() throws Exception {
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag tag = Tag.valueOf("P", settings);
        assertEquals("p", tag.getName());
    }

    @Test
    public void valueOfWithoutSettingsTest() throws Exception {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.getName());
    }

    @Test
    public void isBlockTest() throws Exception {
        Tag tag = new Tag("P");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() throws Exception {
        Tag tag = new Tag("P");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() throws Exception {
        Tag tag = new Tag("P");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() throws Exception {
        Tag tag = new Tag("P");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() throws Exception {
        Tag tag = new Tag("P");
        assertTrue(tag.isSelfClosing());
    }

}