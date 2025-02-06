package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsKnownTag_ValidTagNameIsKnownReturnTrue {

    @Test
    public void isKnownTag_ValidTagNameIsKnownReturnTrue() {
        String tagName = "div";
        assertTrue(Tag.isKnownTag(tagName));
    }

}