package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsKnownTag_NullStringDoesNotMatchAnyKnownTag {

    @Test
    public void isKnownTag_NullStringDoesNotMatchAnyKnownTag() {
        assertFalse(Tag.isKnownTag(null));
    }

}