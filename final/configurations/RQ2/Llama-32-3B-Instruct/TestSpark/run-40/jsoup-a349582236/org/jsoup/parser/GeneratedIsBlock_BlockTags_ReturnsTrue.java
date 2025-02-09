package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsBlock_BlockTags_ReturnsTrue {

    @Test
    public void isBlock_BlockTags_ReturnsTrue() {
        String tagName = "div";
        assertTrue(Tag.valueOf(tagName).isBlock());
    }

}