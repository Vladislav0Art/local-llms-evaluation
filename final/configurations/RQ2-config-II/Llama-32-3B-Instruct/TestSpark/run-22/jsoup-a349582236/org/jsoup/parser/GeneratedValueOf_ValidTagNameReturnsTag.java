package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_ValidTagNameReturnsTag {

    @Test
    public void valueOf_ValidTagNameReturnsTag() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("tagName", settings);
        assertNotNull(tag);
    }

}