package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsEmpty_DivTagIsNotEmpty {

    @Test
    public void isEmpty_DivTagIsNotEmpty() {
        assertFalse(Tag.isEmpty("div"));
    }

}