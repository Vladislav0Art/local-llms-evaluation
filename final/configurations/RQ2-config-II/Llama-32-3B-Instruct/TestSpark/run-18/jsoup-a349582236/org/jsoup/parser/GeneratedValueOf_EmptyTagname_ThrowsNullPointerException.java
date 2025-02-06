package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedValueOf_EmptyTagname_ThrowsNullPointerException {

    @Test
    public void valueOf_EmptyTagname_ThrowsNullPointerException() {
        ParseSettings settings = new ParseSettings();
        assertThrows(NullPointerException.class, () -> Tag.valueOf("", settings));
    }

}