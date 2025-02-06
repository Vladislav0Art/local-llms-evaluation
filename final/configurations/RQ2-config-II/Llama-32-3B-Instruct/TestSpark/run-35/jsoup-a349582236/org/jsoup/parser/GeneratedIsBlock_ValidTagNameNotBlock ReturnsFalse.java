package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsBlock_ValidTagNameNotBlock ReturnsFalse {

    @Test
    public void isBlock_ValidTagNameNotBlock

    ReturnsFalse() {
        String tagName = "img";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isBlock());
    }

}