package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsInline_ValidTagIsInline_ReturnsTrue {

    @Test
    public void isInline_ValidTagIsInline_ReturnsTrue() {
        String tagName = "a";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isInline());
    }

}