package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.Tag;

public class GeneratedNormalName_OnlyLetterInTagName_ReturnsOriginalTagName {

    @Test
    public void normalName_OnlyLetterInTagName_ReturnsOriginalTagName() {
        String tagName = "a";
        assertEquals("a", Tag.valueOf(tagName).normalName());
    }

}