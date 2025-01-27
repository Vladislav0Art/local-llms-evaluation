package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedGetName_NullStringThrowsNullPointerException {

    @Test
    public void getName_NullStringThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.getName(null));
    }

}