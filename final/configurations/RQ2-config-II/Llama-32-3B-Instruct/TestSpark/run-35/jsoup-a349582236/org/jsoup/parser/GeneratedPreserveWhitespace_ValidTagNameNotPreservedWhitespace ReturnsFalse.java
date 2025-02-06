package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedPreserveWhitespace_ValidTagNameNotPreservedWhitespace ReturnsFalse {

    @Test
    public void preserveWhitespace_ValidTagNameNotPreservedWhitespace

    ReturnsFalse() {
        String tagName = "a";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.preserveWhitespace());
    }

}