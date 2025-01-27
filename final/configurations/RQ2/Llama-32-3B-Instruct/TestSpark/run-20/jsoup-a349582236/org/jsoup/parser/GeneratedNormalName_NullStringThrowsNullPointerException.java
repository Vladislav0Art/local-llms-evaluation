package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName_NullStringThrowsNullPointerException {

    @Test
    public void normalName_NullStringThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.normalName(null));
    }

}