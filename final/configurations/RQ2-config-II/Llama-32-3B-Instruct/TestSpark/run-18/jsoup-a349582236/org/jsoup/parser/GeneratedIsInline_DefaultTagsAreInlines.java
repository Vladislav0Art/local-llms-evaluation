package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsInline_DefaultTagsAreInlines {

    @Test
    public void isInline_DefaultTagsAreInlines() {
        assertTrue(Tag.isInline("span"));
        assertFalse(Tag.isInline("table"));
    }

}