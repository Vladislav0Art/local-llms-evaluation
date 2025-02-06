package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsEmpty_ValidTagIsEmpty_ReturnsTrue {

    @Test
    public void isEmpty_ValidTagIsEmpty_ReturnsTrue() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isEmpty());
    }

}