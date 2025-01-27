package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsKnownTag_TagNameMatchesKnownTagName {

    @Test
    public void isKnownTag_TagNameMatchesKnownTagName() {
        assertTrue(Tag.isKnownTag("div"));
    }

}