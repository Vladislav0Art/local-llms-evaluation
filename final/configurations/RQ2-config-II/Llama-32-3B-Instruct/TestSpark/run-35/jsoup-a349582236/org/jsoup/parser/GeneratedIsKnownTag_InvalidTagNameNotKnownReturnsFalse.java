package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsKnownTag_InvalidTagNameNotKnownReturnsFalse {

    @Test
    public void isKnownTag_InvalidTagNameNotKnownReturnsFalse() {
        String tagName = "unknown";
        assertFalse(Tag.isKnownTag(tagName));
    }

}