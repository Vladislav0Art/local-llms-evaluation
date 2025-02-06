package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsKnownTag_ReturnsFalseForUnknownTags {

    @Test
    public void isKnownTag_ReturnsFalseForUnknownTags() {
        assertFalse(Tag.isKnownTag("unknown"));
    }

}