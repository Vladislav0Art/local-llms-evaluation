package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void clonedTagShouldHaveSameName() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        Tag clonedTag = tag.clone();
        assertEquals(tagName, clonedTag.tagName);
    }

    @Test
    public void clonedTagShouldHaveSameIsBlockValue() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        tag.isBlock = true;
        Tag clonedTag = tag.clone();
        assertEquals(tag.isBlock, clonedTag.isBlock);
    }

    @Test
    public void clonedTagShouldHaveSameFormatAsBlockValue() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        tag.formatAsBlock = true;
        Tag clonedTag = tag.clone();
        assertEquals(tag.formatAsBlock, clonedTag.formatAsBlock);
    }

}