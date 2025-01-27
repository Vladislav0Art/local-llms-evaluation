package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName_EmptyStringReturnsEmptyString {

    @Test
    public void normalName_EmptyStringReturnsEmptyString() {
        assertEquals("", Tag.normalName(""));
    }

}