package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedValueOf_KnownTag_ReturnsTagObject {

    @Test
    public void valueOf_KnownTag_ReturnsTagObject() {
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
    }

}