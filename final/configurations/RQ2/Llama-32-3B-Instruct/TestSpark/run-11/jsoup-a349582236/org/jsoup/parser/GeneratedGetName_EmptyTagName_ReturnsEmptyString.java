package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        String tagName = "";
        assertEquals("", Tag.valueOf(tagName).getName());
    }

}