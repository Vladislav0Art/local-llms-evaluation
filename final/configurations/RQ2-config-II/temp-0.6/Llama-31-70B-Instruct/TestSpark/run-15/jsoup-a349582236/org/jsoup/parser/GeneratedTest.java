package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private static final String DEFAULT_TAG_NAME = "div";
    private static final String DEFAULT_NORMAL_NAME = "DIV";
    private static final ParseSettings DEFAULT_PARSE_SETTINGS = ParseSettings.htmlDefault;

    // Test for getName() method

    @Test
    public void getNameTest() {
        Tag tag = new Tag(DEFAULT_TAG_NAME);
        assertEquals(DEFAULT_TAG_NAME, tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag(DEFAULT_TAG_NAME);
        assertEquals(DEFAULT_NORMAL_NAME, tag.normalName());
    }

    @Test
    public void valueOfStringParseSettingsTest() {
        Tag tag = Tag.valueOf(DEFAULT_TAG_NAME, DEFAULT_PARSE_SETTINGS);
        assertEquals(DEFAULT_TAG_NAME, tag.getName());
    }

    @Test
    public void valueOfStringTest() {
        Tag tag = Tag.valueOf(DEFAULT_TAG_NAME);
        assertEquals(DEFAULT_TAG_NAME, tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag(DEFAULT_TAG_NAME);
        assertEquals(false, tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag(DEFAULT_TAG_NAME);
        assertEquals(false, tag.formatAsBlock());
    }

}