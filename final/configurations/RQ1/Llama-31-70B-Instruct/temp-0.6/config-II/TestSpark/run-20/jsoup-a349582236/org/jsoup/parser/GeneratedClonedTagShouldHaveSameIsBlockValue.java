package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedClonedTagShouldHaveSameIsBlockValue {

    @Test
    public void clonedTagShouldHaveSameIsBlockValue() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        tag.isBlock = true;
        Tag clonedTag = tag.clone();
        assertEquals(tag.isBlock, clonedTag.isBlock);
    }

}