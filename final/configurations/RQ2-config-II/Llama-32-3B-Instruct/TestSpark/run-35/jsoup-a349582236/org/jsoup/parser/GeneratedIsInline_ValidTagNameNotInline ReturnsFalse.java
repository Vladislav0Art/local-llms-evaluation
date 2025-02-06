package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsInline_ValidTagNameNotInline ReturnsFalse {

    @Test
    public void isInline_ValidTagNameNotInline

    ReturnsFalse() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isInline());
    }

}