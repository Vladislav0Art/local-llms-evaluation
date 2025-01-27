package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyTagName_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        String tagName = "";
        assertTrue(Tag.valueOf(tagName).isEmpty());
    }

}