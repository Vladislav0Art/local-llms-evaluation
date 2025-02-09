package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsInline_NonInlineTags_ReturnsFalse {

    @Test
    public void isInline_NonInlineTags_ReturnsFalse() {
        String tagName = "div";
        assertFalse(Tag.valueOf(tagName).isInline());
    }

}