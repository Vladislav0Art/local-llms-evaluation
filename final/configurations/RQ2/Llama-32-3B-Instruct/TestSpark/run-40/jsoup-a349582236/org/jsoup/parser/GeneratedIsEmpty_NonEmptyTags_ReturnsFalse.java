package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsEmpty_NonEmptyTags_ReturnsFalse {

    @Test
    public void isEmpty_NonEmptyTags_ReturnsFalse() {
        String tagName = "img";
        assertFalse(Tag.valueOf(tagName).isEmpty());
    }

}