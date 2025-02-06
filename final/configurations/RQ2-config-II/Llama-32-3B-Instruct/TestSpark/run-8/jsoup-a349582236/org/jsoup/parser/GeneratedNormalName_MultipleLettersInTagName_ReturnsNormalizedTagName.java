package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.Tag;

public class GeneratedNormalName_MultipleLettersInTagName_ReturnsNormalizedTagName {

    @Test
    public void normalName_MultipleLettersInTagName_ReturnsNormalizedTagName() {
        String tagName = "hello-world";
        assertEquals("hello-world", Tag.valueOf(tagName).normalName());
    }

}