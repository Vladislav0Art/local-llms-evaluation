package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsBlock_NonBlockTags_ReturnsFalse {

    @Test
    public void isBlock_NonBlockTags_ReturnsFalse() {
        String tagName = "span";
        assertFalse(Tag.valueOf(tagName).isBlock());
    }

}