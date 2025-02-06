package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedGetName_ValidTagName_ReturnsTagName {

    @Test
    public void getName_ValidTagName_ReturnsTagName() {
        String tagName = "div";
        assertEquals(tagName, Tag.valueOf(tagName).getName());
    }

}