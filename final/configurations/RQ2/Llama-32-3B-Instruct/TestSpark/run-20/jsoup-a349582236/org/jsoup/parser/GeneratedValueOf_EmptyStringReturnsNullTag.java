package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedValueOf_EmptyStringReturnsNullTag {

    @Test
    public void valueOf_EmptyStringReturnsNullTag() {
        assertNull(Tag.valueOf(""));
    }

}