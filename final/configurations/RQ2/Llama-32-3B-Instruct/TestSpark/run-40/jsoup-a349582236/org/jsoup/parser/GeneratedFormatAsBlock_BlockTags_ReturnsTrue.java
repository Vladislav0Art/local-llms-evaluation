package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedFormatAsBlock_BlockTags_ReturnsTrue {

    @Test
    public void formatAsBlock_BlockTags_ReturnsTrue() {
        String tagName = "div";
        assertTrue(Tag.valueOf(tagName).formatAsBlock());
    }

}