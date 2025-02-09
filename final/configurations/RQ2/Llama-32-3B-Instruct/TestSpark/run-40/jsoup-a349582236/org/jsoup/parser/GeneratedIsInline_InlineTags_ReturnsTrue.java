package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsInline_InlineTags_ReturnsTrue {

    @Test
    public void isInline_InlineTags_ReturnsTrue() {
        String tagName = "img";
        assertTrue(Tag.valueOf(tagName).isInline());
    }

}