package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName_ValidTagName_ReturnsNormalizedName {

    @Test
    public void normalName_ValidTagName_ReturnsNormalizedName() {
        String tagName = "div";
        assertEquals("div", Tag.valueOf(tagName).normalName());
    }

}