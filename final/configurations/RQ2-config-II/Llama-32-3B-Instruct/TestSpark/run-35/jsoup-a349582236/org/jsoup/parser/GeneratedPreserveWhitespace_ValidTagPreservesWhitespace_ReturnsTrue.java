package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedPreserveWhitespace_ValidTagPreservesWhitespace_ReturnsTrue {

    @Test
    public void preserveWhitespace_ValidTagPreservesWhitespace_ReturnsTrue() {
        String tagName = "img";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.preserveWhitespace());
    }

}