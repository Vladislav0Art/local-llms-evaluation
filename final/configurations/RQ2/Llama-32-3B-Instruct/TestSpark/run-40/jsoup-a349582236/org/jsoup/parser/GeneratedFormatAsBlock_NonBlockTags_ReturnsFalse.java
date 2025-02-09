package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedFormatAsBlock_NonBlockTags_ReturnsFalse {

    @Test
    public void formatAsBlock_NonBlockTags_ReturnsFalse() {
        String tagName = "span";
        assertFalse(Tag.valueOf(tagName).formatAsBlock());
    }

}