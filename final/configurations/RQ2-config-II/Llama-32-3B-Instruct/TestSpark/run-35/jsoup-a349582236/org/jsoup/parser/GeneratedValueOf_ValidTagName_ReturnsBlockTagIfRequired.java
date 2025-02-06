package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedValueOf_ValidTagName_ReturnsBlockTagIfRequired {

    @Test
    public void valueOf_ValidTagName_ReturnsBlockTagIfRequired() {
        String tagName = "img";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isInline());
    }

}