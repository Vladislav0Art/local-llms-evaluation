package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_tagName {

    @Test
    public void valueOf_tagName() {
        String tagName = "div";
        ParseSettings settings = null;
        Tag result = Tag.valueOf(tagName, settings);
        assertNotNull(result);
        assertEquals(tagName, result.getName());
    }

}