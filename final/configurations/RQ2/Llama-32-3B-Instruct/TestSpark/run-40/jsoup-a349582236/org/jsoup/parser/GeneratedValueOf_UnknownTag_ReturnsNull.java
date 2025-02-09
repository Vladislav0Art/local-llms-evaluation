package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedValueOf_UnknownTag_ReturnsNull {

    @Test
    public void valueOf_UnknownTag_ReturnsNull() {
        String tagName = "unknown";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertNull(tag);
    }

}