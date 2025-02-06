package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsBlock_DefaultTagsAreBlocks {

    @Test
    public void isBlock_DefaultTagsAreBlocks() {
        assertTrue(Tag.isBlock("a"));
        assertFalse(Tag.isBlock("img"));
    }

}